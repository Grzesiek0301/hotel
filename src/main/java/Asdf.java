import java.util.HashMap;
import java.util.Map;

public class Asdf {
    public static void main(String[] args) {

        Map<NumberRoom, Person> map = new HashMap();
        map.put(new NumberRoom(3, 3), null);

        for (Map.Entry<NumberRoom, Person> map1 : map.entrySet()) {
            if (map1.getKey().getNumberRoom() == 3) {
                map1.setValue(new Person(123, "Grzegorz"));
            }
        }

        for (Map.Entry<NumberRoom, Person> map2 : map.entrySet()) {
            System.out.println(map2.getKey() + " " + map2.getValue());
        }

    }
}
