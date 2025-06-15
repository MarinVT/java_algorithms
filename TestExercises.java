import java.util.*;
import java.util.stream.IntStream;

public class TestExercises {


    public static void main(String[] args) {


    int[][] intArray = new int[10][10];
    String [] stringsArray = new String[] {"WV", "tt", "bmw", "volga"};
    String word = "I have test";

    String str1 = "";
    String str2 = "marko1";
    int[] arr = {10,2,3,4, 10};

        System.out.println(arrContains10As1stAndLastElement(arr));

    }

    static boolean arrContains10As1stAndLastElement(int[] arr) {
        return (arr[0] == 10 && arr[arr.length - 1] == 10);
    }

}




