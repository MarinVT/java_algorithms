package strings;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class PrintNonRepeatedCharString {

    public static void main(String[] args) {

    printNonRepeatedChar("marinamr");

        String str = "prepinsta";
        char ch = printNonRepeatedChar2(str);
        System.out.println(ch);

    }

    static void printNonRepeatedChar(String str) {

        boolean flag = true;

        for (char i : str.toCharArray()) {

            if (str.indexOf(i) == str.lastIndexOf(i)) {
                System.out.println("Non repeated char is: " + i);
                flag = false;
                break;
            }

        }

        if (flag) {
            System.out.println("There is no repeated char");
        }

    }

    // This method uses Set and ArrayList

    static Character printNonRepeatedChar2(String str) {

        // set stores characters that are repeating
        Set setRepeatingList = new HashSet<>();

        // ArrayList stores characters that are non repeating
        List charNonRepeatingList = new ArrayList<>();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if (setRepeatingList.contains(ch)) {
                continue;
            }

            if (charNonRepeatingList.contains(ch)) {
                charNonRepeatingList.remove((Character) ch);
                setRepeatingList.add(ch);
            } else {
                charNonRepeatingList.add(ch);
            }
        }

        return (Character) charNonRepeatingList.get(0);
    }

}
