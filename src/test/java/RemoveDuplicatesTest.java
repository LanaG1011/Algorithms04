import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RemoveDuplicatesTest {

    @Test
    public void testRemoveDuplicatesHappyPath() {
        String str = "AAABbbcc";
        String expectedResult = "abc";

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        String actualResult = removeDuplicates.removeDuplicatesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicatesWithSpaces() {
        String str = "Hello  World";
        String expectedResult = "helowrd";

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        String actualResult = removeDuplicates.removeDuplicatesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicatesWithSpecialCharacters() {
        String str = "qq`~!@#$%^&*()_+-—={}[]|:;'<>,./?©«¬²¿“”\\";
        String expectedResult = "q";

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        String actualResult = removeDuplicates.removeDuplicatesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicatesOnlyNumbers() {
        String str = "11223344455666778888999000";
        String expectedResult = "";

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        String actualResult = removeDuplicates.removeDuplicatesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicatesNoDuplicates() {
        String str = "abcdefghijklmnopqrstuvwxyz";
        String expectedResult = "abcdefghijklmnopqrstuvwxyz";

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        String actualResult = removeDuplicates.removeDuplicatesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicatesEmptyString() {
        String str = "";
        String expectedResult = "";

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        String actualResult = removeDuplicates.removeDuplicatesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testRemoveDuplicatesNull() {
        String str = null;
        String expectedResult = "";

        RemoveDuplicates removeDuplicates = new RemoveDuplicates();
        String actualResult = removeDuplicates.removeDuplicatesAlgorithm(str);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}