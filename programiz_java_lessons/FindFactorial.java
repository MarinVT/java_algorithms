package programiz_java_lessons;

public class FindFactorial {

    public static void main(String[] args) {

        System.out.println(factorial2ndApproach(5));

    }

    public static int factorial(int num) {

        if (num == 0) {
            return 1;
        } else if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    static int factorial2ndApproach(int num) {
        return (num == 1 || num == 0) ? 1 : num * factorial2ndApproach(num - 1);
    }

}
