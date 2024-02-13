package arraysExercises;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class ArrContainsSpecValue {
    public static void main(String[] args) {
        //Test if an array contains a specific value

        int[] myArr = {1,2,3,4,5,6,8};
        Integer[] intArray = new Integer[]{1,2,3,4};
        String [] stringsArray = new String[] {"VW", "tt", "bmw", "volga"};

        System.out.println("Search for: " + arrContainsElementCheck(stringsArray, "tt"));
    }

    public static boolean containsSpecValue(int[] arr, int searchItem) {
        for (int i : arr) {
            if (searchItem == i) {
                return true;
            }
        }
        return false;
    }

    public static <T> boolean arrContainsSpecificValue(final T[] arr, final T item) {
        for(final T e : arr) {
            if (e == item || item != null && item.equals(e)) {
                return true;
            }
        }

        return false;
    }

    public static boolean arrContainsElementCheck(String[] arr, String searchItem) {
        return Arrays.asList(arr).contains(searchItem);
    }

    public static boolean containsArrElement(String[] arr, String element) {

        for (String el : arr) {
            if (el.equals(element)) {
                return true;
            }
        }

        return false;
    }

    static void printElementArr(String[] arr, String el) {
        List<String> myList = Arrays.asList(arr);

        myList.stream()
                .filter(e -> e.contains(el))
                .map(String::toLowerCase)
                .sorted()
                .forEach(System.out::println);
    }

}
