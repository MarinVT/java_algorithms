package nestedLoops;

import java.util.Scanner;

public class LabBuilding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int floorInput = Integer.parseInt(scanner.nextLine());
        int roomsInput = Integer.parseInt(scanner.nextLine());

        for (int floor = floorInput; floor >= 1; floor--) {
            for (int room = 0; room < roomsInput; room++) {

                if (floor == floorInput) {
                    System.out.printf("L%d%d ", floor, room);
                } else if (floor % 2 == 0) {
                    System.out.printf("O%d%d ", floor, room);
                } else {
                    System.out.printf("A%d%d ", floor, room);
                }
            }
            System.out.println();
        }
    }
}
