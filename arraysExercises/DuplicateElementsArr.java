package arraysExercises;

import java.util.*;
import java.util.stream.Collectors;

public class DuplicateElementsArr {

    private static void findDuplicateElementsArr(String[] arr) {

        String[] resultArr;

        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i] + "");
                }
            }
        }
    }

    // Using HashSet

    private static void duplicatesRemoveArr(String[] myArr) {
        Set<String> data = new HashSet<String>();

        for (String element : myArr) {
            if (data.add(element) == false) {
                System.out.println(element);;
            }
        }
    }

    // Streams

    private static void removeDuplicatesArr2ndEdit(String[] arr) {
        Set<String> newArrDuplicateElements = new HashSet<String>();

        Set<String> duplicateElements = Arrays.asList(arr).stream()
                .filter(elements -> !newArrDuplicateElements.add(elements))
                .collect(Collectors.toSet());

        System.out.println(duplicateElements);
    }

    static void printDuplicateNumbsArray(Integer[] arr) {
        List<Integer> itemsList = Arrays.asList(arr);

        Set<Integer> newItemsSet = new HashSet<>();
        System.out.println("Print list of duplicate elements: ");

        itemsList.stream()
                .filter(nums -> !newItemsSet.add(nums))
                .forEach(System.out::println);
    }


    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,4,5,6,7,7,8};
        String[] strArr = {"marin", "igrata", "marin1", "marin", "igrata", "test"};
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = i + 1; j < arr.length; j++) {
//                if (arr[i] == arr[j]) {
//                    System.out.println(arr[j]);
//                }
//            }
//        }

        Integer[] arr1 = {1,2,3,4,4,5,6,6,7};
         printDuplicateNumbsArray(arr1);
    }
}
