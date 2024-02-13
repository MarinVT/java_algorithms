package stringAndTextProcessing;

import java.util.function.IntPredicate;

public class CountVowelsStr {
    // a, e, i, o, u, y
    static boolean isVowel(char v) {
        return  v=='a' || v=='e' || v=='i' || v=='o' || v=='u' || v=='y' ||
                v=='A' || v=='E' || v=='I' || v=='O' || v=='U' || v=='Y';
    }

    public static void main(String[] args) {
        String str = "JavaA";
        int vowelCount = 0;

        for (int i = 0; i < str.length(); i++) {

            if (isVowel(str.charAt(i))) {
                vowelCount++;
            }
        }

        System.out.println("Repeated chars are: " + vowelCount);

        // Using streams
        IntPredicate vowel = new IntPredicate() {
            @Override
            public boolean test(int v) {
                return  v=='a' || v=='e' || v=='i' || v=='o' || v=='u' || v=='y' ||
                        v=='A' || v=='E' || v=='I' || v=='O' || v=='U' || v=='Y';
            }
        };

        String str1 = "javaAei";
        long count = str1.chars().filter(vowel).count();
        System.out.println(count);
    }
}
