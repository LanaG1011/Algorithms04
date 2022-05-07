import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class AscendingSequenceTest {
    AscendingSequence as;

    @BeforeEach// put here something in common in tests, optional
    void setUp() {
    as = new AscendingSequence();
    }


    @Order(1)
    @Test
    public void testAscendingSequenceHappyPathPositiveNumbers() {

        int start = 0;
        int end = 5;
        int step = 1;
        int[] expectedResult = {0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence();//create object to call method
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);//from object call method

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

        @Order(2)
        @Test
        public void testAscendingSequenceHappyPathNegativeNumbers() {

            int start = -10;
            int end = -7;
            int step = 1;
            int[] expectedResult = {-10, -9, -8, -7};

            AscendingSequence as = new AscendingSequence();//create object to call method
            int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);//from object call method

            Assertions.assertArrayEquals(expectedResult, actualResult);


        }

     @Order(3)
    @Test
    public void testAscendingSequenceHappyPathNegativePositiveNumbers() {

        int start = -5;
        int end = 5;
        int step = 1;
        int[] expectedResult = {-5, -4, -3, -2, -1, 0, 1, 2, 3, 4, 5};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);


    }

    @Order(4)
    @Test
    public void testAscendingSequenceHappyPathStepTwo() {

        int start = 0;
        int end = 5;
        int step = 2;
        int[] expectedResult = {0, 2, 4};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);


    }

    @Test
    public void testAscendingSequenceStartLargerThanEnd() {

        int start = 5;
        int end = 0;
        int step = 2;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testAscendingSequenceNegativeStep() {

        int start = 0;
        int end = 5;
        int step = -1;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }

    @Test
    public void testAscendingSequenceStepIsZero() {

        int start = 0;
        int end = 5;
        int step = 0;
        int[] expectedResult = {};

        AscendingSequence as = new AscendingSequence();
        int[] actualResult = as.ascendingSequenceAlgorithm(start, end, step);

        Assertions.assertArrayEquals(expectedResult, actualResult);

    }








}
