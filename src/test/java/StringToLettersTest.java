import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class StringToLettersTest {

    @Order(1)
    @Test
    public void testStringToLettersHappyPath() {
        String str = "Abb123c";
        String expectedResult = "Abbc";

        StringToLetters stringToLetters = new StringToLetters();
        String actualResult = stringToLetters.stringToLettersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testStringToLettersRemoveSpaces() {
        String str = "yxz  12 d";
        String expectedResult = "yxzd";

        StringToLetters stringToLetters = new StringToLetters();
        String actualResult = stringToLetters.stringToLettersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testStringToLettersOnlyNumbers() {
        String str = "1234567890";
        String expectedResult = "";

        StringToLetters stringToLetters = new StringToLetters();
        String actualResult = stringToLetters.stringToLettersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testStringToLettersRemoveSpecialCharacters() {
        String str = "q`~!@#$%^&*()_+-—={}[]|:;'<>,./?©«¬²¿“”\\";
        String expectedResult = "q";

        StringToLetters stringToLetters = new StringToLetters();
        String actualResult = stringToLetters.stringToLettersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testStringToLettersAllCapitalLetters() {
        String str = "JAVA";
        String expectedResult = "JAVA";

        StringToLetters stringToLetters = new StringToLetters();
        String actualResult = stringToLetters.stringToLettersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testStringToLettersEmptyString() {
        String str = "";
        String expectedResult = "";

        StringToLetters stringToLetters = new StringToLetters();
        String actualResult = stringToLetters.stringToLettersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testStringToLettersNull() {
        String str = null;
        String expectedResult = "";

        StringToLetters stringToLetters = new StringToLetters();
        String actualResult = stringToLetters.stringToLettersAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}