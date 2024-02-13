package practiceLessons.sortingOperations;

import java.util.Arrays;

public class SortNumericAndStringArray {

    static void sortNumArr(int[] myNumArr) {
        Arrays.sort(myNumArr);
        System.out.println(Arrays.toString(myNumArr));
    }

    static void sortStringArr(String[] myNumArr) {
        Arrays.sort(myNumArr);
        System.out.println(Arrays.toString(myNumArr));
    }

    public static void main(String[] args) {

        int[] my_array1 = {
                1,2,3,
                6,4,5,
                8,7,9};

        String[] my_array2 = {
                "Java",
                "Python",
                "PHP",
                "C#",
                "C Programming",
                "C++"
        };

//        sortNumArr(my_array1);
        sortStringArr(my_array2);
    }
}
