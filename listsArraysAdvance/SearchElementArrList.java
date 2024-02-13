package listsArraysAdvance;

import java.util.ArrayList;

public class SearchElementArrList {
    public static void main(String[] args) {
        ArrayList<String> listStrings = new ArrayList<>();
        listStrings.add("nike");
        listStrings.add("versace");
        listStrings.add("gucci");
        listStrings.add("boss");

        if (listStrings.contains("boss")) {
            System.out.println("its found");
        } else {
            System.out.println("Not found");
        }
    }
}
