package forLoopExercises;

import java.util.Scanner;

public class HalfSumElement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());
        int sum = 0;

        int maxNum = Integer.MIN_VALUE;

        for (int i = 1; i <= inputNum; i++) {
            int number1 = Integer.parseInt(scanner.nextLine());
            if (number1 > maxNum) {
                maxNum = number1;
            }
            sum += number1;
        }
        sum -= maxNum;
        if (sum == maxNum) {
            System.out.println("Yes");
            System.out.println("Sum = " + maxNum);
        } else {
            int diff = Math.abs(maxNum - sum);
            System.out.println("No");
            System.out.println("Diff = " + diff);
        }
    }
}
