package arraysExercises;

import java.util.Scanner;

public class ArrayElementOccurrence {
    public static void main(String[] args) {

        Character[] vowels = { 'a'};

        System.out.println(arrayStringContainsItem(vowels, 'a'));


    }

    public static int getNumberOccurrence(int[] numbers, int searchElement) {
        int occurrenceNum = 0;

        for (int i = 0; i < numbers.length; i++) {

            if (numbers[i] == searchElement) {
                occurrenceNum++;
            }
        }
        return occurrenceNum;
    }

    public static boolean arrayStringContainsItem(Character[] arrChars, char ch) {

        if (arrChars.length == 0) {
            return false;
        }

        for (Character chars2 : arrChars) {
            if (chars2.equals(ch)) {
                return true;
            }
        }

        return false;
    }

    protected static boolean ok(char[] arrayChars, char searchingForChar) {
        for (int i = arrayChars.length - 1; i >= 0; i--) {
            if (arrayChars[i] == searchingForChar) {
                return true;
            }
        }

        return false;
    }


}
