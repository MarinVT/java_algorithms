package programiz_java_lessons;

import java.util.*;

public class ReverseSentenceRecursion {

    public static void main(String[] args) {
        String text = "marin 123 23";
//        System.out.println(reverseSentenceViaSplit(text));
        System.out.println(reverseSentenceViaList(text));
//        reverseSentenceStrBuilder(text);

    }

    static String reverseSentence(String str) {
        if (str.isEmpty()) {
            return str;
        }

        return reverseSentence(str.substring(1)) + str.charAt(0);
    }

    static String reverseSentenceViaSplit(String sentence) {

        String[] words = sentence.split(" ");
        String rev = "";

        for (int i = words.length - 1; i >= 0; i--) {
            rev += words[i] + " ";
        }
        return  rev;
    }

    // Using StringBuilder

    static void reverseSentenceStrBuilder(String sentence) {

        String[] words = sentence.split(" ");

        StringBuilder reverseSentenceBuilder = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reverseSentenceBuilder.append(words[i]);
            reverseSentenceBuilder.append(" ");
        }

        System.out.println(reverseSentenceBuilder.toString());
    }

    // Using List
    static String reverseSentenceViaList(String sentence) {

        List<String> revList = new ArrayList<>(Arrays.asList(sentence.split(" ")));
        Collections.reverse(revList);

        StringBuffer stringBuffer = new StringBuffer();

        for (String s : revList) {
            stringBuffer.append(s).append(" ");
        }

        return stringBuffer.toString().trim();
    }

}
