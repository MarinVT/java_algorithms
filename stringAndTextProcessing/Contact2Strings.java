package stringAndTextProcessing;

import java.util.Scanner;

//Java program to concatenate two strings using concat and append methods

public class Contact2Strings {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first String");
        String str1 = scanner.nextLine();

        System.out.println("Enter second String");
        String str2 = scanner.nextLine();

        StringBuilder str3 = new StringBuilder(str1);
        str3.append(str2);
        System.out.println("Concatenated new string is: " + str3);
    }
}
