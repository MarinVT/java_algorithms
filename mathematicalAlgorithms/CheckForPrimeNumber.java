package mathematicalAlgorithms;

public class CheckForPrimeNumber {
    public static void main(String[] args) {

        checkForPrimeNumber(23);

    }

    static void checkForPrimeNumber(int num) {

        int isPrime = 0;

        for (int i = 2; i <= num / 2; i++) {

            if (num % i == 0) {
                isPrime = 1;
                break;
            }

        }

        if (isPrime == 0) {
            System.out.println(num + " is a prime number");
        } else {
            System.out.println(num + " it is not a prime number");
        }
    }

}
