import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class DataConverter extends JFrame {
    
    // GUI Components
    private JTextField inputField;
    private JComboBox<String> fromUnitComboBox;
    private JComboBox<String> toUnitComboBox;
    private JTextArea resultArea;
    private JButton convertButton;
    private JButton clearButton;
    private JButton swapButton;
    
    // Conversion factors relative to bytes (JEDEC standard - binary)
    private static final double BITS_TO_BYTES = 1.0 / 8.0;
    private static final double BYTES_TO_BYTES = 1.0;
    private static final double KILOBYTES_TO_BYTES = 1024.0;
    private static final double MEGABYTES_TO_BYTES = 1024.0 * 1024.0;
    private static final double GIGABYTES_TO_BYTES = 1024.0 * 1024.0 * 1024.0;
    private static final double TERABYTES_TO_BYTES = 1024.0 * 1024.0 * 1024.0 * 1024.0;
    private static final double PETABYTES_TO_BYTES = 1024.0 * 1024.0 * 1024.0 * 1024.0 * 1024.0;
    
    // Number formatting
    private DecimalFormat standardFormat;
    private DecimalFormat scientificFormat;

    /**
     * Constructor - initializes the application
     */
    public DataConverter() {
        initializeFormats();
        initializeUI();
        setupEventListeners();
    }

    /**
     * Initialize number formatting objects
     */
    private void initializeFormats() {
        // Standard format for regular numbers (US locale for consistent decimal points)
        standardFormat = new DecimalFormat("#,##0.##########", 
                                         DecimalFormatSymbols.getInstance(Locale.US));
        
        // Scientific format for very large/small numbers
        scientificFormat = new DecimalFormat("0.#########E0", 
                                           DecimalFormatSymbols.getInstance(Locale.US));
    }

    /**
     * Initialize all UI components and layout
     */
    private void initializeUI() {
        setTitle("Data Measurement Converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        
        // Main panel with padding
        JPanel mainPanel = new JPanel(new BorderLayout(10, 10));
        mainPanel.setBorder(new EmptyBorder(15, 15, 15, 15));
        
        // Input panel (top section)
        JPanel inputPanel = createInputPanel();
        mainPanel.add(inputPanel, BorderLayout.NORTH);
        
        // Result area (center section)
        resultArea = new JTextArea(3, 35);
        resultArea.setEditable(false);
        resultArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
        resultArea.setBorder(BorderFactory.createTitledBorder("Result"));
        resultArea.setBackground(new Color(248, 248, 248));
        resultArea.setMargin(new Insets(10, 10, 10, 10));
        JScrollPane scrollPane = new JScrollPane(resultArea);
        mainPanel.add(scrollPane, BorderLayout.CENTER);
        
        // Button panel (bottom section)
        JPanel buttonPanel = createButtonPanel();
        mainPanel.add(buttonPanel, BorderLayout.SOUTH);
        
        add(mainPanel);
        pack();
        setLocationRelativeTo(null); // Center the window on screen
        setResizable(false);
    }

    /**
     * Create the input panel with value field and unit selection
     * @return JPanel containing input components
     */
    private JPanel createInputPanel() {
        JPanel panel = new JPanel(new GridLayout(4, 2, 10, 10));
        
        // Input value field
        panel.add(new JLabel("Enter value:"));
        inputField = new JTextField();
        inputField.setFont(new Font("Arial", Font.PLAIN, 14));
        panel.add(inputField);
        
        // From unit selection
        panel.add(new JLabel("From unit:"));
        String[] units = {"Bits (b)", "Bytes (B)", "Kilobytes (KB)", "Megabytes (MB)", 
                         "Gigabytes (GB)", "Terabytes (TB)", "Petabytes (PB)"};
        fromUnitComboBox = new JComboBox<>(units);
        fromUnitComboBox.setSelectedIndex(1); // Default to Bytes
        panel.add(fromUnitComboBox);
        
        // To unit selection
        panel.add(new JLabel("To unit:"));
        toUnitComboBox = new JComboBox<>(units);
        toUnitComboBox.setSelectedIndex(2); // Default to Kilobytes
        panel.add(toUnitComboBox);
        
        // Empty space for alignment
        panel.add(new JLabel());
        
        // Swap units button
        swapButton = new JButton("Swap Units");
        swapButton.setBackground(new Color(220, 220, 220));
        swapButton.setForeground(Color.BLACK);
        swapButton.setFont(new Font("Arial", Font.BOLD, 12));
        swapButton.setFocusPainted(false);
        panel.add(swapButton);
        
        return panel;
    }

    /**
     * Create the button panel with action buttons
     * @return JPanel containing Convert and Clear buttons
     */
    private JPanel createButtonPanel() {
        JPanel panel = new JPanel(new FlowLayout());
        
        // Convert button
        convertButton = new JButton("Convert");
        convertButton.setBackground(new Color(220, 220, 220));
        convertButton.setForeground(Color.BLACK);
        convertButton.setFont(new Font("Arial", Font.BOLD, 12));
        convertButton.setFocusPainted(false);
        
        // Clear button
        clearButton = new JButton("Clear");
        clearButton.setBackground(new Color(220, 220, 220));
        clearButton.setForeground(Color.BLACK);
        clearButton.setFont(new Font("Arial", Font.BOLD, 12));
        clearButton.setFocusPainted(false);
        
        panel.add(convertButton);
        panel.add(clearButton);
        
        return panel;
    }

    /**
     * Set up event listeners for all interactive components
     */
    private void setupEventListeners() {
        // Convert button - perform conversion when clicked
        convertButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                performConversion();
            }
        });
        
        // Clear button - reset all fields
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                inputField.setText("");
                resultArea.setText("");
                inputField.requestFocus();
            }
        });
        
        // Swap button - exchange from and to units
        swapButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                swapUnits();
            }
        });
        
        // Enter key support - convert when Enter is pressed in input field
        inputField.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    performConversion();
                }
            }
        });
    }

    /**
     * Swap the units between From and To selection
     * Automatically performs conversion if input exists
     */
    private void swapUnits() {
        // Get current selections
        String fromUnit = (String) fromUnitComboBox.getSelectedItem();
        String toUnit = (String) toUnitComboBox.getSelectedItem();
        
        // Swap the selections
        fromUnitComboBox.setSelectedItem(toUnit);
        toUnitComboBox.setSelectedItem(fromUnit);
        
        // If there's a result and input value, automatically perform conversion
        if (!resultArea.getText().isEmpty() && !inputField.getText().trim().isEmpty()) {
            performConversion();
        }
    }

    /**
     * Perform the unit conversion and display result
     * Handles input validation and error messages
     */
    private void performConversion() {
        try {
            String inputText = inputField.getText().trim();
            
            // Validate input exists
            if (inputText.isEmpty()) {
                showWarningMessage("Please enter a value to convert.", "Input Error");
                return;
            }
            
            double inputValue = Double.parseDouble(inputText);
            
            // Validate positive value
            if (inputValue < 0) {
                showWarningMessage("Please enter a positive value.", "Input Error");
                return;
            }
            
            String fromUnit = (String) fromUnitComboBox.getSelectedItem();
            String toUnit = (String) toUnitComboBox.getSelectedItem();
            
            // Validate different units
            if (fromUnit.equals(toUnit)) {
                showWarningMessage("Source and target units are the same.", "Conversion Error");
                return;
            }
            
            // Perform conversion and display result
            double result = convertValue(inputValue, fromUnit, toUnit);
            String resultText = formatNumber(result) + " " + toUnit;
            resultArea.setText(resultText);
            
        } catch (NumberFormatException ex) {
            showErrorMessage("Please enter a valid number.", "Input Error");
        } catch (Exception ex) {
            showErrorMessage("An error occurred during conversion: " + ex.getMessage(), 
                           "Conversion Error");
        }
    }

    /**
     * Display a warning message dialog
     * @param message The warning message to display
     * @param title The dialog title
     */
    private void showWarningMessage(String message, String title) {
        JOptionPane.showMessageDialog(this, message, title, JOptionPane.WARNING_MESSAGE);
    }

    /**
     * Display an error message dialog
     * @param message The error message to display
     * @param title The dialog title
     */
    private void showErrorMessage(String message, String title) {
        JOptionPane.showMessageDialog(this, message, title, JOptionPane.ERROR_MESSAGE);
    }

    /**
     * Format a number appropriately based on its size
     * Uses scientific notation for very large or very small numbers
     * @param value The number to format
     * @return Formatted number as string
     */
    private String formatNumber(double value) {
        if (value == 0) {
            return "0";
        }
        
        double absValue = Math.abs(value);
        
        // Use scientific notation for extreme values
        if (absValue >= 1e10 || (absValue <= 1e-5 && absValue > 0)) {
            return scientificFormat.format(value);
        } else {
            return standardFormat.format(value);
        }
    }

    /**
     * Convert a value from one unit to another
     * @param value The value to convert
     * @param fromUnit The source unit
     * @param toUnit The target unit
     * @return The converted value
     */
    private double convertValue(double value, String fromUnit, String toUnit) {
        // Convert to bytes first (common intermediate unit), then to target unit
        double bytes = toBytes(value, fromUnit);
        return fromBytes(bytes, toUnit);
    }

    /**
     * Convert any unit to bytes
     * @param value The value to convert
     * @param unit The source unit
     * @return Value in bytes
     */
    private double toBytes(double value, String unit) {
        switch (unit) {
            case "Bits (b)":    return value * BITS_TO_BYTES;
            case "Bytes (B)":   return value * BYTES_TO_BYTES;
            case "Kilobytes (KB)": return value * KILOBYTES_TO_BYTES;
            case "Megabytes (MB)": return value * MEGABYTES_TO_BYTES;
            case "Gigabytes (GB)": return value * GIGABYTES_TO_BYTES;
            case "Terabytes (TB)": return value * TERABYTES_TO_BYTES;
            case "Petabytes (PB)": return value * PETABYTES_TO_BYTES;
            default: return value;
        }
    }

    /**
     * Convert bytes to any unit
     * @param bytes The value in bytes
     * @param unit The target unit
     * @return Value in target unit
     */
    private double fromBytes(double bytes, String unit) {
        switch (unit) {
            case "Bits (b)":    return bytes / BITS_TO_BYTES;
            case "Bytes (B)":   return bytes / BYTES_TO_BYTES;
            case "Kilobytes (KB)": return bytes / KILOBYTES_TO_BYTES;
            case "Megabytes (MB)": return bytes / MEGABYTES_TO_BYTES;
            case "Gigabytes (GB)": return bytes / GIGABYTES_TO_BYTES;
            case "Terabytes (TB)": return bytes / TERABYTES_TO_BYTES;
            case "Petabytes (PB)": return bytes / PETABYTES_TO_BYTES;
            default: return bytes;
        }
    }

    /**
     * Main method - application entry point
     */
    public static void main(String[] args) {
        // Set system look and feel for native appearance
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println("Warning: Could not set system look and feel");
        }
        
        // Create and show GUI on Event Dispatch Thread
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new DataConverter().setVisible(true);
            }
        });
    }
}