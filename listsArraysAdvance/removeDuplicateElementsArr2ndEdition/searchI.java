package listsArraysAdvance.removeDuplicateElementsArr2ndEdition;

import java.util.ArrayList;

public class searchI {
    public static boolean intsInArrayList(int element, ArrayList myArr) {
        for (int i = 0; i < myArr.size(); i++) {
            if (myArr.get(i).equals(element));
            return true;
        }
        return false;
    }
}
