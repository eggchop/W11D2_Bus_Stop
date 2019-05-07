import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Passenger passenger;

    @Before
    public void before(){
        busStop = new BusStop("Fountain Park");
        passenger = new Passenger();
    }

    @Test
    public void checkQueueStartsEmpty(){
        assertEquals(0, busStop.getQueue());
    }

    @Test
    public void checkPassengerAddedToQueue(){
        busStop.addPassengerToQueue(passenger);
        assertEquals(1, busStop.getQueue());
    }

    @Test
    public void removePassengerFromQueue(){
        busStop.addPassengerToQueue(passenger);
        busStop.removePassenger();
        assertEquals(0, busStop.getQueue());
    }
}
