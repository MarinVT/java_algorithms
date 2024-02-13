package dataStructures;

import java.util.Arrays;

public class TheQueue {
    private String[] queueArray;
    private int sizeQueue;
    private int front, rear, numberOfItems = 0;

    TheQueue(int size) {
        sizeQueue= size;
        queueArray = new String[size];

        Arrays.fill(queueArray, "-1");
    }

    public void insert(String input) {
        if (numberOfItems + 1 <= sizeQueue) {
            queueArray[rear] = input;
            rear++;

            numberOfItems++;
            System.out.println("INSERT " + input + " Was added to the Queue\n");
        } else {
            System.out.println("Sorry, but the Queue is FULL!");
        }
    }

    public void remove() {
        if (numberOfItems > 0) {
            System.out.println("REMOVE " + queueArray[front]
                    + " Was Removed ");
            queueArray[front] = "-1";
            front++;
        } else {
            System.out.println("Sorry, but the Queue is Empty");
        }
    }

    public void peek() {
        System.out.println("The first element is " + queueArray[front]);
    }

    public void displayTheQueue(){

        for(int n = 0; n < 61; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < sizeQueue; n++){

            System.out.format("| %2s "+ " ", n);

        }

        System.out.println("|");

        for(int n = 0; n < 61; n++)System.out.print("-");

        System.out.println();

        for(int n = 0; n < sizeQueue; n++){


            if(queueArray[n].equals("-1")) System.out.print("|     ");

            else System.out.print(String.format("| %2s "+ " ", queueArray[n]));

        }

        System.out.println("|");

        for(int n = 0; n < 61; n++)System.out.print("-");

        System.out.println();

        // Number of spaces to put before the F

        int spacesBeforeFront = 3*(2*(front+1)-1);

        for(int k = 1; k < spacesBeforeFront; k++)System.out.print(" ");

        System.out.print("F");

        // Number of spaces to put before the R

        int spacesBeforeRear = (2*(3*rear)-1) - (spacesBeforeFront);

        for(int l = 0; l < spacesBeforeRear; l++)System.out.print(" ");

        System.out.print("R");

        System.out.println("\n");
    }

    public void priorityInsert(String input) {
        int j;

        if (numberOfItems == 0) {
            insert(input);
        } else {
            for (int i = numberOfItems-1; i >= 0;i--) {
                if ( Integer.parseInt(input) > Integer.parseInt(queueArray[i])) {
                    queueArray[i + 1] = queueArray[i];
                } else {
                    break;
                }
                queueArray[i + 1] = input;
                rear++;
                numberOfItems++;
            }
        }

    }

    public static void main(String[] args) {
        // Based on FIFO First In - First Out

        TheQueue theQueue = new TheQueue(10);
        theQueue.priorityInsert("10");
        theQueue.priorityInsert("14");
        theQueue.priorityInsert("16");

        theQueue.displayTheQueue();
        theQueue.remove();
        theQueue.remove();
        theQueue.displayTheQueue();
        theQueue.peek();
    }
}
