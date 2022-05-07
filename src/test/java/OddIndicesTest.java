import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class OddIndicesTest {

    @Order(1)
    @Test
    public void testOddIndicesHappyPath(){

    int[] array = {-45, 590, 234, 985, 12, 68};
    int[] expectedResult = {590, 985, 68};

        OddIndices od = new OddIndices();
        int[] actualResult = od.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testOddIndicesEmptyArray(){

        int[] array = {};
        int[] expectedResult = {};

        OddIndices od = new OddIndices();
        int[] actualResult = od.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testOddIndicesArrayWithOneIndex(){

        int[] array = {5};
        int[] expectedResult = {};

        OddIndices od = new OddIndices();
        int[] actualResult = od.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testOddIndicesHappyPathThreeIndexes(){

        int[] array = {-45, -590, 234};
        int[] expectedResult = {-590};

        OddIndices od = new OddIndices();
        int[] actualResult = od.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testOddIndicesZeroValues(){

        int[] array = {0, 0, 0, 0};
        int[] expectedResult = {0, 0};

        OddIndices od = new OddIndices();
        int[] actualResult = od.oddIndicesAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

}
