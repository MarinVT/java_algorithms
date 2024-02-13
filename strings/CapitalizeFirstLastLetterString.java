package strings;

public class CapitalizeFirstLastLetterString {

    public static void main(String[] args) {

        System.out.println(capitalizeFirstLastLetterStr("marin"));

    }

    static String capitalizeFirstLastLetterStr (String str) {

        String result = "";

        String[]  strArrLetters = str.split(" ");

        for (String letter : strArrLetters) {

            String firstLetter = letter.substring(0, 1);
            String restChars = letter.substring(1, letter.length() - 1);
            String lastLetter = Character.toString(letter.charAt(letter.length() - 1));
            result = result + firstLetter.toUpperCase() + restChars + lastLetter.toUpperCase();
        }

        return result;
    }

}
