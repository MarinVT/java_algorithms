package dataTypesAndVariables;

import java.util.Scanner;

public class SpiceMustFlow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int spice = Integer.parseInt(scanner.nextLine());
        int days = 0;
        int totalSpice = 0;

        while (spice >= 100) {
            days++;
            totalSpice += (spice - 26);
            spice -= 10;
        }

        if (totalSpice >= 26) {
            totalSpice -= 26;
        }

        System.out.println(days);
        System.out.println(totalSpice);
    }
}
