package item8;

import java.lang.ref.Cleaner;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cleaner cleaner = Cleaner.create();
        List<Object> objects = List.of("a", "b", "c");
        Room room = new Room(objects);

        cleaner.register(room, new Room.RoomCleaner(objects));
        room = null;
        System.gc();
        System.out.println("gc started");
    }
}
