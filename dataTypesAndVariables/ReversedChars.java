package dataTypesAndVariables;

import java.util.Scanner;

public class ReversedChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String data = "";

        for (int i = 0; i < 3; i++) {
            data += scanner.nextLine();
        }

        for (int i = data.length() - 1; i >= 0; i--) {
            System.out.print(data.charAt(i) + " ");
        }
        System.out.println();
    }
}
