package programiz_java_lessons;

public class GenerateMultiplicationTable {
    public static void main(String[] args) {

        printMultiplicationTable2(9);
    }

    static void printMultiplicationTable(int num) {

        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }

    }

    // Using printf

    static void printMultiplicationTable2(int num) {

        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d X %d = %d \n", num, i, num * i);
        }

    }

}
