public class Intersection {

    public int[] intersectionAlgorithm(int[] array1, int[] array2) {
        if (array1.length == 0 || array2.length == 0) {

            return null;
        }
        int length = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    length++;
                }
            }
        }
        int[] arrayResult = new int[length];
        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] == array2[j]) {
                    arrayResult[count] = array1[i];
                    count++;
                }
            }
        }

        return arrayResult;
    }
}





