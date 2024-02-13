package arraysExercises;

import java.util.Arrays;

public class ArrSorting {
    public static void main(String[] args) {

        int[] myArrNumbers = {1,5,77,22,12,111,223};
        String[] arrStrings = {"Java", "Python", "PHP", "C#", "C prog", "C++"};

        System.out.println("Original number array: " + Arrays.toString(myArrNumbers));
        Arrays.sort(myArrNumbers);
        System.out.println("Sorted numeric array: " + Arrays.toString(myArrNumbers));
        System.out.println("<-------------------------->");
        System.out.println("Original string array: " + Arrays.toString(arrStrings));
        Arrays.sort(arrStrings);
        System.out.println("Sorted string array: " + Arrays.toString(arrStrings));

    }
}
