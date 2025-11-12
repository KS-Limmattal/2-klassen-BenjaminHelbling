import java.awt.*;

public class PointTester {

    public static void main(String[] args) {
        Point p = new Point(2,5);
        Point q = new Point(p);
        System.out.println(q);
        p.setLocation(p.getY(),p.getX());
        System.out.println(p);
        System.out.println(q);
    }
}
