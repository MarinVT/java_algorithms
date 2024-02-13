package listsArraysAdvance;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicateStringsArr {
    public static void main(String[] args) {
        String[] stringsArray = {"mm", "m1", "v1", "v1", "mm", "c1"};
        ArrayList<String> arrListStrings = new ArrayList<>();

        for (int i = 0; i < stringsArray.length; i++) {
            arrListStrings.add(stringsArray[i]);
        }

        for (int i = 0; i < stringsArray.length; i++) {
            for (int j = i + 1; j < stringsArray.length; j++) {

                if ((stringsArray[i] == stringsArray[j]) && (i != j)) {
                    arrListStrings.remove(stringsArray[j]);
                }
            }
        }
        System.out.println("Origin array: " + Arrays.toString(stringsArray));
        System.out.println("New Array with unique values: " + Arrays.toString(arrListStrings.toArray()));
    }
}
