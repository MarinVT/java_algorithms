package strings;

public class SumNumbersInString {
    public static void main(String[] args) {
        printAndSumNumbersInString("1wewm2");
    }

    static void printAndSumNumbersInString(String str) {

        int sum = 0;

        for (int i = 0; i < str.length(); i++) {

            if (Character.isDigit(str.charAt(i))) {
                sum += Character.getNumericValue(str.charAt(i));
            }

        }
        System.out.println(sum);
    }

}
