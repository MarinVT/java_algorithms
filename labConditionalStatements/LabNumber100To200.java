package labConditionalStatements;

import java.util.Scanner;

public class LabNumber100To200 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = Integer.parseInt(scanner.nextLine());

        if (num < 100) {
            System.out.println("Less then 100");
        } else if (num >= 100 && num < 200) {
            System.out.println("Between 100 and 200");
        } else {
            System.out.println("Greater then 200");
        }
    }
}
