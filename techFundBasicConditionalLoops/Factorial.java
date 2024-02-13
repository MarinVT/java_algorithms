package techFundBasicConditionalLoops;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());
        int num = inputNum;

        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            num /= 10;

            int factorial = 1;

            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }

            sum += factorial;
        }

        if (sum == inputNum) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
