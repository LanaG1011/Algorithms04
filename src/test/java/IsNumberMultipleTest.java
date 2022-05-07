import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class IsNumberMultipleTest {

    @Test
    public void testIsNumberMultipleHappyPathMultipleOfBoth() {

        int m = 15;
        String expectedResult = "Good number";

        IsNumberMultiple isNumberMultiple = new IsNumberMultiple();
        String actualResult = isNumberMultiple.isNumberMultipleAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsNumberMultipleHappyPathMultipleOfThree() {

        int m = 9;
        String expectedResult = "Bad number";

        IsNumberMultiple isNumberMultiple = new IsNumberMultiple();
        String actualResult = isNumberMultiple.isNumberMultipleAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsNumberMultipleHappyPathMultipleOfFive() {

        int m = 10;
        String expectedResult = "Poor number";

        IsNumberMultiple isNumberMultiple = new IsNumberMultiple();
        String actualResult = isNumberMultiple.isNumberMultipleAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsNumberMultipleDoesNotMultiple() {

        int m = 22;
        String expectedResult = "-1";

        IsNumberMultiple isNumberMultiple = new IsNumberMultiple();
        String actualResult = isNumberMultiple.isNumberMultipleAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsNumberMultipleNegativeNumberBothMultiple() {

        int m = -30;
        String expectedResult = "Good number";

        IsNumberMultiple isNumberMultiple = new IsNumberMultiple();
        String actualResult = isNumberMultiple.isNumberMultipleAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsNumberMultipleNegativeNumberMultipleOfThree() {

        int m = -3333;
        String expectedResult = "Bad number";

        IsNumberMultiple isNumberMultiple = new IsNumberMultiple();
        String actualResult = isNumberMultiple.isNumberMultipleAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsNumberMultipleNegativeNumberMultipleOfFive() {

        int m = -550000;
        String expectedResult = "Poor number";

        IsNumberMultiple isNumberMultiple = new IsNumberMultiple();
        String actualResult = isNumberMultiple.isNumberMultipleAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsNumberMultipleNegativeNumberDoesNotMultiple() {

        int m = -224861;
        String expectedResult = "-1";

        IsNumberMultiple isNumberMultiple = new IsNumberMultiple();
        String actualResult = isNumberMultiple.isNumberMultipleAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testIsNumberMultipleZeroM() {

        int m = 0;
        String expectedResult = "Good number";

        IsNumberMultiple isNumberMultiple = new IsNumberMultiple();
        String actualResult = isNumberMultiple.isNumberMultipleAlgorithm(m);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
