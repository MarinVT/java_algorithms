package stringAndTextProcessing;

import java.util.Scanner;

public class ReplaceRepeatingChars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String textSymbols = scanner.nextLine();
        String result = "";

        char prevSymbol = textSymbols.charAt(0);
        result+=prevSymbol;
        for (int i = 1; i < textSymbols.length(); i++) {
            char symbol = textSymbols.charAt(i);

            if (prevSymbol != symbol) {
                prevSymbol = symbol;
                result += prevSymbol;
            }
        }

        System.out.println(result);
    }
}
