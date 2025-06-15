package methodsExercises;

public class CountLettersSpacesNumbersOtherCharString {

    public static void main(String[] args) {

        String word = "Test 1 $";
        countLetterSpacesNumbersOtherChars(word);

    }

    static void countLetterSpacesNumbersOtherChars(String word) {

        // Conver the input to char array
        char[] charsWord = word.toCharArray();

        // Initialize counters for letter, spaces, numbers and other
        int letter = 0;
        int numbers = 0;
        int spaces = 0;
        int other = 0;

        for (int i = 0; i < word.length(); i++) {

            if (Character.isLetter(charsWord[i])) {
                letter++;
            } else if (Character.isDigit(charsWord[i])) {
                numbers++;
            } else if (Character.isSpaceChar(charsWord[i])) {
                spaces++;
            } else {
                other++;
            }

        }

        System.out.println("Letters are total count of " + letter);
        System.out.println("Numbers are total count of " + numbers);
        System.out.println("Spaces are total count of " + spaces);
        System.out.println("Other chars are total count of " + other);

    }

}
