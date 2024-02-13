package dataTypesAndVariables;

import java.util.Scanner;

public class LowerOrUpperCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str1 = scanner.nextLine();

        if (str1.charAt(0) >= 65 && str1.charAt(0) <= 90) {
            System.out.println("upper-case");
        } else {
            System.out.println("lower-case");
        }
    }
}
