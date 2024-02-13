package methodsExercises;

import java.util.Scanner;

public class MiddleChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String text = scanner.nextLine();

        String result = getMiddleChars(text);
        System.out.println(result);
    }

    public static String getMiddleChars(String str) {

        String result = "";

        int middleIndexes = str.length() / 2;

        if (str.length() % 2 == 0) {
            result += str.charAt(middleIndexes - 1);
            result += str.charAt(middleIndexes);
        } else {
            result += str.charAt(middleIndexes);
        }
        return result;
    }
}
