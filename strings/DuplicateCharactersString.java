package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateCharactersString {

    static void findDuplicateCharsInString(String str) {

        // Convert the string to char array
        char[] charsInString = str.toCharArray();

        // Create a HashMap
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        /* Idea: char are inserted as KEYS and their count as VALUE.
        If map contains the char already then increase the value by 1.
         */

        for (Character ch : charsInString) {
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Obtaining set of keys

        Set<Character> keys = map.keySet();

        /* Display count of chars if it is greater than 1.
        All duplicate chars would be having value greater than 1.
         */

        for (Character ch: keys) {
            if (map.get(ch) > 1) {
                System.out.println("Char " + ch + " repeated " + map.get(ch) + " times!");
            } else if (map.get(ch) == 1) {
                System.out.print(str);
            }
        }
    }

    static void printDuplicateChars2(String word) {
        char[] charsWord = word.toCharArray();

        Map<Character, Integer> charMap = new HashMap<Character, Integer>();
        for (Character ch : charsWord) {
            if (charMap.containsKey(ch)) {
                charMap.put(ch, charMap.get(ch) + 1);
            } else {
                charMap.put(ch, 1);
            }
        }

        Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
        System.out.printf("List of duplicate characters in String '%s' %n", word);

        for (Map.Entry<Character, Integer> entry: entrySet) {
            if (entry.getValue() > 1) {
                System.out.printf("%s : %d %n", entry.getKey(), entry.getValue());
            }
        }

    }



    public static void main(String[] args) {

//        findDuplicateCharsInString("marin");
        printDuplicateChars2("marina");
    }
}
