package stringAndTextProcessing;

public class CountWordsFromCapitalizedString {
    public static void main(String[] args) {
        String sentence = "JavaIsTheBestNow";

//        getCountCapWordsString(sentence);
//        countUpperCaseWordsSentence(sentence);
        upperCaseCountStr(sentence);
        upperCaseCountStr2(sentence);
    }


    static void getCountCapWordsString(String sentence) {
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {

            if (sentence.charAt(i) >= 'A' && sentence.charAt(i) <= 'Z') {
                count++;
            }
        }

        System.out.println("Count of Words From a Capitalized String is: " + count + " times");
    }

    static void countUpperCaseWordsSentence(String sentence) {
        int count = 0;

        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isUpperCase(sentence.charAt(i))) {
                count++;
            }
        }
        System.out.println("Count of Words From a Capitalized String is: " + count + " times");
    }

    // Using streams
    static void upperCaseCountStr(String sentence) {
        long count = sentence.chars().filter(e -> e >= 65 && e <= 90).count();
        System.out.println("Count of Words From a Capitalized String is: " + count + " times");
    }

    // Using streams 2 approach
    static void upperCaseCountStr2(String sentence) {
        long count = sentence.chars().filter(e -> Character.isUpperCase(e)).count();
        System.out.println("Count of Words From a Capitalized String is: " + count + " times");
    }
}
