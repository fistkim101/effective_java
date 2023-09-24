package item6;

public class Main {
    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        String hi1 = "hi";
        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            String hi2 = "hi";
        }
        long endTime = System.currentTimeMillis();

        System.out.println(endTime - startTime);
    }
}
