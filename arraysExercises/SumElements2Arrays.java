package arraysExercises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SumElements2Arrays {
    public static void main(String[] args) {

        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,3};
        int[] result = sumValuesOfTwoArrays(arr1, arr2);


        System.out.println("The sum of the 2 arrays is " + Arrays.toString(result));
    }
    
    static int[] sumValuesOfTwoArrays(int[] arr1, int[] arr2) {
        int[] arr3Result = new int[arr1.length];

        for (int i = 0; i < arr1.length; i++) {
            arr3Result[i] = arr1[i] + arr2[i];
        }
        
        return arr3Result;
    }
    
}
