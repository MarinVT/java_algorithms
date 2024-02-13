package dataTypesAndVariables;

import java.util.Scanner;

public class PoundToDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double currencyUS = Double.parseDouble(scanner.nextLine());
        System.out.printf("%.3f", currencyUS * 1.31);
    }
}
