package advanceLessons2;

import java.util.Scanner;

public class Factorial2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the nth value as integer: ");
        int nth = Integer.parseInt(scanner.nextLine());
        scanner.close();

        System.out.println("Loop calculation: Factorial of " + nth + " is " + calculateLoop(nth));
        System.out.println("Loop 2 calculation: Factorial of " + nth + " is " + loopCalculate2(nth));
    }

    private static int loopCalculate2(int n) {
        int fact = n;
        for (int i = 1; i < n; i++) {
            fact *= i;
        }
        return fact;
    }

    private static int calculateLoop(int n) {
        int factorial = 1;

        for (int i = n; i >= 1; i--) {
            factorial *= i;
        }

        return factorial;
    }
}
