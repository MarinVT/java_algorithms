package stringAndTextProcessing;

public class isVowelOrConsonant {

    private static char isVowelOrConsonant(char c) {


        if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
            System.out.println("Its Vowel");
            return Character.toLowerCase(c);
        } else {
            System.out.println("Its consonant");
            return  Character.toLowerCase(c);
        }
    }

    public static void main(String[] args) {
        System.out.println(isVowelOrConsonant('A'));
    }
}
