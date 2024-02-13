package dataTypesAndVariables;

import java.util.Scanner;

public class CharsToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = scanner.nextLine() +
        scanner.nextLine() +
        scanner.nextLine();

        System.out.println(data);
    }
}
