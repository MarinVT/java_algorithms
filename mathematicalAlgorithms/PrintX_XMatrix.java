package mathematicalAlgorithms;

public class PrintX_XMatrix {
    public static void main(String[] args) {

        int matrix[][] =
                { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

//        matrix(matrix);
        matrix2ndEdition(matrix);
    }

    static void matrix(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        
    }


    static void matrix2ndEdition(int arr[][]) {

        for (int[] i : arr) {
            for (int j : i) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }

}
