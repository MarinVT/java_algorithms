package arraysExercises;

import java.util.Arrays;
import java.util.Scanner;

public class secondSmallestElementArr {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myArr = {0, 1, 2, 3, 4};
        System.out.println("Original numeric array: " + Arrays.toString(myArr));
        int min = Integer.MAX_VALUE;
        int second_min_element = Integer.MAX_VALUE;

        for (int i = 0; i < myArr.length; i++) {
            if (myArr[i] == min) {
                second_min_element=min;
            } else if (myArr[i] < min) {
                second_min_element = min;
                min = myArr[i];
            } else if (myArr[i] < second_min_element) {
                second_min_element = myArr[i];
            }
        }

        System.out.println("Second lowest number is: " + second_min_element);
    }
}
