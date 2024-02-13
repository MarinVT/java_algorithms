package advanceLessonsAlgorithm.flightOBJ;

public class Flight {
    private String _airline;
    private String _flightNumber;
    private String _origin;
    private String _destination;

    public Flight(String airline, String flightNumber, String origin, String destination) {
        _airline = airline;
        _flightNumber = flightNumber;
        _origin = origin;
        _destination = destination;
    }

    //getters
    public String getAirline() {
        return _airline;
    }

    public String getFlightNumber() {
        return _flightNumber;
    }

    public String getOrigin() {
        return _origin;
    }

    public String getDestination() {
        return _destination;
    }

    //setters

    public void setAirline(String airline) {
        _airline = airline;
    }

    public void setFlightNumber(String flightNumber) {
        _flightNumber = flightNumber;
    }

    public void setOrigin(String origin) {
        _origin = origin;
    }

    public void setDestination(String destination) {
        _destination = destination;
    }

    public String toString() {
        return "Flight Info\nAirline: " + getAirline() + "\n\n" + "\nFlightnumber: " + getFlightNumber() +
                "\n\n" + "\nOrigin: " + getOrigin() + "\n\n" + "\nDestination: " + getDestination();
    }
}
