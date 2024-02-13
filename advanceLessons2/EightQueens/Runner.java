package advanceLessons2.EightQueens;

import java.util.Random;

public class Runner {
    private Board board;
    // Count the attempts till finish
    private int runCounter;
    // How many queens are currently on the board
    // Placing the queens one by one until all are on the board
    private int queensCounter;

    // Need to know what rows are used and which ones are still available
    private boolean[] usedRows; // check also if 1 row does not have more than 1 queen(false=used/true=not used)

    // Random number generator
    private static Random randGeneratorNum;

    public Runner() {
        randGeneratorNum = new Random();
        board = new Board();
        usedRows = new boolean[8];
        runCounter = 0;
        queensCounter = 0;
    }

    // Placing queens on the board
    public void placeQueens() {

        //Initialize the board first run
        board.initBoard();

        do {
            setPositions();
            System.out.println(runCounter);
        }while (!isWinner()); //searching until a winning salution is found

        System.out.println("It took " + runCounter + " attempts to make the queens set up correctly");
    }

    public boolean isWinner() {
        //returns true if the queens are in correct position otherwise false
        board.displayBoard();
        // separates each display adding a black line improving the view
        System.out.println();

        //reset counter
        int attackingQueenCounter = 0;

        // Loop through quarter 1
        for (int col1 = 0; col1 < 7; col1++) {

            for (int row1 = 0; row1 <= 7 - col1; row1++) {
                //How to find the queen - each one is represented by QUEEN CHAR and BOARD CHAR
                //-> Check if the square doesnt have a board char
                if (board.board[row1][col1 + row1] != Board.BOARD_CHAR) {
                    // Increase by 1 because I have found a queen
                    attackingQueenCounter++;

                    if (!countQueens(attackingQueenCounter)) {
                        return false;
                    }
                }
            }
            attackingQueenCounter = 0;
        }
// <---------------------- // ----------------------->
        //reset counter
        attackingQueenCounter = 0;

        // Loop through quarter 2
        for (int row2 = 0; row2 < 7; row2++) {
            for (int col2 = 7; col2 >= row2; col2--) {

                if (board.board[7 - col2 + row2][col2] != board.BOARD_CHAR) {
                    attackingQueenCounter++;

                    if (!countQueens(attackingQueenCounter)) {
                        return false;
                    }
                }
            }
            attackingQueenCounter = 0;
        }
// <---------------------- // ----------------------->

        //reset counter
        attackingQueenCounter = 0;

        // Loop through quarter 3
        for (int col3 = 7; col3 > 0; col3--) {

            for (int row3 = 7; row3 >= 7 - col3; row3--) {

                if (board.board[row3][col3 + row3 - 7] != Board.BOARD_CHAR) {
                    attackingQueenCounter++;
                    if (!countQueens(attackingQueenCounter)) {
                        return false;
                    }
                }
            }
            attackingQueenCounter = 0;
        }
// <---------------------- // ----------------------->

        //reset counter
        attackingQueenCounter = 0;

        // Loop through quarter 4
        for (int row4 = 7; row4 > 0; row4--) {

            for (int col4 = 0; col4 <= row4; col4++) {

                if (board.board[row4 - col4][col4] != board.BOARD_CHAR) {
                    attackingQueenCounter++;

                    if (!countQueens(attackingQueenCounter)) {
                        return false;
                    }
                }
            }
            attackingQueenCounter = 0;
        }

        return true;
    }

    //Counts the queens and return false if more than 1 queen is found
    private boolean countQueens(int attackingQueenCounter) {

        if (attackingQueenCounter > 1) { //if it is greater than 1 then the queen is not in the correct places
            //Reset everything to next attempt
            queensCounter = 0;
            //Created new instance of the array. Not cleared array in a sense the elements are removed from it
            usedRows = new boolean[8];
            board.initBoard();
            return false;
        }

        return true;// no more than 1 queen was found on the diagonal so far
    }

    //Generates the position
    public void setPositions() {
        int col = 0;
        int row = 0;

        while (queensCounter < 8) {
            row = randGeneratorNum.nextInt(8);

            if (isValidRow(row)) {
                board.board[row][col] = Board.QUEEN_CHAR;
                col++;
                queensCounter++;
            }
        }

        runCounter++;
    }

    // Validates is the queen in an available row (the columns in not validated,
    // but the row must not be shared by another queen)
    public boolean isValidRow(int row) {
        if (!usedRows[row]) {
            usedRows[row] = true;
            return true;
        }
        return false;
    }
}
