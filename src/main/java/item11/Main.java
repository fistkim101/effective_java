package item11;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        final Map<User, String> userMap = new HashMap<>();

        User user1 = new User(20, "홍길동1", "010-1234-1234");
        User user2 = new User(20, "홍길동2", "010-1234-1235");
        User user3 = new User(20, "홍길동2", "010-1234-1235");

        userMap.put(user1, "hello");
        userMap.put(user2, "world");
        userMap.put(user3, "world");
        System.out.println(userMap.size());

        System.out.println(userMap.get(user1)); // hello
        System.out.println(userMap.get(user2)); // world
        System.out.println(userMap.get(new User(20, "홍길동2", "010-1234-1235"))); // null
    }
}
