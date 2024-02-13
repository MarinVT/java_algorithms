package methodsExercises;

import java.util.Scanner;

public class PasswordValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String password = scanner.nextLine();

        if (validatePassword(password)) {
            System.out.println("Password is valid");
        }
    }

    public static boolean validatePassword(String str) {
        
        boolean correctCharCount = validateCount(str);
        boolean containsOnlyLettersOrDigits = onlyLettersOrDigits(str);
        boolean hasTwoDigits = validateCountDigit(str);

        return correctCharCount && containsOnlyLettersOrDigits && hasTwoDigits;
    }

    private static boolean validateCountDigit(String str) {
        int digitCount = 0;

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);

            if (Character.isDigit(symbol)) {
                digitCount++;

                if (digitCount >= 2) {
                    return true;
                }
            }
        }

        System.out.println("Password must have at least 2 digits");
        return false;
    }

    private static boolean onlyLettersOrDigits(String str) {

        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);

            if (!Character.isLetterOrDigit(symbol)) {
                System.out.println("Password must consist only of letters and digits");
                return false;
            }
        }
        return  true;
    }

    public static boolean validateCount(String p) {
        boolean isValid = p.length() > 5 && p.length() < 11;

        if (!isValid) {
            System.out.println("Password must be between 6 and 10 characters");
            return false;
        }
        return true;
    }
}
