import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathOperationsTest {

    @Test
    void sinus_ofZero_isZero() {
        double result = MathOperations.sinus(0.0);
        assertEquals(0.0, result, 1e-12);
    }

    @Test
    void sinus_ofPiOverTwo_isOne() {
        double result = MathOperations.sinus(Math.PI/2);
        assertEquals(1.0, result, 1e-12);
    }

    @Test
    void sinus_ofNegativeValue_isNegative() {
        double result = MathOperations.sinus(-Math.PI/2);
        assertEquals(-1.0, result, 1e-12);
    }

    @Test
    void cosinus_ofZero_isOne() {
        double result = MathOperations.cosinus(0.0);
        assertEquals(1.0, result, 1e-12);
    }

    @Test
    void cosinus_ofPi_isMinusOne() {
        double result = MathOperations.cosinus(Math.PI);
        assertEquals(-1.0, result, 1e-12);
    }

    @Test
    void cosinus_ofPiOverTwo_isZero() {
        double result = MathOperations.cosinus(Math.PI/2);
        assertEquals(0.0, result, 1e-12);
    }

    @Test
    void tangens_ofZero_isZero() {
        double result = MathOperations.tangens(0.0);
        assertEquals(0.0, result, 1e-12);
    }

    @Test
    void tangens_ofPIOverFour_isCloseToOne() {
        double result = MathOperations.tangens(Math.PI/4);
        assertEquals(1.0, result, 1e-12);
    }

    @Test
    void squareRoot_ofZero_isZero() {
        double result = MathOperations.square_root(0.0);
        assertEquals(0.0, result, 1e-12);
    }

    @Test
    void squareRoot_ofNine_isThree() {
        double result = MathOperations.square_root(9.0);
        assertEquals(3.0, result, 1e-12);
    }

    @Test
    void squareRoot_ofNegativeNumber_throwsException() {
        assertThrows(
                IllegalArgumentException.class,
                ()->MathOperations.square_root(-2.0));
    }

    @Test
    void logBase10_ofOne_isZero() {
        double result = MathOperations.logarithmBase10(1.0);
        assertEquals(0.0, result, 1e-12);
    }

    @Test
    void logBase10_ofTen_isOne() {
        double result = MathOperations.logarithmBase10(10.0);
        assertEquals(1.0, result, 1e-12);
    }

    @Test
    void logBase10_ofOneHundred_isTwo() {
        double result = MathOperations.logarithmBase10(100.0);
        assertEquals(2.0, result, 1e-12);
    }

    @Test
    void logBase10_ofNegativeNumber_throwsException() {
        assertThrows(
                IllegalArgumentException.class,
                ()->MathOperations.logarithmBase10(-2.0)
        );
    }

    @Test
    void naturalLog_ofOne_isZero() {
        double result = MathOperations.naturalLogarithm(1.0);
        assertEquals(0.0, result, 1e-12);
    }

    @Test
    void naturalLog_ofE_isOne() {
        double result = MathOperations.naturalLogarithm(Math.E);
        assertEquals(1.0, result, 1e-12);
    }

    @Test
    void naturalLog_ofNegativeNumber_throwsException() {
        assertThrows(
                IllegalArgumentException.class,
                ()->MathOperations.naturalLogarithm(-2.0)
        );
    }

    @Test
    void exp_ofZero_isOne() {
        double result = MathOperations.exponential(0.0);
        assertEquals(1.0, result, 1e-12);
    }

    @Test
    void exp_ofOne_isE() {
        double result = MathOperations.exponential(1.0);
        assertEquals(Math.E, result, 1e-12);
    }

    @Test
    void exp_ofNegativeOne_isInverseOfE() {
        double result = MathOperations.exponential(-1.0);
        assertEquals(1/Math.E, result, 1e-12);
    }

    @Test
    void factorialOfZero_isOne() {
        long result = MathOperations.factorial(0.0);
        assertEquals(1L, result);
    }

    @Test
    void factorialOfOne_isOne() {
        long result = MathOperations.factorial(1.0);
        assertEquals(1L, result);
    }

    @Test
    void factorialOfFive_isOneHundredTwenty() {
        long result = MathOperations.factorial(5.0);
        assertEquals(120L, result);
    }

    @Test
    void factorialOfNegativeNumber_throwsException() {
        assertThrows(
                IllegalArgumentException.class,
                ()->MathOperations.factorial(-2.0)
        );
    }

    @Test
    void factorialOfFloatingPointNumber_throwsException() {
        assertThrows(
                IllegalArgumentException.class,
                ()->MathOperations.factorial(2.5)
        );
    }
}
