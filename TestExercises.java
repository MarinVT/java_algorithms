import java.util.*;
import java.util.stream.IntStream;

public class TestExercises {


    public static void main(String[] args) {


    int[][] intArray = new int[10][10];
    String [] stringsArray = new String[] {"WV", "tt", "bmw", "volga"};
    String word = "I have test";

    String str1 = "";
    String str2 = "marko1";
    int[] arr = {1,2,3,4};

        System.out.println(findIndexElementArr(arr, 2));

    }

    static int findIndexElementArr(int[] arr, int el) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == el) {
                return i;
            }
        }

        return -1;
    }


}




