package generic;

public class BoundedTypeParameters {

    // Determines the lasrgest of 3 comparable objects
    public static < T extends Comparable<T>> T maximumObj(T x, T y, T z) {

        T max = x; // accept x is initially the largest

        if (y.compareTo(max) > 0) {
            max = y; // assume y is largest
        }

        if (z.compareTo(max) > 0) {
            max = z; // z is largest
        }

        return max;
    }

    public static void main(String[] args) {
        System.out.printf("Max of %d, %d and %d is %d\n\n", 3, 4, 5, maximumObj(3, 4 ,5));

        System.out.printf("Max of %.1f, %.1f, and %.1f is %.1f\n\n", 1.2, 3.1, 5.1, maximumObj(1.2, 3.1, 5.1));

        System.out.printf("Max of %s, %s and %s is %s\n", "panasonic", "apple", "acer", maximumObj("panasonic", "apple", "acer"));
    }
}
