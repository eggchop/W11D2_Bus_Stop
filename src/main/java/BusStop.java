import java.util.ArrayList;

public class BusStop {

    private String name;
    private ArrayList<Passenger> queue;

    public BusStop(String name){
        this.name = name;
        this.queue = new ArrayList<Passenger>();
    }

    public String getName() {
        return name;
    }

    public int getQueue() {
        return queue.size();
    }

    public void addPassengerToQueue(Passenger passenger) {
        this.queue.add(passenger);
    }

    public Passenger removePassenger() {
       return this.queue.remove(0);
    }
}
