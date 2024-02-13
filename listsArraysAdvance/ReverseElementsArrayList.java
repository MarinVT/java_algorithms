package listsArraysAdvance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseElementsArrayList {
    public static void main(String[] args) {
        List<String> list_Strings =new ArrayList<String>();
        list_Strings.add("Item 1");
        list_Strings.add("Item 2");
        list_Strings.add("Item 3");
        list_Strings.add("Item 4");
        list_Strings.add("Item 5");

        reverseList(list_Strings);

    }

    public static void reverseList(List<String> listStrings) {
        Collections.reverse(listStrings);
        System.out.println(listStrings);
    }
}
