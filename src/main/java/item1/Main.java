package item1;

public class Main {
    public static void main(String[] args) {
        Student studentStatic = Student.of("홍길동", 20, 3);
        Student studentNormal = new Student("홍길동", 20, 3);
    }
}
