import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BustTest {

    Bus bus;
    Passenger passenger;
    BusStop busStop;

    @Before
    public void before(){
        bus = new Bus("CodeClan", 5);
        passenger = new Passenger();
        busStop = new BusStop("Fountain Park");

    }

    @Test
    public void checkDestination(){
        assertEquals("CodeClan", bus.getDestination());
    }

    @Test
    public void checkBusStartsWithZeroPassengers(){
        assertEquals(0, bus.getNumberOfPassengers());
    }

    @Test
    public void checkAddPassengerToBusFromBusStop(){
        busStop.addPassengerToQueue(passenger);
        bus.addPassengerFromBusStop(busStop);
        assertEquals(1, bus.getNumberOfPassengers());
        assertEquals(0, busStop.getQueue());
    }

    @Test
    public void checkPassengerCapacityFull(){
        busStop.addPassengerToQueue(passenger);
        busStop.addPassengerToQueue(passenger);
        busStop.addPassengerToQueue(passenger);
        busStop.addPassengerToQueue(passenger);
        busStop.addPassengerToQueue(passenger);
        busStop.addPassengerToQueue(passenger);
        bus.addPassengerFromBusStop(busStop);
        bus.addPassengerFromBusStop(busStop);
        bus.addPassengerFromBusStop(busStop);
        bus.addPassengerFromBusStop(busStop);
        bus.addPassengerFromBusStop(busStop);
        bus.addPassengerFromBusStop(busStop);
        assertEquals(5, bus.getNumberOfPassengers());
    }

    @Test
    public void checkRemovePassenger(){
        busStop.addPassengerToQueue(passenger);
        bus.addPassengerFromBusStop(busStop);
        bus.removePassenger();
        assertEquals(0,bus.getNumberOfPassengers());
    }
}
