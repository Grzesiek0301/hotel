

public class Menu {

    Hotel hotel;

    public Menu(Hotel hotel) {
        this.hotel = hotel;
    }

    public void firstMessage() {
        StringBuilder startMessage = new StringBuilder();
        startMessage.append("What do you want to do ?\n")
                .append("1. Book room.\n")
                .append("2. Remove reservation\n")
                .append("3.See list of empty rooms\n")
                .append("4.Which rooms does specific person rent ? ")
                .toString();
        System.out.println(startMessage);
        triggerMenu(Commands.getNumberFromUser());
    }

    private void triggerMenu(int choosenNumber) {
        switch (choosenNumber) {
            case 1:
                addPerson();
            case 2:
                hotel.removePersonFromRoom();
            case 3:
                hotel.showEmptyRooms();
            case 4:

            case 5:

        }
    }

    private void addPerson() {
        int roomNumber = Commands.getNumberFromUser();
        Person person = Commands.getPerson();
        hotel.addPersonToRoom(person, roomNumber);
    }
}
