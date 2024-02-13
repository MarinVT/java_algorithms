package stringAndTextProcessing;

import java.util.Scanner;

public class CaesarCipher4thEdit {

    public static StringBuilder encryptProcess(String str, int shift) {
        StringBuilder resultStrBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            if (Character.isUpperCase(str.charAt(i))) {
                char c = (char) (((int) str.charAt(i) + shift-65) % 26 + 65);
                resultStrBuilder.append(c);
            } else {
                char ch = (char) (((int) str.charAt(i) + shift - 97) % 26 + 97);
                resultStrBuilder.append(ch);
            }
        }
        return resultStrBuilder;
    }

    public static StringBuilder decryptProcess(String strCipher, int shift) {
        StringBuilder resultStrBuilder = new StringBuilder();

        for (int i = 0; i < strCipher.length(); i++) {

            if (Character.isUpperCase(strCipher.charAt(i))) {
                char c = (char) (((int) strCipher.charAt(i) + shift - 65) % 26 + 65);
                resultStrBuilder.append(c);
            } else {
                char c = (char) (((int) strCipher.charAt(i) + shift - 97) % 26 + 97);
                resultStrBuilder.append(c);
            }
        }
        return resultStrBuilder;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int shifting = Integer.parseInt(scanner.nextLine());

        System.out.println("Example 1: ");
        System.out.println("Encryption: ");
        System.out.println("Text: " + input);
        System.out.println("Shift text -> " + shifting);
        String cipher = encryptProcess(input, shifting).toString();
        System.out.println("Encrypted text cipher <> " + cipher);
        System.out.println("<-------------------->");
        System.out.println("Encrypted Cipher: " + cipher);
        System.out.println("Decryption");
        System.out.println("Encrypted Cipher: " + cipher);
        System.out.println("Shift -> " + shifting);
        String decryptedText = decryptProcess(cipher, 26 - shifting).toString();
        System.out.println("Decrypted Text <> " + decryptedText);
    }


}
