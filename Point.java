
public class Point {
	private double x;
    private double y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    static double distance(Point p1, Point p2) {

        double d;

        d = Math.sqrt(
            Math.pow((p1.x - p2.x), 2.0)
            + Math.pow((p1.y - p2.y), 2.0)
        );

        return d;
    }

    void affiche() {
        System.out.println("p = (" + x + " , " + y + ")");}
}
