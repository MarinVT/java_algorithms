package forLoop;

import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number1 = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int minNum = Integer.MAX_VALUE;
        for (int i = 1; i <= number1; i++) {
            int num2 = Integer.parseInt(scanner.nextLine());

            if (num2 > maxNum) {
                maxNum = num2;
            }

            if (num2 < minNum) {
                minNum = num2;
            }
        }
        System.out.printf("Max number: %d%n", maxNum);
        System.out.printf("Min number: %d", minNum);
    }
}
