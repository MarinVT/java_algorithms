package firstSteps;

import java.util.Scanner;

public class DisplayMiddleCharStr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number");

        String strNum = scanner.nextLine();

        System.out.println("The middle char of the number is: " + middleCharStr(strNum));
    }

    public static String middleCharStr(String str1) {
        StringBuilder strBuilder = new StringBuilder();
        String str2 = "";

        if (str1.length() % 2 != 0) {
            char tempEven = str1.charAt(str1.length() / 2);
            strBuilder.append(tempEven);
        } else {
            char tempOdd = (str1.charAt((str1.length() / 2) - 1));
            char tempOdd2 = str1.charAt(str1.length() / 2);
            strBuilder.append(tempOdd);
            strBuilder.append(tempOdd2);
        }

        str2 = strBuilder.toString();
        return str2;
    }
}
