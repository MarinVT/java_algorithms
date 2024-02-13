package arraysExercises;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class InsertElementAtGivenPositionArr {

    // 1st approach
    private static int[] insertElement(int[] arr, int key, int index) {
        int[] result = new int[arr.length + 1];

        for (int i = 0, j= 0; i < arr.length; i++, j++) {
            if (i == index) {
                result[j] = key;
                j++;
            }
            result[j] = arr[i];
        }
        return result;
    }

    // 2nd approach Using list
    private static int[] insert2(int[] arr, int key, int index) {
        List<Integer> result = IntStream.of(arr)
                .boxed()
                .collect(Collectors.toList());

        result.add(index, key);

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    // 3rd approach
    private static int[] insertElement3(int n, int[] arr, int elem, int pos) {
        int[] newArr = new int[n + 1];

        for (int i = 0; i < n + 1; i++) {

            if (i < pos - 1) {
                newArr[i] = arr[i];
            } else if (i == pos - 1) {
                newArr[i] = elem;
            } else {
                newArr[i] = arr[i - 1];
            }
        }

        return newArr;
    }

    // 4th approach using List
    private static void insertElementPos(Integer[] arr, int element, int position) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        list.add(position - 1, element);

        arr = list.toArray(arr);
        System.out.println("Main array: " + Arrays.toString(arr));

        System.out.println("Array with +" + element + " inserted at position " + position
                + " " + Arrays.toString(arr));
    }

    public static void main(String[] args) {
        Integer[] myArr = {1,2,3,4};
        int[] arr = {1,2,3,4,5,6,7};
        int key = 3;
        int index = 2;

//        myArr = insertElement(myArr, key, index);
//        System.out.println(Arrays.toString(myArr));
//        myArr = insertElement3(7, arr, 44, 2);
//        System.out.println(Arrays.toString(myArr));
        insertElementPos(myArr, 33, 2);
    }
}
