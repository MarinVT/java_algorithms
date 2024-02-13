package dataTypesAndVariables;

import java.util.Scanner;

public class Snowballs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int snowballSCount = Integer.parseInt(scanner.nextLine());

        double maxValue = 0.0;
        int maxSnow = 0, maxTime = 0, maxQuality = 0;

        for (int i = 0; i < snowballSCount; i++) {

            int snow = Integer.parseInt(scanner.nextLine());
            int time = Integer.parseInt(scanner.nextLine());
            int quality = Integer.parseInt(scanner.nextLine());

            double valueSnow = Math.pow((snow / time), quality);

            if (maxValue < valueSnow) {

                maxValue = valueSnow;
                maxSnow = snow;
                maxTime = time;
                maxQuality = quality;
            }
        }

        System.out.printf("%d : %d = %d (%d)%n", maxSnow, maxTime, maxValue, maxQuality);
    }
}
