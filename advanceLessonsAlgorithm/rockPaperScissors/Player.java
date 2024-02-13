package advanceLessonsAlgorithm.rockPaperScissors;

import java.util.Scanner;

public class Player extends GameItems{
    Scanner scanner;

    public Player(){
        super();
        scanner = new Scanner(System.in);
    }

    public CHOICES getChoice() {
        System.out.println("Please enter your choice: R=ROCK, P=PAPER, S=SCISSOR");
        char playChoice = scanner.nextLine().toUpperCase().charAt(0);

        switch (playChoice) {
            case 'R':
                return GameItems.CHOICES.ROCK;
            case 'P':
                return GameItems.CHOICES.PAPER;
            case 'S':
                return GameItems.CHOICES.SCISSOR;
        }
        System.out.println("Invalid input!");
        return getChoice();
    }
}
