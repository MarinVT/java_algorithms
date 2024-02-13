package strings;

public class RemoveBracketsStr {

    public static void main(String[] args) {
        String str = "Te()s{}t";
        removeBracketStr(str);

    }

    static void removeBracketStr(String str) {

        String result = str.replaceAll("[(){}]", "");
        System.out.println(result);

    }
}
