package stringAndTextProcessing;

public class CountOccurrences {

    public static void main(String[] args) {

//        countOccurrencesCharLetter("2", 'a');
//        System.out.println(recursiveCountOccurrences("marin", 'a', 0));
        countOccurrences("marina", 'a');

    }

    // Iterative Approach
    static void countOccurrencesCharLetter(String word, char ch) {

        int counter = 0;

        if (word.length() == 1 || word.isEmpty() || word == null) {
            System.out.println("Enter a world");
        } else {
            for (int i = 0; i < word.length(); i++) {
                if (word.charAt(i) == ch) {
                    counter++;
                }
            }
            System.out.printf("Occurrences of %d are %c", counter, ch);
        }

    }

    // Using Recursion

    static int recursiveCountOccurrences(String str, char ch, int ind) {
        if (ind == str.length()) {
            return 0;
        }

        int count = 0;

        if (str.charAt(ind) == ch) {
            count++;
        }

        return count + recursiveCountOccurrences(str, ch, ind + 1);

    }

    // Arrow function

    static void countOccurrences(String str, char c) {
        long count = str.chars().filter(ch -> ch == c).count();
        System.out.println(count);
    }

}
