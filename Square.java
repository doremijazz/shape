package shape;

public class Square extends Shape {
	private int side;

    public Square(int side, int x, int y) {
        super(x, y);
        this.setSide(side);
    }

    public Square(int d, Point center) {
        super(center);
        this.setSide(d);
    }


	public int getSide() {
        return side;
    }

    public void setSide(int d) {
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
