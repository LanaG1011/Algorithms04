public class StringToLetters {

    public String stringToLettersAlgorithm(String str) {
        String result = "";

            if (str != null && str.length() != 0) {
                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) >= 65 && str.charAt(i) <= 90 || str.charAt(i) >= 97 && str.charAt(i) <= 122) {
                        result += str.charAt(i);
                    }
                }

                return result;
            }

        return "";
    }
}