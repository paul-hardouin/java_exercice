public enum Positive {
    POSITIVE,
    ZERO,
    NEGATIVE;

    public static Positive intToPositive(int number) {
        if (number > 0) {
            return POSITIVE;
        } else if (number < 0) {
            return NEGATIVE;
        } else {
            return ZERO;
        }
    }

    public String toString() {
        return this.name().toLowerCase();
    }
}
