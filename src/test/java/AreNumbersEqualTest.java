import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AreNumbersEqualTest {

    @Order(1)
    @Test
    public void testAreNumbersEqualHappyPathTheSameValue() {

        int first = 89;
        int second = 89;
        int expectedResult = 0;

        AreNumbersEqual areNumEqual = new AreNumbersEqual();
        int actualResult = areNumEqual.areNumbersEqualAlgorithm(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testAreNumbersEqualHappyPathFirstIsNegative() {

        int first = -89;
        int second = 89;
        int expectedResult = -1;

        AreNumbersEqual areNumEqual = new AreNumbersEqual();
        int actualResult = areNumEqual.areNumbersEqualAlgorithm(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testAreNumbersEqualHappyPathSecondIsNegative() {

        int first = 89;
        int second = -89;
        int expectedResult = 1;

        AreNumbersEqual areNumEqual = new AreNumbersEqual();
        int actualResult = areNumEqual.areNumbersEqualAlgorithm(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testAreNumbersEqualBothAreNegativeFirstIsSmaller() {

        int first = -100;
        int second = -89;
        int expectedResult = -1;

        AreNumbersEqual areNumEqual = new AreNumbersEqual();
        int actualResult = areNumEqual.areNumbersEqualAlgorithm(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testAreNumbersEqualBothAreNegativeFirstIsBigger() {

        int first = -100;
        int second = -200;
        int expectedResult = 1;

        AreNumbersEqual areNumEqual = new AreNumbersEqual();
        int actualResult = areNumEqual.areNumbersEqualAlgorithm(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testAreNumbersEqualBothAreZero() {

        int first = 0;
        int second = 0;
        int expectedResult = 0;

        AreNumbersEqual areNumEqual = new AreNumbersEqual();
        int actualResult = areNumEqual.areNumbersEqualAlgorithm(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testAreNumbersEqualBothAreNegativeWithTheSameValue() {

        int first = -10000;
        int second = -10000;
        int expectedResult = 0;

        AreNumbersEqual areNumEqual = new AreNumbersEqual();
        int actualResult = areNumEqual.areNumbersEqualAlgorithm(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testAreNumbersEqualFirstIsZeroSecondIsNegative() {

        int first = 0;
        int second = -500;
        int expectedResult = 1;

        AreNumbersEqual areNumEqual = new AreNumbersEqual();
        int actualResult = areNumEqual.areNumbersEqualAlgorithm(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(9)
    @Test
    public void testAreNumbersEqualSecondIsZeroFirstIsNegative() {

        int first =-700000;
        int second = 0;
        int expectedResult = -1;

        AreNumbersEqual areNumEqual = new AreNumbersEqual();
        int actualResult = areNumEqual.areNumbersEqualAlgorithm(first, second);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}