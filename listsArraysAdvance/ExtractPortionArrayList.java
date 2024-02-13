package listsArraysAdvance;



import java.util.ArrayList;
import java.util.List;

public class ExtractPortionArrayList {
    public static void main(String[] args) {
        List<String> list_Strings = new ArrayList<String>();
        list_Strings.add("Red");
        list_Strings.add("Green");
        list_Strings.add("Orange");
        list_Strings.add("White");
        list_Strings.add("Black");

        extractPortionOfArr(list_Strings);

    }

    public static void extractPortionOfArr(List<String> listStrings) {
        List<String> listExtracted = listStrings.subList(0,2);
        System.out.println(listExtracted);
    }
}
