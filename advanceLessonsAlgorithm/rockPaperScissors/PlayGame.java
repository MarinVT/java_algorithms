package advanceLessonsAlgorithm.rockPaperScissors;

import java.util.Scanner;

public class PlayGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Game game = new Game();

        char quit = ' ';

        while (quit != 'N') {
            game.play();

            System.out.println("Play again? Press any key to continue, or 'N' to quit!");
            quit = scanner.nextLine().toUpperCase().charAt(0);
        }
        scanner.close();
        game.displayStats();
    }
}
