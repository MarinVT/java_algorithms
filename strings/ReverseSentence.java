package strings;

public class ReverseSentence {

    //  Its a program that reverses every word of a string and displays the reversed string as an output
    static void reverseSentence(String sentence) {

        String[] words = sentence.split(" ");
        String reversedSentence = "";

        for (int i = 0; i < words.length; i++) {

            String word = words[i];
            String reversedWord = "";

            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord = reversedWord + word.charAt(j);
            }

            reversedSentence = reversedSentence + reversedWord + " ";
        }

        System.out.println(sentence);
        System.out.println(reversedSentence);

    }

    public static void main(String[] args) {

        reverseSentence("Java is the best!");

    }

}
