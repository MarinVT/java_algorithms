package strings;

public class CheckIfStringContainsOnlyDigits {

    public static void main(String[] args) {

        String str = "11421";
        int len = str.length();

        System.out.println(strContainsLetter(str, len));

    }

    static boolean strContainsLetter(String str, int num) {

        for (int i = 0; i < num; i++) {

            // Check if character is not a digit between 0-9 then return false
            if (str.charAt(i) < '0' || str.charAt(i) > '9') {
                return false;
            }
        }

        // If we reach here, that means all characters were digits
        return true;
    }

}
