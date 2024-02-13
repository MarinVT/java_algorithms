package advanceLessons2.sieveOfEratosthenes;

import java.util.Scanner;

public class SieveEratosthenes {

    static boolean[] allNumbers;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number n: ");

        int n = Integer.parseInt(scanner.nextLine());
        scanner.close();
        int arrSize = n + 1;

        createArr(arrSize);
        sieve(arrSize);
    }

    static void sieve(int n) {

        for (int i = 2; i < n; i++) {
            if (allNumbers[i]) {
                for (int j = i; i * j < n ; j++) {
                    allNumbers[i * j] = false;
                }
            }
        }

        int counter = 0;

        for (int i = 2; i < n; i++) {
            if (allNumbers[i]) {
                System.out.print(i + "  ");
                counter++;
            }

            if (counter == 10) {
                System.out.print("\n");
                counter = 0;
            }
        }
    }


    static void createArr(int n) {
        allNumbers = new boolean[n];

        for (int i = 0; i < n; i++) {
            allNumbers[i] = true;
        }
    }
}
