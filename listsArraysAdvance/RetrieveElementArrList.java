package listsArraysAdvance;

import java.util.ArrayList;

public class RetrieveElementArrList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Dell");
        arrayList.add("Asus");
        arrayList.add("Samsung");
        arrayList.add("Apple");
        arrayList.add("Microsoft");

        System.out.println(arrayList.get(2));
    }
}
