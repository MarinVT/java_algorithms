package advanceLessons2;

public class SunnyNumber {
//    A number n is called Sunny number if the next number (n+1) is a perfect square number.
//    For example 15 is a Sunny number because 15+1 =16 is a perfect square number.

    public static void main(String[] args) {

        isSunnyNumber(15);

    }

    static boolean isPerfectSquare(double n) {

        double squareRoot = Math.sqrt(n);

        return (squareRoot - Math.floor(squareRoot) == 0);
    }

    static void isSunnyNumber(int num) {
        if (isPerfectSquare(num + 1)) {
            System.out.println(num + " is SUNNY number.");
        } else {
            System.out.println(num + " is not SUNNY number.");
        }
    }

}
