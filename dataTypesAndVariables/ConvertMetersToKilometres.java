package dataTypesAndVariables;

import java.util.Scanner;

public class ConvertMetersToKilometres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int meters = Integer.parseInt(scanner.nextLine());
        System.out.println(String.format("%.2f",meters / 1000.0));
//        System.out.printf("%.2f", meters * 0.001);
    }
}
