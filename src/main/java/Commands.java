import java.util.Scanner;

public class Commands {

    public static int getNumberFromUser() {
        Scanner read = new Scanner(System.in);
        return read.nextInt();
    }

    public static Person getPerson() {
        String name = getNameFromUser();
        int id = getNumberFromUser();
        return new Person(id, name);
    }

    private static String getNameFromUser() {
        Scanner readName = new Scanner(System.in);
        return readName.nextLine();
    }
}
