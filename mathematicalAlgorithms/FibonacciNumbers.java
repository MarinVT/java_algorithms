package mathematicalAlgorithms;

import java.util.Scanner;

public class FibonacciNumbers {

    static int fib(int num) {
        if (num <= 1) {
            return num;
        }
        return fib(num-1) + fib(num-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println(fib(9));
    }
}
