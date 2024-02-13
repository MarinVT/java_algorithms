package listsArraysAdvance.removeDuplicateElementsArr2ndEdition;



import java.util.ArrayList;

public class RemoveDuplicateElementsArr2ndEdition {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 4, 5, 7, 7, 8};
        ArrayList<Integer> myNewArr = new ArrayList<Integer>();
        System.out.println("Display Origin array is: ");

        for (int i = 0; i < arr1.length; i++) {
            System.out.print(arr1[i] + "  ");
            if (!(searchI.intsInArrayList(arr1[i], myNewArr))) {
                myNewArr.add(arr1[i]);
            }
        }
        System.out.println();

        System.out.println("Print array with unique values:");
        for (int i = 0; i < myNewArr.size(); i++) {
            System.out.print(myNewArr.get(i) + " ");
        }
    }
}
