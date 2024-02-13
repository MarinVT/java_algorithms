package nav_automation;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicatesElementsInArray {

    public static Set<Integer> findDuplicatesArr(int[] arr) {
        Set<Integer> duplicates = new HashSet<Integer>();

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {

                if (arr[i] == arr[j] && i != j) {
                    duplicates.add(arr[i]);
                    break;
                }
            }
        }
        return duplicates;
    }


    public static void main(String[] args) {
        int[] arr = {1,2,2,1,3,4,5};

        System.out.println(findDuplicatesArr(arr));
    }
}
