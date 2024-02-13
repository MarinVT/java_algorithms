package generic;

public class PrintElements {

    public static < E > void printArrayElements(E[] arr1) {
        // Display elements
        for (E element : arr1) {
            System.out.printf("%s ", element);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5,6,7};
        Double[] doublesArray = {1.1, 21.3 , 4.5, 61.7};
        String[] stringsArray = {"Marin1", "Marin2", "Marin3"};

        System.out.println("Int array contains:  ");
        printArrayElements(intArray);
        System.out.println("Double array contains:  ");
        printArrayElements(doublesArray);
        System.out.println("String array contains:  ");
        printArrayElements(stringsArray);
    }
}
