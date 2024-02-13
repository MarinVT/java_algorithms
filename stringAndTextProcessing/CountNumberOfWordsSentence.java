package stringAndTextProcessing;

public class CountNumberOfWordsSentence {

    // 1st approach
    private static int countWordsSentence(String sentence) {
        int count = 1;

        for (int i = 0; i <= sentence.length() - 1; i++) {

            if (sentence.charAt(i) == ' ' && sentence.charAt(i + 1) != ' ') {
                count++;
            }
        }
        return count;
    }

    // 2nd approach
    private static int countWordsSen(String sentence) {
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }

        String[] words = sentence.split(" ");
        return words.length;
    }

    public static void main(String[] args) {
        String sentence = "I love me";

//        System.out.println(countWordsSentence(sentence));
        System.out.println(countWordsSen(sentence));
    }
}
