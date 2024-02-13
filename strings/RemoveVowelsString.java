package strings;

public class RemoveVowelsString {

    public static void main(String[] args) {

        System.out.println(removeVowelsStr("s"));

    }

    static String removeVowelsStr(String str) {
        if (str == null || str.length() <= 1 || str.equals(" ")) {
            return "add new word";
        }

        String replace = "";
        replace = str.replaceAll("[aeiou]", replace);

        return replace;
    }

}
