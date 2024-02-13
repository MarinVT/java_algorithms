package practiceLessons.arrayOperations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class DeleteElementArr {
    public static void main(String[] args) {
    int[] myArr = {1,2,3,4,5,6,7};
    int index = 2;

//        deleteElementArr(myArr, 2);
//        deleteElementArr(myArr, index);
        myArr = removeElement(myArr, index);
        System.out.println(Arrays.toString(myArr));
    }

    // 1st approach
    private static void deleteElementArr(int[] arr, int deletedElement) {

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == deletedElement) {
                for (int j = i; j < arr.length - 1; j++) {
                    arr[j] = arr[j + 1];
                }
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    //Using stream
    private static int[] removeElementArr(int[] myArr, int index) {
        if (myArr == null || index < 0 || index>=myArr.length) {
            return myArr;
        }

        return IntStream.range(0, myArr.length)
                .filter(i -> i != index)
                .map(i -> myArr[i])
                .toArray();
    }

    // Using ArrayList
    private static int[] removeElement(int[] givenArr, int removeIndex) {
        if (givenArr == null || removeIndex < 0 || removeIndex >= givenArr.length) {
            return givenArr;
        }

        List<Integer> result = IntStream.of(givenArr)
                .boxed()
                .collect(Collectors.toList());
        result.remove(removeIndex);

        return result.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }
}
