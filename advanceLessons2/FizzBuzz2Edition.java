package advanceLessons2;

public class FizzBuzz2Edition {
    public static void main(String[] args) {
        System.out.println("FizzBuzz Loop");

        String text;
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                text = "FizzBuzz";
            } else if (i % 3 == 0) {
                text = "Fizz";
            } else if (i % 5 == 0) {
                text = "Buzz";
            } else {
                text = Integer.toString(i);
            }
            System.out.println(text );
        }
    }
}
