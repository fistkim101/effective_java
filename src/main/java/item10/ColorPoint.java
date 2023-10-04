package item10;

public class ColorPoint extends Point {
    private final Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }

        // Point 이긴 한데 ColorPoint 가 아닌 경우다
        if (!(obj instanceof ColorPoint)) {
            // Point 에서 정의한걸 쓰는데 x, y 좌표만 비교
            return super.equals(obj);
        }

        ColorPoint o = (ColorPoint) obj;
        return this.x == o.x && this.y == o.y && this.color == o.color;
    }
}
