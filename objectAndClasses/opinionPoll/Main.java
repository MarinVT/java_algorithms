package objectAndClasses.opinionPoll;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        ArrayList<Person> people = new ArrayList<>();

        while (n-- > 0) {
            String[] data = scanner.nextLine().split("\\s+");
            String name = data[0];
            int age = Integer.parseInt(data[1]);

            Person person = new Person(name, age);
            people.add(person);
        }

        people = people.stream().filter(p -> p.getAge() > 30).collect(Collectors.toCollection(ArrayList::new));
        people.stream()
                .sorted((p, s) -> p.getName().compareTo(s.getName()))
                .forEach(p -> System.out.println(p.toString()));
    }
}
