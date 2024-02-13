package stringAndTextProcessing;

import java.util.Scanner;

public class ValidUsernames {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] usernames = scanner.nextLine().split(", ");

        for (int i = 0; i < usernames.length; i++) {
            if (isUsernameValid(usernames[i])) {
                System.out.println(usernames[i]);
            }
        }
    }

    public static boolean isUsernameValid(String username) {

        if (username.length() < 3 || username.length() > 16) {
            return false;
        }

        //TODO: add symbol check logic

        for (int i = 0; i < username.length(); i++) {
            char symbol = username.charAt(i);

            if (!(Character.isLetterOrDigit(symbol) || symbol == '-' || symbol == '_')) {
                return false;
            }
        }

        return true;
    }
}
