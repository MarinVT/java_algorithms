import java.util.*;
import java.util.stream.IntStream;

public class TestExercises {


    public static void main(String[] args) {


    int[][] intArray = new int[10][10];
    String [] stringsArray = new String[] {"WV", "tt", "bmw", "volga"};

    int[] arr = {1,2,3,4};

        System.out.println(findIndexArr(arr, 1));

    }

    static int findIndexArr(int[] arr, int indexTarget) {

        int len = arr.length;

        return IntStream.range(0, len)
                .filter(e -> indexTarget == arr[e])
                .findFirst()
                .orElse(-1);

    }



}




