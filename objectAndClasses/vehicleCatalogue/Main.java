package objectAndClasses.vehicleCatalogue;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<VehicleCatalogue> cars = new ArrayList<>();
        ArrayList<VehicleCatalogue> trucks = new ArrayList<>();

        String line = scanner.nextLine();

        while (!line.equals("End")) {

            String tokens[] = line.split(" ");

            VehicleCatalogue vehicleCatalogue = new VehicleCatalogue(tokens[0], tokens[1], tokens[2], Integer.parseInt(tokens[3]));

            if (vehicleCatalogue.getTypeOfVehicle().equals("Truck")) {
                trucks.add(vehicleCatalogue);
            } else cars.add(vehicleCatalogue);

            line = scanner.nextLine();
        }

        line = scanner.nextLine();
        while (!line.equals("Close the Catalogue")) {
            String model = line;

            for (VehicleCatalogue truck : trucks) {
                if (truck.getModelOfVehicle().equals(model)){
                    System.out.println(truck.toString());
                }
            }

            for (VehicleCatalogue car : cars) {
                if (car.getModelOfVehicle().equals(model)){
                    System.out.println(car.toString());
                }
            }

            line = scanner.nextLine();
        }

        double averageTruck = 0;
        double carAverage = 0;
        double carHPSUM = 0;
        double truckHPSUM = 0;

        if (!cars.isEmpty()) {
            for (VehicleCatalogue car : cars) {
                carHPSUM += car.getHorsepowerOfVehicle();
            }

            carAverage = carHPSUM / cars.size();
        }

        System.out.println(String.format("Cars have average horsepower of: %.2f.", carAverage));

        if (!trucks.isEmpty()) {
            for (VehicleCatalogue truck : trucks) {
                truckHPSUM += truck.getHorsepowerOfVehicle();
            }

            averageTruck = truckHPSUM / trucks.size();
        }

        System.out.println(String.format("Trucks have average horsepower of: %.2f.", averageTruck));
    }
}
