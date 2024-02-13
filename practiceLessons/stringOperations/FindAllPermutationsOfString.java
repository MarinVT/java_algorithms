package practiceLessons.stringOperations;

import java.util.ArrayList;
import java.util.List;

public class FindAllPermutationsOfString {

    private static List<String> permutations(String prefix, String str) {
        List<String> permutations = new ArrayList<>();

        int numberLength = str.length();

        if (numberLength == 0) {
            permutations.add(prefix);
        } else {
            for (int i = 0; i < numberLength; i++) {
                permutations.addAll(
                        permutations(
                        prefix + str.charAt(i),
                        str.substring(i + 1, numberLength)
                                + str.substring(0, i)));
            }
        }
        return permutations;
    }

    public static void main(String[] args) {
        List<String> perms = permutations("", "abcd");

        String[] arr = new String[perms.size()];

        for (int i = 0; i < perms.size(); i++) {
            arr[i] = perms.get(i);
        }

        int x = arr.length;

        for (final String anArr : arr) {
            System.out.println(anArr);
        }
    }
}
