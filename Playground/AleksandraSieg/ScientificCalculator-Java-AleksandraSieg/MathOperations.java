public class MathOperations {
    static double sinus(double x) { return Math.sin(x);}

    static double cosinus(double x) {
        return Math.cos(x);
    }

    static double tangens(double x) { return Math.tan(x); }

    static double square_root(double x) {
        // Square root is not defined for negative numbers in real mathematics
        if (x < 0) {
            throw new IllegalArgumentException("Square root is not defined for negative numbers");
        }
        return Math.sqrt(x);
    }

    static double logarithmBase10(double x) {
        // The logarithm is not defined for negative numbers and zero
        if (x <= 0) {
            throw new IllegalArgumentException("Logarithm is defined only for positive numbers");
        }
        return Math.log10(x);
    }

    static double naturalLogarithm(double x) {
        // The logarithm is not defined for negative numbers and zero
        if (x <= 0) {
            throw new IllegalArgumentException("Logarithm is defined only for positive numbers");
        }
        return Math.log(x);
    }

    static double exponential(double x) {
        return Math.exp(x);
    }

    /**
     * Calculates factorial of a non-negative integer.
     * throws IllegalArgumentException if x is negative or not an integer
     */
    static long factorial(double x) {

        // Factorial is defined only for non-negative integers
        if(x < 0 || x != Math.floor(x)) {
            throw new IllegalArgumentException("Factorial is defined only for non-negative numbers");
        }

        long number = (long) x;
        long res = 1;

        for (long i = 1; i <= number; i++) {
            res = res*i;
        }

        return res;
        }
    }


