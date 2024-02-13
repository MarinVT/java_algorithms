package hashMap;

import java.util.Arrays;
import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[] myArr = {1,2,3,4,111,222,11,112321};
        System.out.println("My main arr: " + Arrays.toString(myArr));
        System.out.println("My new arr: " + Arrays.toString(Copyy.arr(myArr)));
    }

}

class Copyy {
    public static int[] arr(int[] x) {
        int[] newArr = new int[x.length];
        for (int i = 0; i < x.length; i++) {
            newArr[i] = x[i];
        }
        return newArr;
    }
}