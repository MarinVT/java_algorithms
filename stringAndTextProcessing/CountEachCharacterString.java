package stringAndTextProcessing;

import java.util.HashMap;
import java.util.Map;

public class CountEachCharacterString {

    static final int MAX_CHAR = 256;

    // 1st approach
    static void getCountCharStr(String word) {
        int count[] = new int[MAX_CHAR];
        int len = word.length();

        for (int i = 0; i < len; i++) {
            count[word.charAt(i)]++;
        }

        char ch[] = new char[word.length()];
        for (int i = 0; i < len; i++) {
            ch[i] = word.charAt(i);
            int find = 0;

            for (int j = 0; j <= i; j++) {
                if (word.charAt(i) == ch[j]) {
                    find++;
                }
            }

            if (find == 1) {
                System.out.println("Number of occurrences of " + word.charAt(i) + " is: " + count[word.charAt(i)]);
            }
        }
    }

    // 2nd approach HashMap

    static void characterCount(String word) {
        // Creating a HashMap containing char as a key and occurrence as a Value
        HashMap<Character, Integer> charCountWordMap = new HashMap<Character, Integer>();

        char[] strArr = word.toCharArray();

        for (char c : strArr) {
            if (charCountWordMap.containsKey(c)) {
                //If char is present in charCountWordMap, incrementing it's count by 1
                charCountWordMap.put(c, charCountWordMap.get(c) + 1);
            } else {
                charCountWordMap.put(c, 1);
            }
        }

        for(Map.Entry entry : charCountWordMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String word = "marin";

//        getCountCharStr(word);
        getCountCharStr(word);
    }
}
