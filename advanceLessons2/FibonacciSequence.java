package advanceLessons2;

public class FibonacciSequence {
    public static void main(String[] args) {
        System.out.println("Fibonacci Sequence Loop Solution");

        int num1 = 0;
        int num2 = 1;

        System.out.println(num1);
        System.out.println(num2);
        for (int i = 0; i <= 8; i++) {
            int next = num1 + num2;
            num1 = num2;
            num2 = next;

            System.out.println(next);
        }
    }
}
