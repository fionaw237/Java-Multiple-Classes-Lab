import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<>();
    }

    public String getDestination() {
        return this.destination;
    }

    public int getCapacity() {
        return this.capacity;
    }

    public int getPassengerCount() {
        return passengers.size();
    }

    public void addPassenger(Person person) {
        if (this.getPassengerCount() < this.capacity){
            passengers.add(person);
        }
    }

    public void removePassenger(Person person) {
        passengers.remove(person);
    }
}
