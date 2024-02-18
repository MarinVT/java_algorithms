package programiz_java_lessons;


/*
    A prime number is a number that is divisible by only two numbers: 1 and itself.
    So, if any number is divisible by any other number, it is not a prime number.
 */
public class IsNumberPrimeOrNot {

    public static void main(String[] args) {
        isNumberPrime(0);

    }

    static void isNumberPrime(int num) {
        boolean flag = false;

        if (num <= 0) {
            System.out.println("Enter a new number!");
        } else {
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println(num + " is a prime number");
            } else {
                System.out.println(num + " is not a prime number");
            }
        }





    }

}
