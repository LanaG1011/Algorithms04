import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class SumArrayTest {

    @Order(1)
    @Test
    public void testSumArrayHappyPath() {

        int[] array = {0, 1, 2, 3, 4, 5};
        int expectedResult = 15;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testSumArrayHappyPathNegativeNumbers() {

        int[] array = {-7, -3};
        int expectedResult = -10;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testSumArrayEmptyArray() {

        int[] array = {};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testSumArrayHappyPathZeroValuesArray() {

        int[] array = {0, 0};
        int expectedResult = 0;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testSumArrayZeroNegativePositiveNumbersArray() {

        int[] array = {0, -2, 452};
        int expectedResult = 450;

        SumArray sa = new SumArray();
        int actualResult = sa.sumArrayAlgorithm(array);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
