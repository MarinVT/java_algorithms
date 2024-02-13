package strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class RemovingDuplicatesString {

    public static void main(String[] args) {

        printNoDuplicatesStr("mmaarriinn");

    }


    static void removeDuplicatesLettersString(String str) {

        if (str == null) {
            System.out.println("Enter a word, not a char");
        }

        char[] charLetters = str.toCharArray();

        Set<Character> characterSet = new LinkedHashSet<>();

        for(char ch : charLetters) {
            characterSet.add(ch);
        }

        StringBuilder stringBuilder = new StringBuilder();

        for(Character character : characterSet) {
            stringBuilder.append(character);
        }

        System.out.println(stringBuilder.toString());

    }

    // Using Stream

    static void printNoDuplicatesStr(String str) {
        String noDuplicates = Arrays.asList(
                str.split(""))
                .stream()
                .distinct()
                .collect(Collectors.joining());

        System.out.println(noDuplicates);
    }

}
