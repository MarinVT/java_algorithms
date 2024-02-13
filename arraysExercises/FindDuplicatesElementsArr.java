package arraysExercises;

import java.util.HashSet;
import java.util.Set;


public class FindDuplicatesElementsArr {

    static void findDuplicates(String[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i].equals(arr[j])) {
                    System.out.println("Duplicated elements are: " + arr[i]);
                }
            }
        }
    }

    // Using HashSet - it stores unique values

    static void findDuplicates2ndEdition(String[] names) {

        Set<String> store = new HashSet<>();

        for (String name : names) {
            if (store.add(name) == false) {
                System.out.println("Duplicate elements are: " + name);
            }
        }
    }


    public static void main(String[] args) {

        String[] names = {"Java", "PY", "PY", "Java", "JS", "C#", "C#"};

//        findDuplicates(names);
        findDuplicates2ndEdition(names);

    }

}
