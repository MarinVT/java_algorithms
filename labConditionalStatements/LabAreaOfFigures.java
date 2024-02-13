package labConditionalStatements;

import java.util.Scanner;

public class LabAreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String geomShape = scanner.nextLine();

        if (geomShape.equals("square")) {
            double side = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", (side * side));
        } else if (geomShape.equals("rectangle")) {
            double length = Double.parseDouble(scanner.nextLine());
            double width = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", (length * width));
        } else if (geomShape.equals("circle")) {
            double rad = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", (Math.PI * rad * rad));
        } else if (geomShape.equals("triangle")) {
            double base = Double.parseDouble(scanner.nextLine());
            double hight = Double.parseDouble(scanner.nextLine());
            System.out.printf("%.3f", (base * hight / 2));
        } else {
            System.out.println("Unknown geometric shape.");
        }
    }
}
