package dataStructures;

public class ArrayStructures {
    private int[] myArray = new int[50];
    private int arraySize = 10;

    private void generateRandomArray () {
        for (int i = 0; i < arraySize; i++) {
            myArray[i] = (int) (Math.random()*10) + 10;
        }
    }

    public void printArray () {
        System.out.println("----------");

        for (int i = 0; i < arraySize; i++) {
            System.out.print("| " + i + " | ");
            System.out.println(myArray[i] + " |");

            System.out.println("----------");
        }
    }

    public int getValueAtIndex(int index) {
        if (index < arraySize) return myArray[index];
        return 0;
    }

    public boolean doesArrayContainsThisValue(int searchValue) {
        boolean valueInArray = false;

        for (int i = 0; i < arraySize; i++) {

            if (myArray[i] == searchValue) {
                valueInArray = true;
            }
        }
        return valueInArray;
    }

    public void deleteIndex(int index) {
        if (index < arraySize) {
            for (int i = index; i < arraySize-1; i++) {
                myArray[i] = myArray[i + 1];
            }
        }
        arraySize--;
    }

    public void insertValue(int insertValue) {
        if (arraySize < 50) {
            myArray[arraySize] = insertValue;
            arraySize++;
        }
    }

    public String linearSearchForValue (int value) {
        boolean valueInArray = false;

        String indexsWithValue = "";
        System.out.println("The value is found in the Following: ");

        for (int i = 0; i < arraySize; i++) {
            if (myArray[i] == value) {
                valueInArray = true;
                System.out.print(i + " ");

                indexsWithValue += i+" ";
            }
        }

        if (!valueInArray) {
            indexsWithValue = "None";
            System.out.println(indexsWithValue);
        }
        System.out.println();
        return indexsWithValue;
    }

    public static void main(String[] args) {
        ArrayStructures newArray = new ArrayStructures();

        newArray.generateRandomArray();
        newArray.printArray();
//        System.out.println(newArray.getValueAtIndex(2));
//        System.out.println(newArray.doesArrayContainsThisValue(5));

//         Delete index
//         newArray.deleteIndex(4);
//         newArray.printArray();
//        newArray.insertValue(44);
//        newArray.printArray();

        newArray.linearSearchForValue(14);
    }
}
