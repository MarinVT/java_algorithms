package stringAndTextProcessing;

import java.util.Arrays;

public class Check2StrsAreAnagrams {

    public static void check2StringsAnagrams(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        if (String.valueOf(arr1).equals(String.valueOf(str2))) {
            System.out.println("are anagrams!");
        }else {
            System.out.println("are not anagrams!");
        }
    }

    public static void main(String[] args) {
        check2StringsAnagrams("Apple", "ppleA");
    }
}
