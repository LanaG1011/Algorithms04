public class ReverseString {

    public String reverseStringAlgorithm(String str) {
        if (str.length() != 0) {
            char[] words = str.toCharArray();
            String reversedString = "";
            for (int i = words.length - 1; i >= 0; i--) {
                reversedString += words[i];
            }

            return reversedString;
        }

        return "";
    }
}
