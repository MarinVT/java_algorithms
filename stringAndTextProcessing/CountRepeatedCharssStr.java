package stringAndTextProcessing;

public class CountRepeatedCharssStr {
    public static void main(String[] args) {
        String str = "Testing solution";

        System.out.println(getVowelsStr(str, 'i'));
    }

    static void printOccurrencesStr(String word, char letterOccurs) {
        int count = 0;

        for (char ch : word.toCharArray()) {

            if (ch == letterOccurs) {
                count++;
            }
        }

        System.out.println("The letter " + letterOccurs + " occurs " + count);
    }

    // Using streams
    static long getVowelsStr(String word, char c) {
        System.out.println("Repeated chars are: ");
        return  word.chars().filter(e ->  (char) e == c).count();
    }
}
