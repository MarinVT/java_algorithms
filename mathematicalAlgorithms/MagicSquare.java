package mathematicalAlgorithms;

public class MagicSquare {

    static void generateSquares(int n) {
        int[][] magicSquare = new int[n][n];

        // Initialize position for 1
        int i = n / 2;
        int j = n - 1;

        // One by one put all values in magic square
        for (int num = 1; num <= n * n;) {
            if (i == -1 && j == n) {
                j = n - 2;
                i = 0;
            } else {
                // 1st condition helper if next number
                // goes to out of square's right side
                if (j == n) {
                    j = 0;
                }

                if (i < 0 ){
                    i = n - 1;
                }


                if (magicSquare[i][j] != 0) {
                    j -= 2;
                    i++;
                    continue;
                } else {
                    magicSquare[i][j] = num++;
                }

                 j++;
                 i--;
            }
        }
        System.out.println("The magic square for " + n + ":");
        System.out.println("Sum of each rol or column " + n * (n * n + 1) / 2 + ":");
        for (int k = 0; k < n; k++) {
            for (int l = 0; l < n; l++) {
                System.out.print(magicSquare[k][l] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 7;
        generateSquares(n);
    }
}

// Tests
//    Magic Square of size 3
//        -----------------------
//        2   7   6
//        9   5   1
//        4   3   8
//        Sum in each row & each column = 3*(32+1)/2 = 15
//
//
//        Magic Square of size 5
//        ----------------------
//        9   3  22  16  15
//        2  21  20  14   8
//        25  19  13   7   1
//        18  12   6   5  24
//        11  10   4  23  17
//        Sum in each row & each column = 5*(52+1)/2 = 65