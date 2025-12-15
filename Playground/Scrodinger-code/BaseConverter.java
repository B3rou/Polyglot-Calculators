import java.util.Scanner;

public class BaseConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Base Converter ===");
        System.out.println("Supported bases: bin, oct, dec, hex");
        System.out.println("Usage: <number> <from_base> <to_base>");
        System.out.println("Example: 1010 bin dec");
        System.out.println();

        System.out.print("Enter conversion: ");
        String number = scanner.next();
        String fromBase = scanner.next().toLowerCase();
        String toBase = scanner.next().toLowerCase();

        try {
            String result = convert(number, fromBase, toBase);
            System.out.println("Result: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }

        scanner.close();
    }

    public static String convert(String number, String fromBase, String toBase) {
        int radixFrom = getRadix(fromBase);
        int radixTo = getRadix(toBase);

        // Парсим из исходной базы в decimal (int)
        int decimalValue = Integer.parseInt(number, radixFrom);

        // Конвертируем в целевую базу
        return Integer.toString(decimalValue, radixTo).toUpperCase();
    }

    private static int getRadix(String base) {
        return switch (base) {
            case "bin" -> 2;
            case "oct" -> 8;
            case "dec" -> 10;
            case "hex" -> 16;
            default -> throw new IllegalArgumentException("Unknown base: " + base);
        };
    }
}