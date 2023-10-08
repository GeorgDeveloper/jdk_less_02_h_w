public class Main {
    public static void main(String[] args) {


        Pair<Integer, Integer> intPair = new Pair<>(3, 5);
        System.out.println("Sum of integers: " + GenericPairExample.sum(intPair));

        Pair<String, String> stringPair = new Pair<>("Hello, ", "world!");
        System.out.println("Concatenation of strings: " + GenericPairExample.concatenate(stringPair));
    }
}