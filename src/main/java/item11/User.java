package item11;

import java.util.Objects;

public class User {
    int age;
    String name;
    String phoneNumber;

    public User(int age, String name, String phoneNumber) {
        this.age = age;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        User user = (User) o;
//        return age == user.age && Objects.equals(name, user.name) && Objects.equals(phoneNumber, user.phoneNumber);
//    }
//
    @Override
    public int hashCode() {
        return Objects.hash(age, name, phoneNumber);
    }

}
