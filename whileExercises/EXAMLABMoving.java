package whileExercises;

import java.util.Scanner;

public class EXAMLABMoving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int width = Integer.parseInt(scanner.nextLine());
        int length1 = Integer.parseInt(scanner.nextLine());
        int height = Integer.parseInt(scanner.nextLine());

        int volume = width * length1 * height;

        String commandInput = scanner.nextLine();
        boolean noMoreSpace = false;
        int sumBoxses = 0;

        while (!commandInput.equals("Done")) {
            int currentCountBoxes = Integer.parseInt(commandInput);

            sumBoxses += currentCountBoxes;

            if (sumBoxses > volume) {
                noMoreSpace = true;
                break;
            }

            commandInput = scanner.nextLine();
        }

        if (noMoreSpace == true) {
            System.out.printf("No more free space! You need %d Cubic meters more.", sumBoxses - volume);
        } else {
            System.out.printf("%d Cubic meters left.", volume - sumBoxses);
        }

    }
}
