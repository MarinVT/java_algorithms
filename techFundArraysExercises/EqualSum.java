package techFundArraysExercises;

import java.util.Scanner;

public class EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] strNumbers = scanner.nextLine().split(" ");

        int[] numbers = new int[strNumbers.length];

        for (int i = 0; i < strNumbers.length; i++) {
            numbers[i] = Integer.parseInt(strNumbers[i]);
        }

        boolean hasEqualSum = false;

        for (int i = 0; i < numbers.length; i++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int j = i - 1; j >= 0; j--) {
                leftSum+=numbers[j];
            }

            for (int j = i + 1; j < numbers.length; j++) {
                rightSum+=numbers[j];
            }

            if (leftSum == rightSum) {
                System.out.println(i);
                hasEqualSum = true;
                break;
            }
        }
        if (!hasEqualSum) {
            System.out.println("no");
        }
    }
}
