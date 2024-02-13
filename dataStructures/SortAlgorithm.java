package dataStructures;

public class SortAlgorithm {

    private int[] theArray = new int[50];
    private int arraySize = 10;

    public void generateRandomArray(){
        for(int i = 0; i < arraySize; i++){
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }

    public void bubbleSort() {
        for (int i = arraySize - 1;  i > 1 ; i--) {
            for (int j = 0; j < i; j++) {
                if (theArray[j] > theArray[j + 1]) {
                    swapValue(j, j + 1);
                    printHorzArray(i, j);
                }
            }
        }
    }

    private void swapValue(int index1, int index2) {
        int temp = theArray[index1];
        theArray[index1] = theArray[index2];
        theArray[index2] = temp;
    }

    public void binarySearchForValue(int value) {
        int lowIndex = 0;
        int highIndex = arraySize - 1;

        while (lowIndex <= highIndex) {
            int middleIndex = (highIndex + lowIndex) / 2;

            if (theArray[middleIndex] < value) lowIndex = middleIndex + 1;

            else if (theArray [middleIndex] > value) highIndex = middleIndex - 1;

            else {
                System.out.println("\nFound a match for: " + value + " at index " + middleIndex);
                lowIndex = highIndex + 1;
            }
            printHorzArray(middleIndex, - 1);
        }
    }

    public void printHorzArray(int i, int j){

        for(int n = 0; n < 51; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < arraySize; n++){

            System.out.print("| " + n + "  ");

        }
        System.out.println("|");

        for(int n = 0; n < 51; n++)System.out.print("-");
        System.out.println();

        for(int n = 0; n < arraySize; n++){
            System.out.print("| " + theArray[n] + " ");
        }

        System.out.println("|");

        for(int n = 0; n < 51; n++)System.out.print("-");
        System.out.println();

        // END OF FIRST PART

        // ADDED FOR BUBBLE SORT

        if(j != -1){

            // ADD THE +2 TO FIX SPACING

            for(int k = 0; k < ((j*5)+2); k++)System.out.print(" ");

            System.out.print(j);
        }

        // THEN ADD THIS CODE

        if(i != -1){

            // ADD THE -1 TO FIX SPACING

            for(int l = 0; l < (5*(i - j)-1); l++)System.out.print(" ");

            System.out.print(i);
        }

        System.out.println();
    }

    public void selectionSort() {
        for (int i = 0; i < arraySize; i++) {
            int minimum = i;

            for (int j = i; j < arraySize; j++) {

                if (theArray[minimum] > theArray[j]) {
                    minimum = j;
                }
            }

            swapValue(i, minimum);
            printHorzArray(i, -1);
        }
    }


    public void insertionSort() {
        for (int i = 1; i < arraySize; i++) {
            int j = i;
            int toInsert = theArray[i];

            while ((j > 0) && (theArray[j - 1]) > toInsert) {
                theArray[j] = theArray[j - 1];
                j--;

                printHorzArray(i, j);
            }
            theArray[j] = toInsert;
            printHorzArray(i, j);

            System.out.println("\nArray[i] = " + theArray[i] +
                    " Array[j] = " + theArray[j] + " toInsert = " +
                    toInsert);
        }
    }

    public static void main(String[] args) {
        SortAlgorithm sortArr = new SortAlgorithm();
        sortArr.generateRandomArray();
//        sortArr.bubbleSort();

//        sortArr.binarySearchForValue(11);
//        sortArr.selectionSort();
        sortArr.insertionSort();
    }
}
