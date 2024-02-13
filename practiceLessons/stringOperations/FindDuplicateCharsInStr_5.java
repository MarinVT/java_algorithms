package practiceLessons.stringOperations;

import java.util.HashMap;
import java.util.Map;

public class FindDuplicateCharsInStr_5 {

    // approach 1
    static void countDuplicateCharsStr(String word) {
        int count = 0;

        char[] chars = word.toCharArray();
        System.out.println("Duplicate chars are: ");
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {

                if (chars[i] == chars[j]) {
                    System.out.println(chars[i]);
                    count++;
                    break;
                }
            }
        }
    }

    // approach 2 using Map
    static void duplicateChars(String str) {
        Map<Character, Integer> charMap = new HashMap<Character, Integer>();

        char[] charArr = str.toCharArray();

        for (char c : charArr) {
            if (charMap.containsKey(c)) {
                charMap.put(c, charMap.get(c) + 1);
            } else {
                charMap.put(c, 1);
            }
        }

        for(Map.Entry<Character, Integer> entry : charMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " char " + "repeated " + entry.getValue() + " times");
            }
        }
    }

    // approach 3 HashMap

    static void printDuplicateChars(String word) {
        HashMap<Character, Integer> countHashMap = new HashMap<Character, Integer>();

        for (int i = 0; i < word.length(); i++) {
            if (!countHashMap.containsKey(word.charAt(i))) {
                countHashMap.put(word.charAt(i), 1);
            } else {
                countHashMap.put(word.charAt(i), countHashMap.get(word.charAt(i)) + 1);
            }
        }

        for (Map.Entry mapElement : countHashMap.entrySet()) {
            char key = (char) mapElement.getKey();
            int value = ((int) mapElement.getValue());

            if (value > 1) {
                System.out.println(key + " char repeated "  + value + " times");
            }
        }
    }



    public static void main(String[] args) {
//        countDuplicateCharsStr("marin");
//        duplicateChars("marina");
        printDuplicateChars("tests1");
    }
}
