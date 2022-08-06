import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class SortArrayTest {

    @Order(1)
    @Test
    public void testSortArrayHappyPath() {

        int[] array = {3, 7, 12, 5, 2, 9, 4};
        int[] expectedResult = {2, 3, 4, 5, 7, 9, 12};

        SortArray sortArray = new SortArray();
        int[] actualResult = sortArray.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testSortArrayAllIdenticalNumbers() {

        int[] array = {1, 1, 1};
        int[] expectedResult = {1, 1, 1};

        SortArray sortArray = new SortArray();
        int[] actualResult = sortArray.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testSortArrayNegativeNumbers() {

        int[] array = {10, -50, -30, 1};
        int[] expectedResult = {-50, -30, 1, 10};

        SortArray sortArray = new SortArray();
        int[] actualResult = sortArray.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testSortArrayAllZeros() {

        int[] array = {0, 0, 0};
        int[] expectedResult = {0, 0, 0};

        SortArray sortArray = new SortArray();
        int[] actualResult = sortArray.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testSortArrayEmptyArray() {

        int[] array = {};
        int[] expectedResult = {};

        SortArray sortArray = new SortArray();
        int[] actualResult = sortArray.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testSortArrayOneIndexArray() {

        int[] array = {500};
        int[] expectedResult = {500};

        SortArray sortArray = new SortArray();
        int[] actualResult = sortArray.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testSortArrayTwoIdenticalNumbers() {

        int[] array = {1000, 30, 12, 30, 54};
        int[] expectedResult = {12, 30, 30, 54, 1000};

        SortArray sortArray = new SortArray();
        int[] actualResult = sortArray.sortArrayAlgorithm(array);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}