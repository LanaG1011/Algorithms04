public class RemoveDuplicates {

    public String removeDuplicatesAlgorithm(String str) {
        if (str != null && str.length() > 0) {
            str = str.trim().toLowerCase();
            String strNew = "";
            char[] array = str.toCharArray();

            for (int i = 0; i < array.length; i++) {
                for (int j = i + 1; j < array.length; j++) {
                    if (array[i] == array[j]) {
                        array[j] = 'A';
                    }
                }
            }

            for (int i = 0; i < array.length; i++) {
                if ((array[i] > 96 && array[i] < 123) && array[i] != 'A') {
                    strNew += array[i];
                }
            }

            return strNew;
        }

        return "";
    }
}