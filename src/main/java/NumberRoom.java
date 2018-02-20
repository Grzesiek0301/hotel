public class NumberRoom implements Comparable<NumberRoom> {
    private int floor;
    private int numberRoom;

    public NumberRoom(int floor, int numberRoom) {
        this.floor = floor;
        this.numberRoom = numberRoom;
    }

    public int getFloor() {
        return floor;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    @Override
    public String toString() {
        return "NumberRoom{" +
                "floor=" + floor +
                ", numberRoom=" + numberRoom +
                '}';
    }

    public int compareTo(NumberRoom o) {
        if (this.getNumberRoom() > o.getNumberRoom()) return 1;
        if (this.getNumberRoom() < o.getNumberRoom()) return -1;
        if (this.getNumberRoom() == o.getNumberRoom()) return 0;
        return 0;
    }
}