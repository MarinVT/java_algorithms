package labConditionalStatements;

import java.util.Scanner;

public class LabEvenOrOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num % 2 == 0) {
            System.out.println("odd");
        } else {
            System.out.println("even");
        }
    }
}
