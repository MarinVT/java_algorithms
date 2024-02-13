package techFundArraysExercises;

import java.util.Scanner;

public class ZigZagArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int linesCount = Integer.parseInt(scanner.nextLine());

        int[] firstArr = new int[linesCount];
        int[] secondArr = new int[linesCount];

        for (int i = 0; i < linesCount; i++) {
            String[] numbers = scanner.nextLine().split(" ");

            if (i % 2 == 0) {
                firstArr[i] = Integer.parseInt(numbers[0]);
                secondArr[i] = Integer.parseInt(numbers[1]);
            } else {
                firstArr[i] = Integer.parseInt(numbers[1]);
                secondArr[i] = Integer.parseInt(numbers[0]);
            }
        }

        for (int i : firstArr) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : secondArr) {
            System.out.print(i + " ");
        }
    }
}
