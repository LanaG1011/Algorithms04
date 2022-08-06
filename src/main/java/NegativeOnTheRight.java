public class NegativeOnTheRight {

    public int[] negativeOnTheRightAlgorithm(int[] array) {
        int[] result = new int[array.length];
        int index = result.length - 1;
        int index2 = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                result[index] = array[i];
                index--;
            } else if (array[i] > 0) {
                result[index2] = array[i];
                index++;
            }
        }

        return result;
    }
}