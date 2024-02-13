package advanceLessons2;

public class FibonacciRecursiveWay {
    public static void main(String[] args) {
        System.out.println("Fibonacci recursive solution with return value");
        System.out.println(0);
        for (int i = 0; i <= 7; i++) {

            System.out.println(fibonacciRecursive(i));
        }
    }

    // Recursive approach
    public static int fibonacciRecursive(int n) {
        if (n == 1 || n == 0) {
            return n;
        }
        return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }
}
