package associativeArrays;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class CountCharsInString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        countCharsStr(text);


    }

    static void countCharsStr(String word) {
        //Keep the sequential order of inserting using link hash map
        LinkedHashMap<Character, Integer> charByOccurances = new LinkedHashMap<>();


        for (int i = 0; i < word.length(); i++) {
            char symbol1 = word.charAt(i);

            if (symbol1 != ' ') {
                if (!charByOccurances.containsKey(symbol1)) {
                    charByOccurances.put(symbol1, 1);
                } else {
                    charByOccurances.put(symbol1, charByOccurances.get(symbol1) + 1);
                }
            }
        }

        for (Character characterLetter : charByOccurances.keySet()) {
            System.out.println(String.format("%c -> %d", characterLetter, charByOccurances.get(characterLetter)));
        }
    }
}
