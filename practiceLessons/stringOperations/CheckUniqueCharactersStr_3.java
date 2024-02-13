package practiceLessons.stringOperations;

import java.util.HashSet;

public class CheckUniqueCharactersStr_3 {

    static boolean hasUniqueChars(String word) {

        HashSet hashAlphaSet = new HashSet();

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (!hashAlphaSet.add(ch)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        System.out.println("java all unique chars: " + hasUniqueChars("java"));
        System.out.println("test1 all unique chars: " + hasUniqueChars("test1"));
        System.out.println("index all unique chars: " + hasUniqueChars("index"));


    }
}
