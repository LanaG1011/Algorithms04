import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ReverseStringTest {

    @Order(1)
    @Test
    public void testReverseStringHappyPath() {

        String str = "Abracadabra";
        String expectedResult = "arbadacarbA";

        ReverseString reverseString = new ReverseString();
        String actualResult = reverseString.reverseStringAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(11)
    @Test
    public void testReverseStringHappyPathEmptyString() {

        String str = "";
        String expectedResult = "";

        ReverseString reverseString = new ReverseString();
        String actualResult = reverseString.reverseStringAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(2)
    @Test
    public void testReverseStringWithSpacesInside() {

        String str = "Abracadab ra";
        String expectedResult = "ar badacarbA";

        ReverseString reverseString = new ReverseString();
        String actualResult = reverseString.reverseStringAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(3)
    @Test
    public void testReverseStringThreeWords() {

        String str = "Abra cad abra";
        String expectedResult = "arba dac arbA";

        ReverseString reverseString = new ReverseString();
        String actualResult = reverseString.reverseStringAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(4)
    @Test
    public void testReverseStringWithSpacesAtTheEnd() {

        String str = "Abracadabra  ";
        String expectedResult = "  arbadacarbA";

        ReverseString reverseString = new ReverseString();
        String actualResult = reverseString.reverseStringAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(5)
    @Test
    public void testReverseStringWithSpacesAtTheBeginning() {

        String str = "  Abracadabra";
        String expectedResult = "arbadacarbA  ";

        ReverseString reverseString = new ReverseString();
        String actualResult = reverseString.reverseStringAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(6)
    @Test
    public void testReverseStringWithSpacesFromBothSides() {

        String str = "  Abracadabra  ";
        String expectedResult = "  arbadacarbA  ";

        ReverseString reverseString = new ReverseString();
        String actualResult = reverseString.reverseStringAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(7)
    @Test
    public void testReverseStringAllCapitalLetters() {

        String str = "ABRACADABRA";
        String expectedResult = "ARBADACARBA";

        ReverseString reverseString = new ReverseString();
        String actualResult = reverseString.reverseStringAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(8)
    @Test
    public void testReverseStringAllTheSameLetters() {

        String str = "aaaaaa";
        String expectedResult = "aaaaaa";

        ReverseString reverseString = new ReverseString();
        String actualResult = reverseString.reverseStringAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(9)
    @Test
    public void testReverseStringLettersAndNumbers() {

        String str = "Abracadabra79";
        String expectedResult = "97arbadacarbA";

        ReverseString reverseString = new ReverseString();
        String actualResult = reverseString.reverseStringAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Order(10)
    @Test
    public void testReverseStringLetterNumbersAndSymbols() {

        String str = "Abracada%:bra79";
        String expectedResult = "97arb:%adacarbA";

        ReverseString reverseString = new ReverseString();
        String actualResult = reverseString.reverseStringAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

}
