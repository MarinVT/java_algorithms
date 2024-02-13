package strings;

public class RemoveCharsStringExceptAlphabets {

    public static void main(String[] args) {
        removeChars("$P*r;e..pi, ns'ta^?");
    }

    static void removeChars(String str) {

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) < 'A' || str.charAt(i) > 'Z'
                    && str.charAt(i) < 'a' || str.charAt(i) > 'z') {

                str = str.substring(0, i) + str.substring(i + 1);
                i--;
            }
        }
        System.out.println(str);
    }

}
