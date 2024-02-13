package mathematicalAlgorithms;

public class LuckyNumbers {

    public static int counter = 2;

    // Recursive Way
    static boolean isLucky(int num) {
        if (counter > num) {
            return true;
        }

        if (num % counter == 0) {
            return false;
        }

        int nextPosition = num - (num / counter);
        counter++;

        return isLucky(nextPosition);
    }

    public static void main(String[] args) {
        int x = 6;

        if (isLucky(x)) {
            System.out.println(x + " is a lucky no.");
        } else {
            System.out.println(x + " is not a lucky no.");
        }
    }
}
