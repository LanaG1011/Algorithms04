public class AreNumbersEqual {

    public int areNumbersEqualAlgorithm(int first, int second) {

        if (first == second) {

            return 0;
        } else if (first < second) {

            return -1;
        } else {

            return 1;
        }
    }
}
