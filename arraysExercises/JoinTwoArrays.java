package arraysExercises;

import java.util.Arrays;
import java.util.stream.Stream;

public class JoinTwoArrays {
    public static void main(String[] args) {
        String[] europeCarBrands = {
                "BMW",
                "Audi",
                "Opel",
                "Mercedes",
                "Ferrari"
        };

        String[] asianCarBrands = {
                "Toyota",
                "Lexus",
                "Mitsubishi",
                "Kia",
                "Hundai",
                "Infiniti"
        };

        join2Arrays(europeCarBrands, asianCarBrands);
    }

    static void join2Arrays(String[] arr1EU, String[] arr2AS) {
        Stream<String> europeCarBrands = Arrays.stream(arr1EU);
        Stream<String> asiaCarBrands = Arrays.stream(arr2AS);

        String[] join2Brands = Stream.concat(europeCarBrands, asiaCarBrands).toArray(size -> new String[size]);

        for (String join2Brand : join2Brands) {
            System.out.print(join2Brand + " - ");
        }
    }
}
