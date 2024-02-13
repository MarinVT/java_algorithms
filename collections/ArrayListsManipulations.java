package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


// 1. Create a new array list, add some elements and print out the collection
// 2. Iterate through all elements in a array list using different ways

public class ArrayListsManipulations {

    public static void main(String[] args) {
        ArrayList<String> myListString = new ArrayList<String>();
        myListString.add("Audi");
        myListString.add("Mercedes");
        myListString.add("BMW");
        myListString.add("Open");
        myListString.add("Ford");

        ArrayList<String> myListString2 = new ArrayList<String>();
//        myListString.add("Audi2");
//        myListString.add("Mercedes2");
//        myListString.add("BMW2");
//        myListString.add("Open2");
//        myListString.add("Ford2");

//        for (int i = 0; i < myListString.size(); i++) {
//            System.out.println(myListString.get(i));
//        }

//        myListString.forEach((elements) -> System.out.println(elements));

//        copyOldArrToNewArr(myListString, myListString2);
//        sortArr(myListString);

        int colorFound = 0;
        colorFound = searchForElementInList(myListString, "BMW1");

        if (colorFound > -1) {
            System.out.println("Color found at index: " + colorFound);
        } else {
            System.out.println("Color not found " + colorFound);
        }

    }

    static void shuffleArr(ArrayList<String> list) {
        Collections.shuffle(list);
        System.out.println(list);
    }

    static void copyOldArrToNewArr(List<String> mainArr, List<String> newArr) {
        for (String s : mainArr) {
            newArr.add(s);
        }

        for (String s : newArr) {
            System.out.println(s);
        }
    }

    static void sortArr(ArrayList<String> list) {
        Comparator<String> comparator = (x, y) -> x.compareTo(y);
        list.sort(comparator);
        System.out.println(list);
    }

    static int searchForElementInList(ArrayList<String> listItems, String item) {
        int i = -1;
        if (listItems.contains(item)) {
            i = listItems.indexOf(item);
        }
        return i;
    }

}
