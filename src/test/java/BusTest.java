import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    Bus bus;
    Person person1;

    @Before
    public void before() {
        bus = new Bus("Dundee", 40);
        person1 = new Person();
    }

    @Test
    public void hasDestination() {
        String destination = bus.getDestination();
        assertEquals("Dundee", destination);
    }

    @Test
    public void hasCapacity() {
        int capacity = bus.getCapacity();
        assertEquals(40, capacity);
    }

    @Test
    public void startsWithNoPassengers() {
        int passengerCount = bus.getPassengerCount();
        assertEquals(0, passengerCount);
    }

    @Test
    public void addsPassengerIfRoom() {
        bus.addPassenger(person1);
        assertEquals(1, bus.getPassengerCount());
    }

    @Test
    public void doesNotAddPassengerIfNoRoom() {
        Bus bus2 = new Bus("Dundee", 1);
        Person person2 = new Person();
        bus2.addPassenger(person1);
        bus2.addPassenger(person2);
        assertEquals(1, bus2.getPassengerCount());
    }

    @Test
    public void canRemovePassenger() {
        bus.addPassenger(person1);
        assertEquals(1, bus.getPassengerCount());
        bus.removePassenger(person1);
        assertEquals(0, bus.getPassengerCount());
    }



}
