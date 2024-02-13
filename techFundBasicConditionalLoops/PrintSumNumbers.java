package techFundBasicConditionalLoops;

import java.util.Scanner;

public class PrintSumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int startPoint = Integer.parseInt(scanner.nextLine());
        int endPoint = Integer.parseInt(scanner.nextLine());

        int sum = 0;

        for (int i = 1; i <= 10; i++) {
            sum += i;
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println("Sum: " + sum);
    }
}
