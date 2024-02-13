package stringAndTextProcessing;

public class DeleteAllSpacesCharsString {

    static void reverseStr(String str) {

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        System.out.println("Reversed string is: " + rev);
    }



    public static void main(String[] args) {
        String text = "Java";


    }
}
