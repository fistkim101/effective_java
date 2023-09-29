package item8_new;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.InnerClass innerClass = outerClass.new InnerClass();
        innerClass.printAllFields();

//        List<Object> objects = List.of("a", "b", "c");
//        Room room1 = new Room(objects);

        List<Object> objects = List.of("a", "b", "c");
        try (Room room2 = new Room(objects)) {

        } catch (Exception exception) {

        }
    }
}
