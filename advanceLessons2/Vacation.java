package advanceLessons2;

import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int groupCount = Integer.parseInt(scanner.nextLine());
        String typeGroup = scanner.nextLine();
        String dayOfWeek = scanner.nextLine();

        double price = 0;

        if (dayOfWeek.equals("Friday")) {
            if (typeGroup.equals("Students")) {
                price = 8.45 * groupCount;
            } else if (typeGroup.equals("Business")) {
                price = 10.9 * groupCount;
            } else if (typeGroup.equals("Regular")) {
                price = 15 * groupCount;
            }
        } else if (dayOfWeek.equals("Saturday")) {
            if (typeGroup.equals("Students")) {
                price = 9.8 * groupCount;
            } else if (typeGroup.equals("Business")) {
                price = 15.6 * groupCount;
            } else if (typeGroup.equals("Regular")) {
                price = 20 * groupCount;
            }
        } else if (dayOfWeek.equals("Sunday")) {
            if (typeGroup.equals("Students")) {
                price = 10.46 * groupCount;
            } else if (typeGroup.equals("Business")) {
                price = 16 * groupCount;
            } else if (typeGroup.equals("Regular")) {
                price = 22.5 * groupCount;
            }
        }


        if ((groupCount >= 30) && typeGroup.equals("Students")) {
            price *= 0.85;
        } else if ((groupCount >= 100) && typeGroup.equals("Business")) {
            double pricePerPerson = price / groupCount;
            price -= pricePerPerson * 10;
        } else if (groupCount >= 10 && groupCount <= 20 && typeGroup.equals("Regular")) {
            price *= 0.95;
        }

        System.out.println(String.format("Total price: %.2f", price));
    }
}
