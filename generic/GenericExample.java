package generic;

import java.util.ArrayList;
import java.util.List;

public class GenericExample {

    static void printNames(List<String> list) {

        for (int i = 0; i < list.size(); i++) {
            String name = list.get(i);
            System.out.println(name);
        }
    }

    public static void main(String[] args) {
        List<String> names = new ArrayList<String>();
        names.add(new String("Marin1"));
        names.add(new String("Marin2"));
//        names.add(new StringBuilder("Marin2"));
        printNames(names);
    }
}
