package stringAndTextProcessing;

public class RemoveAllSpacesFromString {

    public static void removeSpacesStr(String sentence) {
        String result = sentence.replaceAll("[ ]", "");
        System.out.println(result);
    }

    public static void main(String[] args) {
        removeSpacesStr("marin java love");
    }
}
