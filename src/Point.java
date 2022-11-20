import org.aspectj.lang.annotation.Aspect;

@Aspect
public class Point {
    protected double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(0, 0);
    }

    public void move(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public String toString() {
        return "x: " + x + " " + "y: " + y;
    }

    public static void main(String[] args) {

        Point p1 = new Point();
        Point p2 = new Point(); p1.move(3, 7);
        p1.move(3, 11);
        p2.move(10, 10); System.out.println(p1.howMany()); System.out.println(p2.howMany());
    }
}