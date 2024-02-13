package methodsExercises;

import java.util.Scanner;

public class NxNMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int matrix1 = Integer.parseInt(scanner.nextLine());

        matrixTest(matrix1);
    }

    public static void matrixTest(int num) {

        for (int i = 1; i <= num; i++) {
            for (int j = 1; j <= num; j++) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
