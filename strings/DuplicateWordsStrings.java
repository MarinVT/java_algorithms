package strings;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class DuplicateWordsStrings {

    public static void main(String[] args) {

        String test = "This sentence contains two words, one and two";
        Set<String> duplicatesPrint = duplicateWordsSentence(test);
        System.out.println("Listing the main sentence: " + test);
        System.out.println("Listing duplicates words: " + duplicatesPrint);

    }

    static Set<String> duplicateWordsSentence(String inputString) {
        if (inputString == null || inputString.isEmpty()) {
            return Collections.emptySet();
        }

        Set<String> duplicatesSet = new HashSet<>();

        String[] words = inputString.split("\\s+");
        Set<String> set = new HashSet<>();

        for (String word: words) {
            if (!set.add(word)) {
                duplicatesSet.add(word);
            }
        }

        return duplicatesSet;
    }

}
