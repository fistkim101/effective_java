package item8_new;

import java.util.List;

public class Room implements AutoCloseable {
    private List<Object> objects;

    public Room(List<Object> objects) {
        this.objects = objects;
    }

    @Override
    public void close() throws Exception {
        objects = null;
        System.out.println("room cleaned up");
    }
}
