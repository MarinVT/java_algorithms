package advanceLessons2.tortoiseVSHare;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FizzBuzzListApproach {
    public static void main(String[] args) {

     List<String> list = IntStream.rangeClosed(1, 100).mapToObj(
             n -> n % 15 == 0 ? "FizzBuzz"
                     : n % 3 == 0 ? "Fizz"
                     : n % 5 == 0 ? "Buzz"
                     : Integer.toString(n)).collect(Collectors.toList());

        System.out.println(fizzBuzz(100));
    }

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                list.add("FizzBuzz");
            } else if (i % 3 == 0) {
                list.add("Fizz");
            } else if (i % 5 == 0) {
                list.add("Buzz");
            } else {
                list.add(String.valueOf(i));
            }
        }
        return list;
    }
}
