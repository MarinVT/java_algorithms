package nav_automation;

public class RemoveLastCharacterStr {
    public static void main(String[] args) {

        System.out.println(removeLastChar("marin"));


    }


    static String removeLastChar(String str) {
        return str.substring(0, str.length() - 1);
    }
}
