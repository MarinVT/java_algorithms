package whileExercises;

import java.util.Scanner;

public class LabReadText {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        while (true) {
            if (input.equals("Stop")) {
                break;
            }
            System.out.println(input);
        input = scanner.nextLine();
        }
    }
}
