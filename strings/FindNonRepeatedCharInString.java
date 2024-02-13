package strings;

import java.util.*;
import java.util.Map.Entry;

public class FindNonRepeatedCharInString {
    public static void main(String[] args) {





    }

    static void firstNonRepeatedChar1(String str) {

        boolean unique = true;

        for (int i = 0; i < str.length(); i++) {

            for (int j = 0; j < str.length(); j++) {

                if (i != j && str.charAt(i) == str.charAt(j)) {
                    unique = false;
                    break;
                }

            }

            if (unique) {
                System.out.println("First unique char is: " + str.charAt(i));
            }
        }

    }

    static void printFirstNonRepeatedChar(String str) {

        boolean flag = true;

        for (char s : str.toCharArray()) {

            if (str.indexOf(s) == str.indexOf(s)) {
                System.out.println("First non-repeated char: " + s);
                flag = false;
                break;
            }

        }

        if (flag) {
            System.out.println("There is non repeated chars!");
        }
    }

    // Using LinkedHashMap

    static Character firstNonRepeatedChar(String str) {
        HashMap<Character, Integer> characterIntegerHashMap =
                new LinkedHashMap<Character, Integer>();

        Character ch;

        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);

            if (characterIntegerHashMap.containsKey(ch)) {
                characterIntegerHashMap.put(ch, characterIntegerHashMap.get(ch) + 1);
            } else {
                characterIntegerHashMap.put(ch, 1);
            }
        }

        for (Entry<Character, Integer> entry: characterIntegerHashMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }

        return null;
    }

//    Using Set and ArrayList

    static Character printFirstNonRepeatedCharStr(String str) {

        Set<Character> repeatingChar = new HashSet<>();
        List<Character> nonRepeatingChar = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if (repeatingChar.contains(letter)) {
                nonRepeatingChar.remove((Character) letter);
                repeatingChar.add(letter);
            } else {
                nonRepeatingChar.add(letter);
            }

        }
        return nonRepeatingChar.get(0);
    }
}
