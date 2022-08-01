public class StringToNumbers {

    public int[] stringToNumbersAlgorithm(String str) {
        if (str != null) {
            str = str.trim();
            if (str.length() > 0) {
                int length = 0;

                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) > 47 & str.charAt(i) < 58) {
                        length++;
                    }
                }

                int[] result = new int[length];
                int index = 0;

                for (int i = 0; i < str.length(); i++) {
                    if (str.charAt(i) > 47 & str.charAt(i) < 58) {
                        result[index] = Integer.parseInt(Character.toString(str.charAt(i)));
                        index++;
                    }
                }

                return result;
            }
        }

        return new int[]{};
    }
}