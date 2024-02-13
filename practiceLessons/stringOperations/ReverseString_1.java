package practiceLessons.stringOperations;

public class ReverseString_1 {
    public static void main(String[] args) {

        String reverseStrApproach1 = reverseStr("marin");
//        System.out.println(reverseStrApproach1);
        String reverseStrApproach2 = reverse2ndEdition("marin");
//        System.out.println(reverseStrApproach2);
        String recursiveWay = reverseRecursiveWay("marin");
//        System.out.println(recursiveWay);
        String text = "marin";
        StringBuilder stringBuilder = new StringBuilder(text);
//        System.out.println("Reversed text: " + stringBuilder.reverse());

    }

    // Approach 1 - Using for loop
    public static String reverseStr(String str1) {
        char[] letters = new char[str1.length()];

        int lettersIndex = 0;

        for (int i = str1.length() - 1; i >= 0; i--) {
            letters[lettersIndex] = str1.charAt(i);
            lettersIndex++;
        }

        String rev = "";
        for (int i = 0; i < str1.length(); i++) {
            rev += letters[i];
        }
        return rev;
    }

    // Approach 2 - Using for loop
    public static String reverse2ndEdition(String str) {
        String reverseStr = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            reverseStr = reverseStr + str.charAt(i);
        }

        return reverseStr;
    }

    // Approach 3 - Using recursion
    public static String reverseRecursiveWay(String str) {
        if (str.length() == 1) {
            return str;
        } else {
            return str.charAt(str.length() - 1) + reverseRecursiveWay(str.substring(0, str.length() - 1));
        }
    }
}
