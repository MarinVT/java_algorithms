package mathematicalAlgorithms;

public class FindGCDTwoNumbers {

    // Recursion
    static int gcd(int num1, int num2) {
        if (num1 == 0) {
            return num2;
        }
        return gcd(num2 % num1, num1);
    }

    // Approach 2
    static void gcd2(int num1, int num2) {
        int gcd = 1;

        for (int i = 1; i <= num1 && i <= num2 ; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        System.out.printf("GCD of %d and %d is : %d", num1, num2, gcd);
    }
    public static void main(String[] args) {
        gcd2(55, 121);
    }
}
