package stringAndTextProcessing;

import java.util.Scanner;

public class CaesarCipher3rdEdit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        int length1 = Integer.parseInt(scanner.nextLine());


        int k = Integer.parseInt(scanner.nextLine());
        k = k % 26;

        System.out.println(cipherEncrypt(str, length1, k));
    }

    private static String cipherEncrypt(String str, int length, int shift) {
        StringBuilder stringBuilder = new StringBuilder();
        char c;

        for (int i = 0; i < length; i++) {
            c = str.charAt(i);

            if (Character.isLetter(c)) {

                c = (char) (str.charAt(i) + shift);
            }

            if ((Character.isLowerCase(str.charAt(i)) && c > 'z') ||
                    (Character.isUpperCase(str.charAt(i)) && c >'Z')){
                c = (char) (str.charAt(i) - (26 - shift));
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}
