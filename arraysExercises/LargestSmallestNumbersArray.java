package arraysExercises;

import java.util.Arrays;

public class LargestSmallestNumbersArray {


    static void largestSmallestNumArr(int[] myArr) {
        int largestNum = myArr[0];
        int smallestNum = myArr[0];

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] > largestNum) {
                largestNum = myArr[i];
            } else if (myArr[i] < smallestNum) {
                smallestNum = myArr[i];
            }
        }

        System.out.println("Given array is: " + Arrays.toString(myArr));
        System.out.println("The largest number is: " + largestNum);
        System.out.println("The smallest number is: " + smallestNum);
    }

    public static void main(String[] args) {
        int[] arr = {1,2,34,5,6,-1, 1231231};

        largestSmallestNumArr(arr);
    }
}
