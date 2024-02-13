package forLoop;

import java.util.Scanner;

public class NumbersNto1Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        for (int i = num1; i >= 1 ; i--) {
            System.out.println(i);
        }
    }
}
