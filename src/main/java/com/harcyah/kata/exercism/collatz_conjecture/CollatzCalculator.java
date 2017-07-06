class CollatzCalculator {

    public int computeStepCount(int start) {
        if (start <= 0) {
            throw new IllegalArgumentException("Only natural numbers are allowed");
        }

        return steps(start, 0);
    }

    public int steps(int value, int steps) {
        if (value == 1) {
            return steps;
        }

        int mod = value % 2;
        return (mod == 0 ? steps(value / 2, steps + 1) : steps(3 * value + 1, steps + 1));
    }

}
