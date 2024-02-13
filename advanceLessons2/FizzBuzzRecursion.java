package advanceLessons2;

public class FizzBuzzRecursion {
    public static void main(String[] args) {
        System.out.println("FizzBuzz Loop");

        String text;

        recursionSolution(1);
    }


    private static void recursionSolution(int n) {
        String text = "";

        if (n > 100) {
            return;
        }

        if (n % 15 == 0) {
            text = "FizzBuzz";
        } else if (n % 3 == 0) {
            text = "Fizz";
        } else if (n % 5 == 0) {
            text = "Buzz";
        } else {
            text = Integer.toString(n);
        }

        System.out.println(text);
        recursionSolution(n + 1);
    }
}