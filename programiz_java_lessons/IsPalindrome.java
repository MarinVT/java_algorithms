package programiz_java_lessons;
/*
    A string is called a palindrome string if the reverse of
    that string is the same as the original string.
    For example, radar, level, etc.
 */
public class IsPalindrome {

    public static void main(String[] args) {

        isPalindrome("level", "level");

    }

    static void isPalindrome(String original, String isPalindrome) {

        String reversedStr = "";

        for (int i = original.length() - 1; i >= 0; i--) {
            reversedStr = reversedStr + original.charAt(i);
        }


        if (original.length() <= 0 && isPalindrome.length() <= 0) {
            System.out.println("Do not enter wrong data!!!!! Please enter a normal word");
        } else {
            if (original.equals(isPalindrome)) {
                System.out.println("The original word " + original + " is palindrome of the expected word " + isPalindrome);
            } else {
                System.out.println("The original word " + original + " is not palindrome of the expected word " + isPalindrome);
            }
        }

    }

}
