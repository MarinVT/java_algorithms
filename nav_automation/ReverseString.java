package nav_automation;

public class ReverseString {
    public static void main(String[] args) {

        String str = "Marin123";
//        System.out.println(reverseStr(str));
//        System.out.println(reverse2StrBuffer(str));
    }

    static String reverseStr(String str) {

        String rev = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        return rev;
    }

    // Use StringBuffer
    static String reverse2StrBuffer(String str) {
        return new StringBuffer(str).reverse().toString();
    }
}
