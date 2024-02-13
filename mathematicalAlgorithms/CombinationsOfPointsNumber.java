package mathematicalAlgorithms;

import java.util.Scanner;

public class CombinationsOfPointsNumber {
    //all combinations of points that can compose a given number

    static void printCompositionsNumber(int arr[], int n, int i) {
        int MAX_POINT = 3;

        if (n == 0) {
            printArr(arr, i);
        } else if (n > 0) {

            for (int j = 1; j <= MAX_POINT ; j++) {
                    arr[i] = j;
                printCompositionsNumber(arr, n - j, i + 1);
            }
        }
    }

    static void printArr(int arr[], int m) {
        for (int i = 0; i < m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int size = scanner.nextInt();
        int[] arr = new int[size];

        System.out.println("Different compositions formed by 1,2,3 of " + n + " are ");
        printCompositionsNumber(arr, n, 0);
    }
}

//    For n = 1, the program should print following:
//        1
//
//        For n = 2, the program should print following:
//        1 1
//        2
//
//        For n = 3, the program should print following:
//        1 1 1
//        1 2
//        2 1
//        3
//
//        For n = 4, the program should print following:
//        1 1 1 1
//        1 1 2
//        1 2 1
//        1 3
//        2 1 1
//        2 2
//        3 1
