package advanceLessons2;

public class PetersonNumber {

    static long[] factorial = new long[] { 1, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880};

    public static void main(String[] args) {

        int num = 143;
        if (petersonNum(num)) {
            System.out.println(num + " is Peterson number!!!!");
        } else {
            System.out.println(num + " is NOT Peterson number!!!!");
        }

    }


    static boolean petersonNum(int n) {

        int number = n;
        int sum = 0;

        while (n > 0) {
            int lastDigit = n % 10;
            sum += factorial[lastDigit];
            n = n /10;
        }

        return (sum == number);
    }

}
