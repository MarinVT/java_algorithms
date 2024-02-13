package forLoop;

public class countNumberOfDigits {

    public static void main(String[] args) {

        printNumberOfDigits(44124);

    }

    static void printNumberOfDigits(int num) {

        int counter = 0;

        while (num != 0) {
            num /= 10;
            counter++;
        }

        System.out.println(counter);
    }

}
