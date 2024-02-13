package listsArraysAdvance;

import java.util.ArrayList;
import java.util.Collections;

public class Swap2elementsArrList {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>();
        list1.add("bwm");
        list1.add("mercedes");
        list1.add("jigula");
        list1.add("tesla");
        list1.add("lada");
        list1.add("audi");
        Collections.swap(list1, 0, 2);

        for (String str : list1) {
            System.out.println(str);
        }
    }
}
