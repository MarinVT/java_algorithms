package stringAndTextProcessing;

import java.util.Stack;

public class ReverseString_Many_Ways {

    // 1st approach
    private static void revStr1(String str) {
        System.out.println(new StringBuilder(str).reverse().toString());
    }

    // 2nd approach
    private static String revStr2(String stringToReverse, int index) {
        if (index == 0) {
            return stringToReverse.charAt(0) + "";
        }

        char letter = stringToReverse.charAt(index);
        return letter + revStr2(stringToReverse, index - 1);
    }

    // 3rd way
    private static String revStr3(String str) {
        Stack<Character> stack = new Stack<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            stack.push(str.charAt(i));
        }

        while (!stack.empty()) {
            stringBuilder.append(stack.pop());
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) {



    }
}
