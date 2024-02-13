package stringAndTextProcessing;

import java.util.Scanner;

public class TextFilter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] replacements = scanner.nextLine().split(", ");
        String text = scanner.nextLine();

        for (String replacement : replacements) {
            String stars = replacement.replaceAll(".", "*");
            text = text.replace(replacement, stars);
        }

        System.out.println(text);
    }
}
