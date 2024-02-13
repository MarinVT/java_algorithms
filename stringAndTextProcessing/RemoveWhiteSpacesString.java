package stringAndTextProcessing;

public class RemoveWhiteSpacesString {

    public static void main(String[] args) {
        String text = " Marin     Test remove white space!  ";
//        System.out.println(text.replaceAll("\\s+", " "));

        String strArr[] = text.split("\\s");
        StringBuffer stringBuffer = new StringBuffer();

        for (String s : strArr) {
            stringBuffer.append(s);
        }
        System.out.println(stringBuffer);
    }
}
