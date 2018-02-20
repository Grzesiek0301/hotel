public class Main {
    public static void main(String[] args) {

        Hotel hotel = new Hotel(5, 5);
        Menu menu = new Menu(hotel);
        menu.firstMessage();

    }
}
