package mathematicalAlgorithms;

public class IsBinaryNumber {

    static void isBinaryNum(int number) {
        boolean isBinary = true;

        int copyNum = number;

        while (copyNum != 0) {
            int reminder = copyNum % 10;

            if (reminder > 1) {
                isBinary = false;
                break;
            } else {
                copyNum /= 10;
            }
        }

        if (isBinary) {
            System.out.println(number + " is a binary number.");
        } else {
            System.out.println(number + " its not a binary number!");
        }
    }

    public static void main(String[] args) {
        isBinaryNum(11011);
    }
}
