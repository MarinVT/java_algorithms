package practiceLessons.stringOperations;

import java.util.Arrays;

public class TwoStringsAnagrams_2 {

    // Using String method
    public static boolean isAnagrams(String word1, String anagramWord2) {
        if (word1.length() != anagramWord2.length()) {
            System.out.println("They are not anagrams!");
            return false;
        }

        for (int i = 0; i < word1.length(); i++) {
            char ch = word1.charAt(i);
            int index = anagramWord2.indexOf(ch);

            if (index != -1) {
                anagramWord2 = anagramWord2.substring(0, index)
                        + anagramWord2.substring(index + 1, anagramWord2.length());
            } else {
                return false;
            }
        }

        return anagramWord2.isEmpty();
    }

    // Using sort()
    public static boolean isAnagramSort(String word, String anagram) {
        String str1 = sortChars(word);
        String strAnagram1 = sortChars(anagram);

        return str1.equals(strAnagram1);
    }

    public static String sortChars(String word) {
        char[] wordArr = word.toLowerCase().toCharArray();
        Arrays.sort(wordArr);
        return String.valueOf(wordArr);
    }

    // Custom approach 2
    static boolean isAnagram2(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }

        char[] ch1 = str1.toCharArray();
        char[] ch2 = str2.toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }


    public static void main(String[] args) {
        String word1 = "Marin";
        String anagramWord = "marin";
        // String method
//        System.out.println("Word1 and anagramWord are anagrams: " + isAnagrams(word1, anagramWord));
        // Sort approach
//        System.out.println(isAnagramSort(word1, anagramWord));
        // Custom approach 2
//        System.out.println(isAnagram2(word1, anagramWord));


    }

}
