package forLoop;

import java.util.Scanner;

public class NumbersTo1ToNwithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num1 = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= num1; i+=3) {
            System.out.println(i);
        }
    }
}
