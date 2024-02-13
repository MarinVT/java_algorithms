package dataTypesAndVariables;

import java.util.Scanner;

public class SumDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numberAsText = scanner.nextLine();
        int sum = 0;

        for (int i = 0; i < numberAsText.length(); i++) {
            sum += numberAsText.charAt(i) - '0';
        }

        System.out.println(sum);
    }
}
