public class OddEven {

    public String oddEvenAlgorithm(long a) {

        if (a > Integer.MIN_VALUE && a < Integer.MAX_VALUE) {
            if (a % 2 == 0) {

                return "Even";
            } else {

                return "Odd";
            }
        }

        return "Undefined";
    }
}
