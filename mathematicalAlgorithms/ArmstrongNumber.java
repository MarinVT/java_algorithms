package mathematicalAlgorithms;

public class ArmstrongNumber {

    static void checkArmstrongNumber(int number1) {
        int temp = number1;
        int sum = 0; 
        int rightDigit;

        while (temp != 0) {
            rightDigit = temp % 10;
            sum += ((int)Math.pow(rightDigit, 3));
            temp/=10;
        }

        if (sum == number1) {
            System.out.println(number1 + "  is Armstrong number");
        } else {
            System.out.println(number1 + " is not Armstrong number");
        }
    }

    public static void main(String[] args) {
        checkArmstrongNumber(153);
    }
}
