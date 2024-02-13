package arraysExercises;

import java.util.Arrays;

public class RemoveDuplicateElementsArr {

    static void uniqueElementsDisplay(int[] arr) {
        System.out.println("Origin array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }

        int noDuplicatedElements = arr.length;

        // To Do comparing each element with all other
        for (int i = 0; i < noDuplicatedElements; i++) {
            for (int j = i + 1; j <noDuplicatedElements ; j++) {

                if (arr[i] == arr[j]) {
                    arr[j] = arr[noDuplicatedElements - 1];
                    noDuplicatedElements--;
                    j--;
                }
            }
        }

        // Takes only unique elements from an array into arrayNew
        int[] arrayNew = Arrays.copyOf(arr, noDuplicatedElements);

        System.out.println();
        System.out.println("Display only array with unique values: ");
        for (int i = 0; i < arrayNew.length; i++) {
            System.out.print(arrayNew[i] + "\t");
        }
        System.out.println();
        System.out.println("<----------------------->");
    }

    public static void main(String[] args) {
        uniqueElementsDisplay(new int[] {0, 3, -1, 4,3,9, 0, 9});
        uniqueElementsDisplay(new int[] {100, 55, -11, 14,111,4, 55});
    }
}
