let display = document.getElementById('display');
let historyList = document.getElementById('history-list');
let currentInput = '0';
let shouldResetDisplay = false;
let calculationHistory = [];

// Initialize display
window.onload = function() {
    updateDisplay();
    loadHistory();
};

// Append value to display
function appendToDisplay(value) {
    if (shouldResetDisplay) {
        currentInput = '0';
        shouldResetDisplay = false;
    }
    
    if (currentInput === '0' && value !== '.') {
        currentInput = value;
    } else {
        currentInput += value;
    }
    
    updateDisplay();
}

// Clear display
function clearDisplay() {
    currentInput = '0';
    shouldResetDisplay = false;
    updateDisplay();
}

// Update display
function updateDisplay() {
    display.textContent = currentInput;
}

// Calculate result
function calculate() {
    try {
        // Replace display symbols with JavaScript operators
        let expression = currentInput
            .replace(/×/g, '*')
            .replace(/÷/g, '/')
            .replace(/−/g, '-');
        
        // Check if expression is valid
        if (!isValidExpression(expression)) {
            showError('Invalid expression');
            return;
        }
        
        // Calculate result
        let result = eval(expression);
        
        // Check for division by zero
        if (!isFinite(result)) {
            showError('Cannot divide by zero');
            return;
        }
        
        // Round to avoid floating point precision issues
        result = Math.round(result * 100000000) / 100000000;
        
        // Add to history
        addToHistory(currentInput, result);
        
        // Update display with result
        currentInput = result.toString();
        shouldResetDisplay = true;
        updateDisplay();
        
    } catch (error) {
        showError('Error in calculation');
    }
}

// Validate expression
function isValidExpression(expression) {
    // Check for empty expression
    if (!expression || expression === '0') {
        return false;
    }
    
    // Check for invalid characters
    const validChars = /^[0-9+\-*/().\s]+$/;
    if (!validChars.test(expression)) {
        return false;
    }
    
    // Check for balanced parentheses
    let parentheses = 0;
    for (let char of expression) {
        if (char === '(') parentheses++;
        if (char === ')') parentheses--;
        if (parentheses < 0) return false;
    }
    if (parentheses !== 0) return false;
    
    // Check for consecutive operators
    const operatorPattern = /[\+\-\*\/]{2,}/;
    if (operatorPattern.test(expression.replace(/\s/g, ''))) {
        return false;
    }
    
    return true;
}

// Show error message
function showError(message) {
    display.textContent = message;
    shouldResetDisplay = true;
    
    // Reset after 2 seconds
    setTimeout(() => {
        currentInput = '0';
        updateDisplay();
    }, 2000);
}

// Add calculation to history
function addToHistory(expression, result) {
    const historyItem = {
        expression: expression,
        result: result,
        timestamp: new Date().toLocaleString()
    };
    
    calculationHistory.unshift(historyItem);
    
    // Keep only last 10 calculations
    if (calculationHistory.length > 10) {
        calculationHistory.pop();
    }
    
    updateHistoryDisplay();
    saveHistory();
}

// Update history display
function updateHistoryDisplay() {
    historyList.innerHTML = '';
    
    if (calculationHistory.length === 0) {
        historyList.innerHTML = '<div class="history-item">No calculations yet</div>';
        return;
    }
    
    calculationHistory.forEach(item => {
        const historyElement = document.createElement('div');
        historyElement.className = 'history-item';
        historyElement.innerHTML = `
            <span class="history-expression">${item.expression}</span>
            <span class="history-result">= ${item.result}</span>
        `;
        historyList.appendChild(historyElement);
    });
}

// Save history to localStorage
function saveHistory() {
    localStorage.setItem('calculatorHistory', JSON.stringify(calculationHistory));
}

// Load history from localStorage
function loadHistory() {
    const savedHistory = localStorage.getItem('calculatorHistory');
    if (savedHistory) {
        calculationHistory = JSON.parse(savedHistory);
        updateHistoryDisplay();
    } else {
        updateHistoryDisplay();
    }
}

// Clear history
function clearHistory() {
    calculationHistory = [];
    updateHistoryDisplay();
    saveHistory();
}

// Keyboard support
document.addEventListener('keydown', function(event) {
    const key = event.key;
    
    // Prevent default for certain keys
    if (['Enter', 'Escape'].includes(key)) {
        event.preventDefault();
    }
    
    // Number keys
    if (key >= '0' && key <= '9') {
        appendToDisplay(key);
    }
    // Decimal point
    else if (key === '.') {
        appendToDisplay('.');
    }
    // Operators
    else if (key === '+') {
        appendToDisplay('+');
    }
    else if (key === '-') {
        appendToDisplay('−');
    }
    else if (key === '*') {
        appendToDisplay('×');
    }
    else if (key === '/') {
        event.preventDefault(); // Prevent browser search
        appendToDisplay('÷');
    }
    // Parentheses
    else if (key === '(') {
        appendToDisplay('(');
    }
    else if (key === ')') {
        appendToDisplay(')');
    }
    // Equals
    else if (key === 'Enter' || key === '=') {
        calculate();
    }
    // Clear
    else if (key === 'Escape' || key === 'c' || key === 'C') {
        clearDisplay();
    }
    // Backspace
    else if (key === 'Backspace') {
        if (currentInput.length > 1) {
            currentInput = currentInput.slice(0, -1);
        } else {
            currentInput = '0';
        }
        updateDisplay();
    }
});