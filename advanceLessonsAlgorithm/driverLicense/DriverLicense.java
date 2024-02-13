package advanceLessonsAlgorithm.driverLicense;

import java.util.Scanner;

public class DriverLicense {
    public static void main(String[] args) {
        final int SIZE = 20;
        char [] correctAnswers = {'D', 'B', 'A', 'A', 'C', 'A', 'B', 'A', 'C', 'D', 'B', 'C', 'D',
                                'A', 'D', 'C', 'C', 'B', 'D', 'A'};
        char singleAnswer = ' ';

        Scanner scanner = new Scanner(System.in);
        char [] incorrectAnswer = new char[SIZE];

        int wrongAnswersCounter = 0;
        boolean wrongAnswer;

        for (int i = 0; i < SIZE; i++) {
            do {
                wrongAnswer = false;
                System.out.println("Please enter your answer to question # " + (i + 1) + ": ");
                singleAnswer = scanner.nextLine().toUpperCase().charAt(0);

                if (singleAnswer != 'A' && singleAnswer != 'B' && singleAnswer != 'C' && singleAnswer != 'D') {
                    System.out.println("Invalid input. Please try again!\n");
                    wrongAnswer = true;
                }
            } while (wrongAnswer);

            if (correctAnswers[i] != singleAnswer) {
                incorrectAnswer[i] = singleAnswer;
                wrongAnswersCounter++;
            }
        }
        scanner.close();


        System.out.println(wrongAnswersCounter >= 5 ? "Sorry you have failed!" : "Congrats, you have passed.");
        System.out.println("You have answered " + (SIZE-wrongAnswersCounter) + " correctly and "
                            + wrongAnswersCounter + " incorrectly.");

        for (int i = 0; i < SIZE; i++) {
            if (incorrectAnswer[i] != '\u0000') {
                System.out.println("You answered question #" + (i + 1) + " incorrectly. You Answer was "
                                + incorrectAnswer[i] + ". Correct answer is " + correctAnswers);
            }
            
        }
    }
}






