package advanceLessons2;

public class Fibonacci_IterativeMethod {

    public static void main(String[] args) {

        System.out.println(fibonacciIterativeWay(6));

    }

    public static int fibonacciIterativeWay(int num) {

        if (num == 0 || num == 1) {
            return num;
        }

        int num0 = 0, num1 = 1;
        int tempNum;

        for (int i = 2; i <= num; i++) {
            tempNum = num0 + num1;
            num0 = num1;
            num1 = tempNum;
        }

        return num1;
    }

}
