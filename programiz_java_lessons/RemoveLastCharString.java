package programiz_java_lessons;

public class RemoveLastCharString {

    public static void main(String[] args) {
        String name = "marko";
        System.out.println(removeLastCharString(name));
    }

    public static String removeLastCharString(String str) {

        return (str == null || str.length() == 0)
        ? null
                :(str.substring(0, str.length() - 1));


    }

}
