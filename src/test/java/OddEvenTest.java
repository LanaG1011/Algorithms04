import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddEvenTest {

    @Order(1)
    @Test
    public void testOddEvenHappyPathPositiveOddNumber() {

        long a = 345;
        String expectedResult = "Odd";

        OddEven odEv = new OddEven();
        String actualResult = odEv.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddEvenHappyPathPositiveEvenNumber() {

        long a = 44;
        String expectedResult = "Even";

        OddEven odEv = new OddEven();
        String actualResult = odEv.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddEvenHappyPathEvenNegativeNumber() {

        long a = -34;
        String expectedResult = "Even";

        OddEven odEv = new OddEven();
        String actualResult = odEv.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testOddEvenHappyPathOddNegativeNumber() {

        long a = -165;
        String expectedResult = "Odd";

        OddEven odEv = new OddEven();
        String actualResult = odEv.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testOddEvenHappyPathZero() {

        long a = 0;
        String expectedResult = "Even";

        OddEven odEv = new OddEven();
        String actualResult = odEv.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testOddEvenHappyPathSixDigitNumber() {

        long a = 222222;
        String expectedResult = "Even";

        OddEven odEv = new OddEven();
        String actualResult = odEv.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testOddEvenIntMaxValuePlusOne() {

        int a = 2147483647 + 1;
        String expectedResult = "Undefined";

        OddEven odEv = new OddEven();
        String actualResult = odEv.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testOddEvenIntMinValueMinusOne() {

        int a = -2147483648 - 1;
        String expectedResult = "Undefined";

        OddEven odEv = new OddEven();
        String actualResult = odEv.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testOddEvenUndefinedPositiveNum() {

        long a = 2147483648L;
        String expectedResult = "Undefined";

        OddEven odEv = new OddEven();
        String actualResult = odEv.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testOddEvenUndefinedNegativeNum() {

        long a = -2147483649L;
        String expectedResult = "Undefined";

        OddEven odEv = new OddEven();
        String actualResult = odEv.oddEvenAlgorithm(a);

        Assertions.assertEquals(expectedResult, actualResult);

    }

}
