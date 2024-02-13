package arraysExercises;

import java.util.ArrayList;

public class CommonElements3SortedArr {

    public static boolean intArr (int x, int[] mArr) {
        for (int i = 0; i < mArr.length; i++) {
            if (mArr[i] == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int array1[] = {2, 4, 8};
        int array2[] = {2, 3, 4, 8, 10, 16};
        int array3[] = {4, 8, 14, 40};

        int[] sortedArr;

        if (array1.length <= array2.length && array1.length <= array3.length) {
            sortedArr = array1;
        } else if (array2.length <= array1.length && array2.length <= array3.length) {
            sortedArr = array2;
        } else {
            sortedArr = array3;
        }

        ArrayList list = new ArrayList();

        for (int i = 0; i < sortedArr.length; i++) {
            if (intArr(sortedArr[i], array1) && intArr(sortedArr[i], array2) && intArr(sortedArr[i], array3)) {
                list.add(sortedArr[i]);
            }
        }
        System.out.println(list);
    }
}
