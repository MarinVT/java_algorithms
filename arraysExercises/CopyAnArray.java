package arraysExercises;


import java.util.Arrays;

//Copy an array by iterating the array
public class CopyAnArray {
    public static void main(String[] args) {
        int[] myArr = {11,21,1,3,4};
        int[] newCopyArr = new int[5];

        System.out.println("Main my array: " + Arrays.toString(myArr));

        for (int i = 0; i < myArr.length; i++) {
            newCopyArr[i] = myArr[i];
        }
        System.out.println("New array copy of main array: " + Arrays.toString(newCopyArr));
    }
}
