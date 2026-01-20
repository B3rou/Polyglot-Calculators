import java.util.Scanner;

public class BaseConverter {

    static int toDecimal(String number, int base) {
        return Integer.parseInt(number, base);
    }

    static String fromDecimal(int number, int base) {
        return Integer.toString(number, base).toUpperCase();
    }

    static int getBase(String baseName) {
        switch (baseName.toLowerCase()) {
            case "bin": return 2;
            case "oct": return 8;
            case "dec": return 10;
            case "hex": return 16;
            default: throw new IllegalArgumentException("Invalid base");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        String number = sc.next();

        System.out.print("Enter source base (bin/oct/dec/hex): ");
        String from = sc.next();

        System.out.print("Enter target base (bin/oct/dec/hex): ");
        String to = sc.next();

        try {
            int decimalValue = toDecimal(number, getBase(from));
            String result = fromDecimal(decimalValue, getBase(to));
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Invalid input!");
        }

        sc.close();
    }
}
