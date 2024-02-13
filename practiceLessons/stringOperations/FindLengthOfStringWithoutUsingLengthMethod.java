package practiceLessons.stringOperations;

public class FindLengthOfStringWithoutUsingLengthMethod {
    public static void main(String[] args) {

        String word = "test1";
        System.out.println("The length of " + word + " is: " + findLength(word));
    }

    public static int findLength(String str) {
        int length1 = 0;

        char[] strCharArr = str.toCharArray();
        for (char c : strCharArr) {
            length1++;
        }

        return length1;
    }
}
