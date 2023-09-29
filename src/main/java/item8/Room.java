package item8;

import java.util.List;

public class Room {
    private List<Object> objects;

    public Room(List<Object> objects) {
        this.objects = objects;
    }

    static class RoomCleaner implements Runnable {
        private List<Object> objects;

        public RoomCleaner(List<Object> objects) {
            this.objects = objects;
        }

        @Override
        public void run() {
            System.out.println("RoomCleaner : room clean ...");
            objects = null;
        }
    }
}
