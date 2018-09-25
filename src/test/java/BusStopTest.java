import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    BusStop busStop;
    Person person;

    @Before
    public void before() {
        busStop = new BusStop("High Street");
        person = new Person();
    }

    @Test
    public void hasName() {
        String name = busStop.getName();
        assertEquals("High Street", name);
    }

    @Test
    public void queueStartsEmpty() {
        assertEquals(0, busStop.getQueueLength());
    }

    @Test
    public void canAddPersonToQueue() {
        busStop.addToQueue(person);
        assertEquals(1, busStop.getQueueLength());
    }

    @Test
    public void canRemovePersonFromQueue() {
        busStop.addToQueue(person);
        busStop.removeFromQueue(person);
        assertEquals(0, busStop.getQueueLength());
    }
}
