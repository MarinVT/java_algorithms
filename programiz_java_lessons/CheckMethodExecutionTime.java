package programiz_java_lessons;

import test_classes.Main;

public class CheckMethodExecutionTime {

    public static void main(String[] args) {

        Main object1 = new Main();

        long startTime = System.nanoTime();

        object1.factorial(6);

        long endTime = System.nanoTime();

        long result = endTime - startTime;

        System.out.println("Execution time is  " + result + "nanoseconds of my custom method");

    }

    static class Main {
        public int factorial( int n ) {
            if (n != 0)  // termination condition
                return n * factorial(n-1); // recursive call
            else
                return 1;
        }
    }

}
