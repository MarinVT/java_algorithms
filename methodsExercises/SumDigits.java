package methodsExercises;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  digit: ");
        int digit = Integer.parseInt(scanner.nextLine());
        System.out.println("The sum of digit is: " + sumDigits(digit));
    }

    private static int sumDigits(long n) {
        int result = 0;

        while (n > 0) {
            result+=n % 10;
            n /=10;
        }
        return result;
    }
}
