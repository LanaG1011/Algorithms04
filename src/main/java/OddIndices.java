public class OddIndices {


    public int[] oddIndicesAlgorithm(int[] array) {

        if (array.length != 0) {

            int[] oddIndicesArray = new int[array.length / 2];

            int index = 0;
            for (int i = 1; i < array.length; i += 2) {
                oddIndicesArray[index] = array[i];
                index++;
            }

            return oddIndicesArray;
        }

        return new int[]{};
    }
}