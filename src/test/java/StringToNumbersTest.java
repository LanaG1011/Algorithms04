import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class
StringToNumbersTest {

    @Order(1)
    @Test
    public void testStringToNumbersHappyPath() {
        String str = "1, 2, 3, 4, 5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        StringToNumbers stringToNumbers = new StringToNumbers();
        int[] actualResult = stringToNumbers.stringToNumbersAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testStringToNumbersWithSpaces() {
        String str = "1 23  4    5";
        int[] expectedResult = {1, 2, 3, 4, 5};

        StringToNumbers stringToNumbers = new StringToNumbers();
        int[] actualResult = stringToNumbers.stringToNumbersAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testStringToNumbersWithSpecialCharacters() {
        String str = "1;2 : 3!4@ #$ % & ^ * ()_-+'<>?/|{}[] 5@*";
        int[] expectedResult = {1, 2, 3, 4, 5};

        StringToNumbers stringToNumbers = new StringToNumbers();
        int[] actualResult = stringToNumbers.stringToNumbersAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testStringToNumbersWithLetters() {
        String str = "4a 5H 6KD 7NGs";
        int[] expectedResult = {4, 5, 6, 7};

        StringToNumbers stringToNumbers = new StringToNumbers();
        int[] actualResult = stringToNumbers.stringToNumbersAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testStringToNumbersAllZeros() {
        String str = "00000";
        int[] expectedResult = {0, 0, 0, 0, 0};

        StringToNumbers stringToNumbers = new StringToNumbers();
        int[] actualResult = stringToNumbers.stringToNumbersAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testStringToNumbersNegativeNumbers() {
        String str = "-1, -5";
        int[] expectedResult = {1, 5};

        StringToNumbers stringToNumbers = new StringToNumbers();
        int[] actualResult = stringToNumbers.stringToNumbersAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(9)
    @Test
    public void testStringToNumbersNoNumbers() {
        String str = "asD G%*";
        int[] expectedResult = {};

        StringToNumbers stringToNumbers = new StringToNumbers();
        int[] actualResult = stringToNumbers.stringToNumbersAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testStringToNumbersEmptyString() {
        String str = "";
        int[] expectedResult = {};

        StringToNumbers stringToNumbers = new StringToNumbers();
        int[] actualResult = stringToNumbers.stringToNumbersAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testStringToNumbersNullInsteadString() {
        String str = null;
        int[] expectedResult = {};

        StringToNumbers stringToNumbers = new StringToNumbers();
        int[] actualResult = stringToNumbers.stringToNumbersAlgorithm(str);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}