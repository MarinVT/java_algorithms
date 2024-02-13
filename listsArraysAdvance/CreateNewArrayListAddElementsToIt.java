package listsArraysAdvance;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class CreateNewArrayListAddElementsToIt {

    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("Item 1");
        myList.add("Item 2");
        myList.add("Item 3");
        myList.add("Item 4");
        myList.add("Item 5");
//        System.out.println(myList);

        String[] arrStrings = {"item 11", "item 22", "item 33", "item 44", "item 55"};

        List<String> list = new ArrayList<String>();

        for (int i = 0; i < 5; i++) {
            list.add(arrStrings[i]);
        }
//        list.forEach(n -> System.out.println(n));

        ListIterator<String> listIterator = list.listIterator();
        listIterator.forEachRemaining(n -> System.out.println(n));
    }

    
}
