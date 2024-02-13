package firstSteps;

import java.util.Scanner;

public class PrintNumbersWithoutForLoopOrWhile {
    // Recursion
    public static void printNumbersTo100(int startNum, int endNum) {
        if (startNum <= endNum) {
            System.out.println(startNum);
            startNum++;
            printNumbersTo100(startNum, endNum);
        }
    }
    public static void main(String[] args) {
        printNumbersTo100(1, 100);
    }
}
