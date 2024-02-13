package listsArraysAdvance;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConvertArrToArrayList {
    public static void main(String[] args) {
        // 1st approach
        String[] myArr = new String[] {"Python", "JAVA", "PHP",  "Perl", "C#", "C++"};
        ArrayList<String> list = new ArrayList<>(Arrays.asList(myArr));

//        System.out.println(ArrayTo.arrayList(myArr));
        String[] arr2 = new String[4];
        arr2[0] = "Test1";
        arr2[1] = "Test2";
        arr2[2] = "Test3";
        arr2[3] = "Test4";

        List list1 = Arrays.asList(arr2);
        // Accepts list
        printArrList2(list1);
        // Array of strings
        printArrList(arr2);
    }

    // 1st approach
    static class ArrayTo {
        protected static ArrayList arrayList(Object[] arr) {
            ArrayList<Object> list = new ArrayList<Object>();
            for (int i = 0; i < arr.length; i++) {
                list.add(arr[i]);
            }
            return list;
        }
    }

    // 2nd approach
    private static void printArrList(String[] arr) {
        System.out.println("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.println();
    }

    // 3th approach
    private static void printArrList2(List list) {
        System.out.println("ArrayList: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println();
    }
}
