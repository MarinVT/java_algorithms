package Collections;

import java.util.LinkedList;

public class LinkedListManipulation {
    public static void main(String[] args) {

        LinkedList<String> list = new LinkedList<>();
        list.add("Red");
        list.add("Green");
        list.add("Black");
        list.add("White");
        list.add("Pink");

//        iterateOverListRevOrder(list);
//        iterateOverList(list);
//        addElementSpecificPos(list, 5, "Yellow");


    }

    public static void iterateOverList(LinkedList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }


    public static void iterateOverListRevOrder(LinkedList<String> list) {
        for (int i = list.size() - 1; i >= 0; i--) {
            System.out.println(list.get(i));
        }
    }

    public static void addElementSpecificPos(LinkedList<String> list, int pos1, String pos2) {
        list.add(pos1, pos2);
        System.out.println(list);
    }


}
