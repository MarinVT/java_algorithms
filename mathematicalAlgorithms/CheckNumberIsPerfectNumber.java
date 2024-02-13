package mathematicalAlgorithms;

public class CheckNumberIsPerfectNumber {
    public static void main(String[] args) {

        System.out.println(isPerfectNumber(13));

    }

    static boolean isPerfectNumber(int num) {
        int sum = 1;

        if (num == 1) {
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        if (sum == num) {
            return true;
        }

        return false;
    }

}
