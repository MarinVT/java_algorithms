package practiceLessons.stringOperations;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountOccurrencesOfCharacter {

    // Custom approach
    public static String countVowelOccurrence(String text, char searchChar) {

        int count = 0;
        for (int i = 0; i < text.length(); i++) {

            if (text.charAt(i) == searchChar) {
                count++;
            }
        }
        return ("The specified vowel occurs " + count + " times");
    }

    // Using Recursion
    static int findOccurrencesRecursive(String text, char seachChar, int index) {
        if (index == text.length()) {
            return 0;
        }

        int count = 0;

        if (text.charAt(index) == seachChar) {
            count++;
        }

        return count + findOccurrencesRecursive(text, seachChar, index + 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputWord = scanner.next();
        char searchSpecificChar = 'a';

        int count = 0;
        // Simple way
        for (int i = 0; i < inputWord.length(); i++) {

            if (inputWord.charAt(i) == searchSpecificChar) {
                count++;
            }
        }

        // Lambda Expression
        long countLambdaApproach = inputWord.chars().filter(ch -> ch == searchSpecificChar).count();
        System.out.println("The char '" + searchSpecificChar  + "' occurs " + countLambdaApproach + " times");

        // Using Collections (Map)
        Map<Character, Integer> myMap = new HashMap<Character, Integer>();

        for (int i = 0; i < inputWord.length(); i++) {
            if (myMap.containsKey(inputWord.charAt(i))) {
                myMap.put(inputWord.charAt(i), myMap.get(inputWord.charAt(i)) + 1);
            } else {
                myMap.put(inputWord.charAt(i), 1);
            }
        }
        int finalResult = myMap.get(searchSpecificChar);
//        System.out.println("The Char '" + searchSpecificChar + "' appears " + finalResult + " times.");


//        System.out.println("The character" + searchSpecificChar + " appears " + count + " times");
//        System.out.println(countVowelOccurrence(inputWord, 'a'));
//        System.out.println(findOccurrencesRecursive(inputWord, 'a', 0) + " times vowel occurs in text");

    }
}
