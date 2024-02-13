package whileExercises;

import java.util.Scanner;

public class LabPassword {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();
        String pass = scanner.nextLine();
        String input = scanner.nextLine();

        while (!pass.equals(input)) {
            input = scanner.nextLine();
        }
        System.out.printf("Welcome %s!", name);
    }
}
