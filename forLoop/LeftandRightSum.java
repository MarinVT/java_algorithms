package forLoop;

import java.util.Scanner;

public class LeftandRightSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNumber = Integer.parseInt(scanner.nextLine());
        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < inputNumber; i++) {
            int inputLeftSum = Integer.parseInt(scanner.nextLine());
            leftSum += inputLeftSum;
        }

        for (int i = 0; i < inputNumber; i++) {
            int inputRightSum = Integer.parseInt(scanner.nextLine());
            rightSum += inputRightSum;
        }

        if (leftSum == rightSum) {
            System.out.printf("Yes, sum = %d", rightSum);
        } else {
            System.out.printf("No, diff = %d", Math.abs(leftSum - rightSum));
        }
        System.out.println();
    }
}
