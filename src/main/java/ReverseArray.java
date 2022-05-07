public class ReverseArray {

    public int[] reverseArrayAlgorithm(int[] array) {
        if (array == null || array.length <= 1){

            return null;
        }

        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        return array;
    }
}



