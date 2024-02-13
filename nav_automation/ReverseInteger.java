package nav_automation;

public class ReverseInteger {
    public static void main(String[] args) {

        System.out.println(reverseDigit(1234));

    }

    static int reverseDigit(int num) {
        int revNumResult = 0;

        while (num > 0) {
            revNumResult = revNumResult * 10 + num % 10;
            num /= 10;
        }
        return revNumResult;
    }
}
