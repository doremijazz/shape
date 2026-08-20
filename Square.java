package shape;

public class Square extends Shape {
	private double side;

    public Square(int side, int x, int y) {
        super(x, y);
        this.setSide(side);
    }

    public Square(double d, Point center) {
        super(center);
        this.setSide(d);
    }

    public Square(double d, int x, int y) {
    	super(x,y);
		this.setSide(d);
	}

	public double getSide() {
        return side;
    }

    public void setSide(double d) {
        if (d < 0) {
            d = 1;
        } else {
            this.side = d;
        }
    }

    public double area() {
        return this.side * this.side;
    }

    public double perimeter() {
        return 4 * side;
    }

    @Override
    public String toString() {
        return "Square side : " + side + super.toString();
    }
}
