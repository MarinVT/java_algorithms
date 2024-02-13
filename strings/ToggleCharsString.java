package strings;

public class ToggleCharsString {

    public static void main(String[] args) {

        toggleCharsString("");

    }

    static void toggleCharsString(String str) {
        String result = "";

        if (str.trim().length() == 0 && str.trim().isEmpty()) {
            System.out.println("Add some word!!!");
        } else {
         for (int i = 0; i < str.length(); i++) {

                if (Character.isUpperCase(str.charAt(i))) {
                   result = result + Character.toLowerCase(str.charAt(i));
              } else {
                  result = result + Character.toUpperCase(str.charAt(i));
               }
         }
        }
        System.out.println("Toggle String is: " + result);
    }

}
