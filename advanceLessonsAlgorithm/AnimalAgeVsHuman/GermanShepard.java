package advanceLessonsAlgorithm.AnimalAgeVsHuman;

import java.util.Scanner;

public class GermanShepard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name;
        int age = 0;

        System.out.println("Please the dog's name and age: ");
        name = scanner.next();
        age = scanner.nextInt();
        scanner.close();

        Dog dog = new Dog(name, age);
        Dog dog2 = new Dog("kenefa", 5);
        Dog dog3 = new Dog("kenefa2", 2);

        System.out.println(dog);
        System.out.println(dog2);
        System.out.println(dog3);
    }
}
