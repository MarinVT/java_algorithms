package practiceLessons.stringOperations;

public class FindAllSubstringsOfString {
    public static void main(String[] args) {

        String word = "abbc";
        findSubStringOfString(word);

    }

    public static void findSubStringOfString(String word) {

        System.out.println("All substring of " + word + " are: ");

        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j <= word.length(); j++) {
                System.out.println(word.substring(i , j));
            }
        }
    }
}
