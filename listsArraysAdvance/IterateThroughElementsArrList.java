package listsArraysAdvance;

import java.util.ArrayList;


public class IterateThroughElementsArrList {
    public static void main(String[] args) {
        ArrayList<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        for (String list_string : list_Strings) {
//            System.out.print(list_string + " ");
        }

        list_Strings.forEach(n -> System.out.println(n));
    }
}
