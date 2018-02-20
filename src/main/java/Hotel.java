import java.util.Map;
import java.util.TreeMap;

public class Hotel {

    private int numberOfFloors;
    private int numberOfRoomsOnTheFloor;
    private Map<NumberRoom, Person> listRoom = new TreeMap<NumberRoom, Person>();

    public Hotel(int numberOfFloors, int numberOfRoomsOnTheFloor) {
        this.numberOfFloors = numberOfFloors;
        this.numberOfRoomsOnTheFloor = numberOfRoomsOnTheFloor;
        createRooms();
    }

    private void createRooms() {
        int number = 1;
        for (int i = 0; i < numberOfFloors; i++) {
            for (int j = 0; j < numberOfRoomsOnTheFloor; j++) {
                listRoom.put(new NumberRoom(i, number), null);
                number++;
            }
        }
    }

    public void showStateAllRooms() {
        for (Map.Entry list : listRoom.entrySet()) {
            System.out.println(list.getKey() + " :" + list.getValue());
        }
    }

    public void showEmptyRooms() {
        for (Map.Entry list : listRoom.entrySet()) {
            if (list.getValue() == null) {
                System.out.println(list.getKey() + ": room is empty");
            }
        }
    }

    public void addPersonToRoom(Person person, int numberRoom) {
        for (Map.Entry<NumberRoom, Person> map : listRoom.entrySet()) {
            if (map.getKey().getNumberRoom() == numberRoom) {
                if (map.getValue() == null) {
                    map.setValue(person);
                }
            }
        }
    }

    public void removePersonFromRoom(int numberRoom) {
        for (Map.Entry<NumberRoom, Person> map : listRoom.entrySet()) {
            if (map.getKey().getNumberRoom() == numberRoom) {
                map.setValue(null);
            }
        }
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public int getNumberOfRoomsOnTheFloor() {
        return numberOfRoomsOnTheFloor;
    }
}
