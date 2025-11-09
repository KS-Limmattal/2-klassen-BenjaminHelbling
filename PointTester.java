import java.awt.*;

public class PointTester {

    public static void main(String[] args) {
        Point p = new Point(2,5);
        Point q = new Point(p);
        double px = p.getX();
        double py = p.getY();
        System.out.println(q);
        p.setLocation(py,px);
        System.out.println(p);
        System.out.println(q);
    }
}
