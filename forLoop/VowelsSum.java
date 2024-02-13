package forLoop;

import java.util.Scanner;

public class VowelsSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String letter = scanner.nextLine();

        int sum = 0;

        for (int i = 0; i < letter.length(); i++) {
            if (letter.charAt(i) == 'a'){
                sum += 1;
            } else if (letter.charAt(i) == 'e') {
                sum += 2;
            } else if (letter.charAt(i) == 'i') {
                sum += 3;
            } else if (letter.charAt(i) == 'o') {
                sum += 4;
            } else if (letter.charAt(i) == 'u') {
                sum += 5;
            }
        }
        System.out.println(sum);
    }
}
