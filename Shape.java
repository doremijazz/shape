package shape;

public abstract class Shape {
	private Point center;

    protected Shape(int x, int y) {
        this.center = new Point(x, y);
    }

    protected Shape(Point center) {
        this.center = new Point(center.getX(), center.getY());
    }
    
    public Point getCenter() {
        return center;
    }

    @Override
    public String toString() {
        return " Shape [center = " + center + "]";
    }
    public abstract int getSide();
    public abstract int getRadius();
}
