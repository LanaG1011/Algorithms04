public class PeakElement {

    public int[] peakElementAlgorithm(int[] array) {
        int length = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0 && array[0] > array[1]) {
                length++;
            } else if (i > 0 && i < array.length - 1 && array[i] > array[i - 1] && array[i] > array[i + 1]) {
                length++;
            } else if (array[array.length - 1] > array[array.length - 2]) {
                length++;
            }
        }

        int[] result = new int[length];
        int index = 0;

        for (int i = 0; i < array.length; i++) {
            if (i == 0 && array[0] > array[1]) {
                result[index] = array[0];
                index++;
            } else if (i > 0 && i < array.length - 1 && array[i] > array[i - 1] && array[i] > array[i + 1]) {
                result[index] = array[i];
                index++;
            } else if (array[array.length - 1] > array[array.length - 2]) {
                result[index] = array[array.length - 1];
                index++;
            }
        }

        return result;
    }
}