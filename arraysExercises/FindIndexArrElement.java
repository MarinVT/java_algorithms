package arraysExercises;

import java.util.ArrayList;
import java.util.stream.IntStream;

public class FindIndexArrElement {
    public static void main(String[] args) {
        int[] myArr = {1,2,3, 4, 5, 6};
        int t = 7;


        System.out.println(findIndexArrList(myArr, 3));

    }

    public static int findIndex(int[] arr1, int itemIndexPosition) {

        if (arr1 == null) {
            return -1;
        }

        int lengthArr = arr1.length;
        int i = 0;
        while (i < lengthArr) {
            if (arr1[i] == itemIndexPosition){
                return i;
            } else {
                i+=1;
            }
        }
        return -1;
    }

    /* Using ArrayList - part of collection framework. It provides dynamic sized arrays in java.I have no need
       to mention the size of the array when I have to create it. It is slower.
    */
    public static int findIndexArrList(int arr[], int indexFind) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i : arr) {
            list.add(i);
        }
        System.out.println("The index of the number in the array is:");
        return list.indexOf(indexFind);
    }


    static int findIndexArr(int[] arr, int indexTarget) {

        int len = arr.length;

        return IntStream.range(0, len)
                .filter(e -> indexTarget == arr[e])
                .findFirst()
                .orElse(-1);

    }
}
