import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class TestExercises {


    public static void main(String[] args) {


    Integer[] intArray = new Integer[] {1,2,3,4};
    String [] stringsArray = new String[] {"VW", "tt", "bmw", "volga"};
    String str = "marin igrata NOMER 1";
    char[] strToChars = str.toCharArray();

    int[] arr = {1, 12, 3, 4};

    int max = Arrays.stream(arr).max().getAsInt();
    System.out.println(max);

    int min = Arrays.stream(arr).min().getAsInt();
        System.out.println(min);

    }

    public static <T> boolean arrContainsElement(final T[] arr, final T v) {

        for (final T e : arr) {
            if (e == v || v != null && v.equals(e)) {
                return true;
            }
        }

        return false;
    }


    static void addElementAtPositionInArray(Integer arr[], int element, int position) {
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));
        System.out.println("The original array is: " + Arrays.toString(arr));

        list.add(position - 1, element);

        arr = list.toArray(arr);

        System.out.println("The new array with added element : " + element + " in position "
                + position
                + " is: "
                + Arrays.toString(arr));

    }

    public static int maxNumArr(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] > max) {
                max = arr[i];
            }

        }

        return max;
    }

    public static int minNumArr(int[] arr) {
        int min = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] < min) {
                min = arr[i];
            }

        }

        return min;
    }

}




