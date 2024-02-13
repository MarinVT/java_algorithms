package listsArraysAdvance;

import java.util.ArrayList;
import java.util.List;

public class InsertElementIntoArr1stPosition {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("Bmw");
        arrayList.add("Audi");
        arrayList.add("ZAZ");
        arrayList.add("Ford");
        arrayList.add(0, "Mercedes");
        arrayList.add(5, "Honda");

        for (String s : arrayList) {
//            System.out.println(s);
        }

        addElement(arrayList, 0, "Tesla");
        printArrListElements(arrayList);
    }

    public static void addElement(List<String> list, int index, String word) {
        list.add(index, word);
        System.out.println(list.get(index));
    }

    public static void printArrListElements(ArrayList<String> list) {
        list.forEach(n -> System.out.println(n));
    }

}


