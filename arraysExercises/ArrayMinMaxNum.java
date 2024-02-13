package arraysExercises;

import java.sql.Array;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ArrayMinMaxNum {
    public static void main(String[] args) {
//        int[] numbers = new int[5];
//        for (int i = 0; i < numbers.length; i++) {
//            numbers[i] = scanner.nextInt();
//        }
//
//        int min = numbers[0];
//        int max = numbers[0];
//
//        for (int i = 0; i < numbers.length; i++) {
//            max = (numbers[i] > max) ? numbers[i] : max;
//            min = (numbers[i] < min) ? numbers[i] : min;
//        }

        int[] arr = {1,2,3,4};

        int maxNumArr = Arrays.stream(arr).max().getAsInt();
        int minNumArr = Arrays.stream(arr).min().getAsInt();

        List<Integer> list = List.of(1,2,3,4,5);

        Integer min = Collections.min(list);
        Integer max = Collections.max(list);

        System.out.println(min);
        System.out.println(max);



//        System.out.println(printMinNumArray(arr));

//        findMaxMinNumberArray(arr);
    }

    public static void findMaxMinNumberArray(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            max = (arr[i] > max) ? arr[i] : max;
            min = (arr[i] < min) ? arr[i] : min;
        }

        System.out.println(max);
        System.out.println(min);
    }

    public static int printMaxNumArray(int[] arr) {
        int maxNum = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > maxNum) {
                maxNum = arr[i];
            }

        }

        return maxNum;
    }

    public static int printMinNumArray(int[] arr) {
        int minNum = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < minNum) {
                minNum = arr[i];
            }

        }

        return minNum;
    }

}
