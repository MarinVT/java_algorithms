package advanceLessonsAlgorithm.carObj;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        boolean quit = false;
        String toQuit;
        String model, make;
        int year = 0;
        Scanner scanner = new Scanner(System.in);

        //create empty Object
        Car car = new Car(" ", " ", 0);

        while (!quit) {
            System.out.println("Please enter the car make, model and year: ");
            make = scanner.next();
            model = scanner.next();
            year = scanner.nextInt();

            //assign data to the object
            car.setMake(make);
            car.setModel(model);
            car.setYear(year);
            scanner.nextLine();

            System.out.println("Here's the date you provided: " + car);
            System.out.println("Pres 'Q' to quit or any key to continue!");
            toQuit = scanner.next();

            if (toQuit.equalsIgnoreCase("Q")) {
                quit = true;
            }
        }

        scanner.close();
        System.out.println("Goodbye");
    }
}
