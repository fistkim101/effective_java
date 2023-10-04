package item10;

public class Main {
    public static void main(String[] args) {
        ColorPoint colorPoint1 = new ColorPoint(1, 2, Color.RED);
        Point point = new Point(1, 2);
        ColorPoint colorPoint2 = new ColorPoint(1, 2, Color.BLUE);

        System.out.println(colorPoint1.equals(point)); // true
        System.out.println(point.equals(colorPoint2)); // true
        System.out.println(colorPoint1.equals(colorPoint2)); // false
    }
}
