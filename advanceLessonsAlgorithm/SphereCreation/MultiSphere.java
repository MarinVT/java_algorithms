package advanceLessonsAlgorithm.SphereCreation;

import java.text.DecimalFormat;
import java.util.Scanner;

public class MultiSphere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = 0;
        DecimalFormat decimalFormat = new DecimalFormat();

        System.out.println("Please enter diameter of a sphere: ");
        r = scanner.nextDouble();
        scanner.close();

        Sphere sphere = new Sphere(r);

        System.out.println(decimalFormat.format(sphere.getVolume()));
        System.out.println(decimalFormat.format(sphere.getArea()));

    }
}
