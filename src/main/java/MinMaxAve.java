public class MinMaxAve {

    public int[] minMaxAveAlgorithm(int[] array, int index1, int index2) {

        if (array == null || array.length < 1 || index1 < 0 || index1 > index2 || index2 > array.length) {

            return new int[]{};
        }

        int minValue = array[index1];
        int maxValue = array[index2];
        int midValue = 0;
        int sum = 0;

        for (int i = index1; i <= index2; i++) {
            if (array[index1] < array[i]) {
                maxValue = array[i];

            }
            if (array[index1] > array[i]) {
                minValue = array[i];
            }
            sum += array[i];

        }

        midValue = sum / (index2 - index1 + 1);

        int[] result2 = {minValue, maxValue, midValue};

        return result2;

    }
}