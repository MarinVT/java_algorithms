package listsArraysAdvance;

import java.util.ArrayList;
import java.util.NoSuchElementException;

public class UpdateSpecificArrElement {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Bmw");
        arrayList.add("Audi");
        arrayList.add("Tesla");
        arrayList.add("Ford");

        for (String s : arrayList) {
//            System.out.println(s);
        }

        arrayList.set(3, "Mercedes");
        for (String s : arrayList) {
//            System.out.println(s);
        }

        renameSpecificElement(arrayList, "Tesla", "newmodel");
        for (String s : arrayList) {
            System.out.println(s);
        }
    }

    public static void renameSpecificElement(ArrayList<String> list, String oldContent, String newContent) {
        int indexOfOldContent = list.indexOf(oldContent);
        if (indexOfOldContent < 0) {
            throw new NoSuchElementException(oldContent + " is not in the list!");
        }

        list.set(indexOfOldContent, newContent);
        System.out.println(newContent + " has replace " + newContent);
    }
}
