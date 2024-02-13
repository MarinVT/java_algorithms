package arraysExercises;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ReturnArrayFromMethod {

    public static void main(String[] args) {



        System.out.println("Array is this");
        System.out.println(Arrays.toString(readArray()));

    }


    // method to return array elements
    public static int[] readArray(){
        int[] arr = {10,20,30,40};
        return arr;
    }
}
