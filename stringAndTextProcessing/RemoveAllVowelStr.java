package stringAndTextProcessing;

public class RemoveAllVowelStr {

    public static String removeAllVowelsStr(String vowelsRemove) {
        String result = vowelsRemove.replaceAll("[AEIOUaeiou]", "");
        return result;
    }

    public static void main(String[] args) {
        System.out.println(removeAllVowelsStr("marin"));
    }
}
