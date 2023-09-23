package etc;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Person {
    private final int age;

    public Person(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class Main {
    public static void main(String[] args) {
        Function<Integer, String> intToString1 = i -> i.toString();
        String result1 = intToString1.apply(1);
        System.out.println(result1); // 1

        Function<Integer, String> intToString2 = Object::toString;
        String result2 = intToString2.apply(1);
        System.out.println(result2); // 1

        Supplier<String> newString = () -> "hello";
        String result3 = newString.get(); // hello
        System.out.println(result3);

        Consumer<String> sayHello1 = (str) -> System.out.println(str);
        sayHello1.accept("sayHello1"); // sayHello1

        Consumer<String> sayHello2 = System.out::println;
        sayHello1.accept("sayHello2"); // sayHello1

        Predicate<Person> isAdult = (person) -> person.getAge() > 19;
        System.out.println(isAdult.test(new Person(20))); // true
        System.out.println(isAdult.test(new Person(18))); // false
    }
}
