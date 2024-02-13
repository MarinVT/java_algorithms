package advanceLessons2;

import java.util.Scanner;

public class TowerOfHanoiPuzzle {

    static int counter = 0;

    public static void main(String[] args) {
        int disc = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of disks: ");
        disc = Integer.parseInt(scanner.nextLine());
        scanner.close();

        Tower(disc, 1, 2, 3);
    }

    static void Tower(int n, int sourcePeg, int destinationPeg, int sparePeg) {

        if (n == 1) {
            System.out.println(counter + " " + sourcePeg + "-->" + destinationPeg);
            counter++;
        } else {
            Tower(n-1,sourcePeg, sparePeg, destinationPeg);
            System.out.println(counter + " " + sourcePeg + "-->" + destinationPeg);
            counter++;
            Tower(n-1, sparePeg, destinationPeg, sourcePeg);
        }
    }
}
