package shape;

public class Circle extends Shape{
	private int radius;

    public Circle(int radius, int x, int y) {
        super(x, y);
        setRadius(radius);
    }

    public Circle(int radius, Point center) {
        super(center);
        setRadius(radius);
    }

    public Circle() {
        super(0, 0);
        setRadius(1);
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 0) {
            this.radius = 1;
        } else {
            this.radius = radius;
        }
    }

    public double area() {
        return Math.PI * this.radius * this.radius;
    }

    public double perimeter() {
        return 2 * Math.PI * this.radius;
    }

    @Override
    public String toString() {
        return "Circle : radius = " + radius + super.toString();
    }

	@Override
	public int getSide() {
		return 0;
	}
}
