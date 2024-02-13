package advanceLessons2.EightQueens;

public class Board {

    public static final char BOARD_CHAR = '.';
    public static final char QUEEN_CHAR = 'X';

    //Representational board
    public char[][] board;

    public Board() {
        //Initialize the array
        board = new char[8][8];
    }

    // Display board
    public void displayBoard() {
        // Should display the board to the screen
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + "  ");
            }
            System.out.println();
            System.out.println();
        }
    }


    //Initialize the board
    public void initBoard() {

        // Nested loop to loop through each index of board array
        for (int i = 0; i < 8; i++) {

            for (int j = 0; j < 8; j++) {
                board[i][j] = BOARD_CHAR;
            }
        }
    }
}
