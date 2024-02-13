package advanceLessons2;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkList {
    public static void main(String[] args) {

        String[] items = {"samsung", "apple", "sony", "nokia", "siemens"};
        List<String> emptyNewList = new LinkedList<String>();

        for (String list : items) {
            emptyNewList.add(list);
        }

        String[] items2 = {"bmw", "mercedes", "audi", "kia", "opel"};
        List<String> emptyList2 = new LinkedList<String >();
        for (String list2 : items2) {
            emptyList2.add(list2);
        }

        emptyNewList.addAll(emptyList2);
        emptyList2 = null;

        printMe(emptyNewList);
        removeItems(emptyNewList, 2, 5);
        printMe(emptyNewList);
        reverseTest(emptyNewList);
    }

    //Print me method
    private static void printMe(List<String> list) {
        for (String items: list) {
            System.out.printf("%s ", items);
        }

        System.out.println();
    }

    // Remove stuff method
    private static void removeItems(List<String> list, int rangeFrom, int rangeTo) {
        list.subList(rangeFrom, rangeTo).clear();
    }

    private static void reverseTest(List<String> list) {
        //using list iterator
        ListIterator<String> listIter = list.listIterator(list.size()); // pass starting point

        while (listIter.hasPrevious()) {
            System.out.printf("%s ", listIter.previous());
        }
    }
}
