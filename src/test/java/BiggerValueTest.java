import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class BiggerValueTest {

    @Order(1)
    @Test
    public void testBiggerValueHappyPathPositiveFourDigitNumbers() {

        int a = 3333;
        int b = 9999;
        int expectedResult = 9999;

        BiggerValue bigger = new BiggerValue();
        int actualResult = bigger.biggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testBiggerValueTheSameValue() {

        int a = 5;
        int b = 5;
        int expectedResult = 0;

        BiggerValue bigger = new BiggerValue();
        int actualResult = bigger.biggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testBiggerValueHappyPathNegativeNumberA() {

        int a = -10;
        int b = 10;
        int expectedResult = 10;

        BiggerValue bigger = new BiggerValue();
        int actualResult = bigger.biggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testBiggerValueHappyPathNegativeNumberB() {

        int a = 10;
        int b = -10;
        int expectedResult = 10;

        BiggerValue bigger = new BiggerValue();
        int actualResult = bigger.biggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testBiggerValueHappyPathTwoNegativeNumbers() {

        int a = -110;
        int b = -50;
        int expectedResult = -50;

        BiggerValue bigger = new BiggerValue();
        int actualResult = bigger.biggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testBiggerValueHappyPathZeroA() {

        int a = 0;
        int b = 50;
        int expectedResult = 50;

        BiggerValue bigger = new BiggerValue();
        int actualResult = bigger.biggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testBiggerValueHappyPathZeroBNegativeA() {

        int a = -12;
        int b = 0;
        int expectedResult = 0;

        BiggerValue bigger = new BiggerValue();
        int actualResult = bigger.biggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testBiggerValueBothZeroNumbers() {

        int a = 0;
        int b = 0;
        int expectedResult = 0;

        BiggerValue bigger = new BiggerValue();
        int actualResult = bigger.biggerValueAlgorithm(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
