package mathematicalAlgorithms;

import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {

        String str = "ABC";
        int n = str.length();
        Permutation permutation = new Permutation();
//        permutation.permute(str, 0, n - 1);

        // Approach 2
        Scanner scanner = new Scanner(System.in);

        String answer = "";
        System.out.print("enter string: ");
        String input = scanner.next();

        System.out.print("\nAll possible string are: ");
        permute2ndEdition(input, answer);
    }

    /**
     * permutation function
     * @param str string to calculate permutation for
     * @param startIndex starting index
     * @param endIndex end index
     */

    public void permute(String str, int startIndex, int endIndex) {

        if (startIndex == endIndex) {
            System.out.println(str);
        } else {
            for (int i = startIndex; i <= endIndex; i++) {
                str = swap(str, startIndex, i);
                permute(str, startIndex+1, endIndex);
                str = swap(str, startIndex, i);
            }
        }
    }

    /**
     * Swap Characters at position
     * @param strValue string value
     * @param positionOne position 1
     * @param positionTwo position 2
     * @return swapped string
     */
    private String swap(String strValue, int positionOne, int positionTwo) {
        char temp;
        char[] charArray = strValue.toCharArray();
        temp = charArray[positionOne];
        charArray[positionOne] = charArray[positionTwo];
        charArray[positionTwo] = temp;
        return String.valueOf(charArray);
    }

    // Approach 2

    static void permute2ndEdition(String str, String answer) {
        if (str.length() == 0) {
            System.out.println(answer + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String leftSubStr = str.substring(0, i);
            String rightSubStr = str.substring(i + 1);
            String rest = leftSubStr + rightSubStr;
            permute2ndEdition(rest, answer + ch);
        }
    }
}
