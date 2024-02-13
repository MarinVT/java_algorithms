package advanceLessonsAlgorithm.flightOBJ;

public class FlightTest {
    public static void main(String[] args) {
        Flight flight1, flight2, flight3;

        flight1 = new Flight("Marin1 Air1", "Flight Number 1", "BG", "USA");
        flight2 = new Flight("Marin2 Air2", "Flight Number 2", "USA", "Russia");
        flight3 = new Flight("Marin1 Air3", "Flight Number 3", "Irag", "USA");

        System.out.println(flight2.getDestination());
    }
}
