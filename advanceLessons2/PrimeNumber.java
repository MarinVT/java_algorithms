package advanceLessons2;

public class PrimeNumber {
    public static void main(String[] args) {

//        primeNum(11);

        if (isPrime(11)) {
            System.out.println("The number is Prime");
        } else {
            System.out.println("The number is not Prime");
        }
    }

    // 1st approach
    static void primeNum(int n) {
        int count = 0;

        if (n <= 1) {
            System.out.println("The number is not PRIME!");
            return;
        }

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                count++;
            }
        }

        if (count > 1) {
            System.out.println("The number is not PRIME!");
        } else {
            System.out.println("The number is PRIME!");
        }

    }

    // 2nd approach
    static boolean isPrime(int n) {
        boolean flag = true;

        if (n <= 1) {
            flag = false;
            return flag;
        }

        for (int i = 2; i <= n /2; i++) {
            if (n % i == 0) flag = false;
            break;
        }
        return flag;
    }

}
