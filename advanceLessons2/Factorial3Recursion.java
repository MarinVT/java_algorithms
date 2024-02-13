package advanceLessons2;

import java.util.Scanner;

public class Factorial3Recursion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter nth value: ");
        int nth = Integer.parseInt(scanner.nextLine());
        scanner.close();

        System.out.println("Recursion approach factorial: " + calculateNth(nth));
    }

    private static int calculateNth(int n) {
        if (n == 1) {
            return 1;
        }

        return n * calculateNth(n - 1);
    }


}
