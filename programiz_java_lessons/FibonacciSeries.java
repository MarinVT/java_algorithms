package programiz_java_lessons;

public class FibonacciSeries {

    /* - https://www.programiz.com/java-programming/examples/fibonacci-series
    The Fibonacci series is a series where the next term is the sum of the previous two terms.
    The first two terms of the Fibonacci sequence are 0 followed by 1.
     */

    public static void main(String[] args) {
//        fibonacci(10);

        for (int i = 0; i < 10; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }
        
    }

    public static void fibonacci(int nTerms) {

        int firstNum = 0;
        int secondNum = 1;

        System.out.println("Fibonacci Series till " + nTerms + " terms:");

        for (int i = 1; i <= nTerms ; ++i) {
            System.out.print(firstNum + ", ");

            // Compute the next term
            int nextNumTerm = firstNum + secondNum;
            firstNum = secondNum;
            secondNum = nextNumTerm;
        }

    }

    // Recursive method
    static int fibonacciRecursive(int num) {
        if (num == 1 || num == 0) {
            return  num;
        }

        return fibonacciRecursive(num - 1) + fibonacciRecursive(num - 2);

    }
}


