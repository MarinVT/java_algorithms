package strings;

public class ConvertCharToString {

//    I have following two ways for char to String conversion.
//    Method 1: Using toString() method
//    Method 2: Using valueOf() method

    public static void main(String[] args) {

        char ch = 'a';
        String charToString = Character.toString(ch);

        String str2 = String.valueOf(ch);
       
        
        String strName = "Marin";

//        for (int i = 0; i < strName.length(); i++) {
//            char ch2 = strName.charAt(i);
//            System.out.print(ch2 + " ");
//        }

        char[] charArr = {'a','b','v'};
        String str = String.valueOf(charArr);
        System.out.println(str);


    }



}
