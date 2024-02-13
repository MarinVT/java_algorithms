package techFundBasicConditionalLoops;

import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String username = scanner.nextLine();
        String password = "";

        for (int i = username.length() - 1; i >= 0; i--) {
            password += username.charAt(i);
        }

        String inputPassword = scanner.nextLine();
        int attempt = 1;

        while (!inputPassword.equals(password)) {
            attempt++;
            System.out.println("Incorrect password. Try again.");

            inputPassword = scanner.nextLine();

            if (attempt == 4){
                break;
            }
        }

        if (inputPassword.equals(password)) {
            System.out.println("User " + username + " logged in.");
        } else {
            System.out.println("User " + username + " blocked!");
        }
    }
}
