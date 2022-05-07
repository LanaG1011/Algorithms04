import org.junit.jupiter.api.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)

public class IsPositiveNumberTest {

    @Order(1)
    @Test
    public void testIsPositiveNumberHappyPathPositiveA(){

        int a = 555;
        boolean expectedResult = true;

        IsPositiveNumber isPositive = new IsPositiveNumber();
        boolean actualResult = isPositive.isPositiveNumberAlgorithm(a);

        Assertions.assertTrue(actualResult);
    }

    @Order(2)
    @Test
    public void testIsPositiveNumberHappyPathZeroA(){

        int a = 0;
        boolean expectedResult = true;

        IsPositiveNumber isPositive = new IsPositiveNumber();
        boolean actualResult = isPositive.isPositiveNumberAlgorithm(a);

        Assertions.assertTrue(actualResult);
    }

    @Order(3)
    @Test
    public void testIsPositiveNumberHappyPathNegativeA(){

        int a = -555;
        boolean expectedResult = false;

        IsPositiveNumber isPositive = new IsPositiveNumber();
        boolean actualResult = isPositive.isPositiveNumberAlgorithm(a);

        Assertions.assertFalse(actualResult);
    }
}
