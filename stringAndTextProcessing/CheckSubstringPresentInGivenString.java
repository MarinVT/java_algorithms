package stringAndTextProcessing;

public class CheckSubstringPresentInGivenString {

    static boolean isSubStrPresentInStr(String mainStr, String isPresentedStr) {

        return mainStr.matches("(.*)" + isPresentedStr + "(.*)");
    }

    static boolean isSubStrPresentInStr1(String mainStr, String isPresentedStr) {

        return mainStr.contains(isPresentedStr);
    }

    public static void main(String[] args) {
        String sentence = "Java is the best... everywhere";

        System.out.println(isSubStrPresentInStr1(sentence, "Java"));
    }
}
