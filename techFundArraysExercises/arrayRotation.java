package techFundArraysExercises;

import java.util.Scanner;

public class arrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] numberStr = scanner.nextLine().split(" ");

        int rotations = Integer.parseInt(scanner.nextLine());

        rotations = rotations % numberStr.length;

        for (int i = 0; i < rotations; i++) {
            String element = numberStr[0];

            for (int j = 0; j < numberStr.length - 1; j++) {
                numberStr[j] = numberStr[j + 1];
            }
            numberStr[numberStr.length - 1] = element;
        }

        for (String  str : numberStr) {
            System.out.print(str + " ");
        }
    }
}
