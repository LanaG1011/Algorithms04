public class BiggerValue {

    public int biggerValueAlgorithm(int a, int b) {
        int bigger = 0;
        if (a == b) {

            return 0;
        }

        if (a > b) {
            bigger = a;
        } else {
            bigger = b;
        }

        return bigger;
    }
}
