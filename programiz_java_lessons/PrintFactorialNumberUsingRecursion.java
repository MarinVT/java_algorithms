package programiz_java_lessons;

public class PrintFactorialNumberUsingRecursion {

    public static void main(String[] args) {
        System.out.println(printFactorialRecursion(6));
    }

    static int printFactorialRecursion(int num) {
        if (num >= 1) {
            return num * printFactorialRecursion(num - 1);
        } else {
            return 1;
        }
    }

}
