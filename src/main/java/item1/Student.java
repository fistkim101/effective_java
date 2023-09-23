package item1;

public class Student {
    private String name;
    private int age;
    private int grade;

    private Student() {

    }

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public static Student of(String name, int age, int grade) {
        return new Student(name, age, grade);
    }
}
