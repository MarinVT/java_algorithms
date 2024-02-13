package listsArraysAdvance;

import java.util.ArrayList;
import java.util.Collections;

public class CopyArrIntoNewArr {
    public static void main(String[] args) {
        ArrayList<String> listStrings = new ArrayList<>();
        listStrings.add("old item 1");
        listStrings.add("old item 2");
        listStrings.add("old item 3");
        listStrings.add("old item 4");
        System.out.println(listStrings);
        System.out.println("-----------");

        ArrayList<String> listStringsNew = new ArrayList<>();
        listStrings.add("old item 11");
        listStrings.add("old item 22");
        listStrings.add("old item 33");
        listStrings.add("old item 44");

        Collections.copy(listStrings, listStringsNew);
        System.out.println(listStringsNew);

    }
}
