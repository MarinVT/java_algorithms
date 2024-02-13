package hashMap;

import java.util.HashMap;

public class HashMapPractice {
    public static void main(String[] args) {

        HashMap<String, Integer> mapHashContent = new HashMap<String, Integer>();
        mapHashContent.put("a", 10);
        mapHashContent.put("b", 11);
        mapHashContent.put("c", 12);
        mapHashContent.remove("c");

        System.out.println(mapHashContent);
    }
}
