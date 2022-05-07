import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class ReverseArrayTest {

    @Order(1)
    @Test
    public void testReverseArrayAlgorithmHappyPath(){

    int[] array = {2, 7, 3, 10};
    int[] expectedResult = {10, 3, 7, 2};

    ReverseArray revArr = new ReverseArray();
    int[] actualResult = revArr.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testReverseArrayAlgorithmHappyPathNegativeNumbers(){

        int[] array = {-2, -7, 3, -10};
        int[] expectedResult = {-10, 3, -7, -2};

        ReverseArray revArr = new ReverseArray();
        int[] actualResult = revArr.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testReverseArrayAlgorithmEmptyArray(){

        int[] array = {};
        int[] expectedResult = null;

        ReverseArray revArr = new ReverseArray();
        int[] actualResult = revArr.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testReverseArrayAlgorithmZeroNumbers(){

        int[] array = {0, 0};
        int[] expectedResult = {0, 0};

        ReverseArray revArr = new ReverseArray();
        int[] actualResult = revArr.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testReverseArrayAlgorithmOneIndex(){

        int[] array = {1};
        int[] expectedResult = null;

        ReverseArray revArr = new ReverseArray();
        int[] actualResult = revArr.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testReverseArrayAlgorithmTwoIndex(){

        int[] array = {1, 4};
        int[] expectedResult = {4, 1};

        ReverseArray revArr = new ReverseArray();
        int[] actualResult = revArr.reverseArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
