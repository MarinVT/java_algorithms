package practiceLessons.stringOperations;


import java.util.*;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class FindFirstNonRepeatedCharacterInString {
    public static void main(String[] args) {

        System.out
                .println("First non repeated character for String analogy is : "
                        + getNonRepeatChar("analogy"));
        System.out
                .println("First non repeated character for String easiest is : "
                        + getNonRepeatChar("easiest"));

    }

   public static Character getNonRepeatChar(String str) {
        Map<Character, Integer> countChars = new LinkedHashMap<Character, Integer>();

        for (int i = 0; i < str.length() - 1; i++) {
            Character c = str.charAt(i);

            if (!countChars.containsKey(c)) {
                countChars.put(c, 1);
            } else {
                countChars.put(c, countChars.get(c) + 1);
            }
        }

        for (Entry<Character, Integer> e : countChars.entrySet()) {
            if (e.getValue() == 1) {
                return e.getKey();
            }
        }
        return  null;
    }

//    Iterate through each character of string.
//    If lastIndexOf and indexOf return same value, then it is first non repeating character in the Stri
    public static Character getNonRepeatFirstCharString(String str) {
        char charArr[] = str.toCharArray();

        for (int i = 0; i < str.length(); i++) {
            if (str.lastIndexOf(charArr[i]) == str.indexOf(charArr[i])) {
                return charArr[i];
            }
        }
        return null;
    }

}
