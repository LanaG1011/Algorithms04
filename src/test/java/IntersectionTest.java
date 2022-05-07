import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IntersectionTest {

    @Order(1)
    @Test
    public void testIntersectionHappyPath() {

        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 4, 2};
        int[] expectedResult = {2, 4};

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testIntersectionHappyPathNegativeNumbers() {

        int[] array1 = {1, 2, 4, 5, 8, 9};
        int[] array2 = {8, 9, -4, -2};
        int[] expectedResult = {8, 9};

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testIntersectionNoCommonNumbers() {

        int[] array1 = {1, 2, 4, 5, 89};
        int[] array2 = {8, 9, 45};
        int[] expectedResult = {};

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testIntersectionEmptyArray() {

        int[] array1 = {};
        int[] array2 = {8, 9, 45};
        int[] expectedResult = null;

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testIntersectionEmptyArrays() {

        int[] array1 = {};
        int[] array2 = {};
        int[] expectedResult = null;

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testIntersectionCommonZero() {

        int[] array1 = {1, 5, 45, 0, 14, 28};
        int[] array2 = {2, 0, 6, 0};
        int[] expectedResult = {0, 0};

        Intersection intersection = new Intersection();
        int[] actualResult = intersection.intersectionAlgorithm(array1, array2);

        Assertions.assertArrayEquals(expectedResult, actualResult);
    }
}
