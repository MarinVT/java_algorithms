package methodsExercises;

import java.util.Scanner;

public class MiddleCharsString2ndEdit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter some string: ");
        String text = scanner.nextLine();

        System.out.println("The middle part of the string is: " + middlePart(text));
    }

    // Using string builder
    public static String middlePart(String str1) {
        StringBuilder sb = new StringBuilder();
        String str2= " ";

        if (str1.length() % 2 != 0) {
            char temp = str1.charAt(str1.length() / 2);
            sb.append(temp);
        } else {
            char temp = (str1.charAt((str1.length() / 2) - 1));
            char temp2 = str1.charAt(str1.length() / 2);
            sb.append(temp);
            sb.append(temp2);
        }

        str2 = sb.toString();
        return str2;
    }
}
