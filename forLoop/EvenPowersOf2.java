package forLoop;

import java.util.Scanner;

public class EvenPowersOf2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num2 = Integer.parseInt(scanner.nextLine());
        int num1 = 1;
        for (int i = 0; i <= num2; i+= 2) {
            System.out.println(num1);
            num1 = num1 * 2 * 2;
        }
    }
}
