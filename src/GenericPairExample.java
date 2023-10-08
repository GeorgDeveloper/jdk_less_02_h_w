public class GenericPairExample {
    public static <T extends Number> double sum(Pair<T, T> pair) {
        T first = pair.getFirst();
        T second = pair.getSecond();
        return first.doubleValue() + second.doubleValue();
    }

    public static <T> String concatenate(Pair<T, T> pair) {
        T first = pair.getFirst();
        T second = pair.getSecond();
        return first.toString() + second.toString();
    }
}
