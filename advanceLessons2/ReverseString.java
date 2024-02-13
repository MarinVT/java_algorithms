package advanceLessons2;

public class ReverseString {
    public static void main(String[] args) {
        String word = "Test";
        System.out.println(reverseStr(word));
        System.out.println(reverseStrManual(word));
    }

    private static String  reverseStr(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    private static String reverseStrManual(String str) {
        StringBuilder stringBuild = new StringBuilder();
        for (int i = str.length()-1; i >= 0; i--) {
            stringBuild.append(str.charAt(i));
        }
        return stringBuild.toString();
    }
}
