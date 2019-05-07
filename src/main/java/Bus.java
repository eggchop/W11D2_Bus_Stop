import java.util.ArrayList;

public class Bus {

    private ArrayList<Passenger> passengers;
    private String destination;
    private int capacity;

    public Bus(String destination, int capacity) {
        this.passengers = new ArrayList<Passenger>();
        this.destination = destination;
        this.capacity = capacity;
    }

    public int getNumberOfPassengers() {
        return passengers.size();
    }

    public String getDestination() {
        return destination;
    }

    public int getCapacity() {
        return capacity;
    }

    public void addPassengerFromBusStop(BusStop busStop) {
        if (this.getNumberOfPassengers() < this.getCapacity()) {
            Passenger passenger = busStop.removePassenger();
            this.passengers.add(passenger);
        }
    }

    public void removePassenger() {
        this.passengers.remove(0);
    }
}
