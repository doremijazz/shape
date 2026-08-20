package shape;

import javax.swing.JFrame;

public class TestProgramm {
    public static void main(String[] args) {

	    JFrame window = new JFrame("Test dessin");

	    IJobImpl drawingPanel = new IJobImpl();

	    Square square1 = new Square(50, 200, 200);
	    drawingPanel.addShape(1, square1);

	    Square square2 = new Square(65, 200, 50);
	    drawingPanel.addShape(2, square2);
         
        Circle circle1 = new Circle(20, 30,50);
        drawingPanel.addShape(3, circle1);
        Point p1 = new Point(100, 150);
        Circle circle2 = new Circle(15, p1);
        drawingPanel.addShape(4, circle2);

        Circle circle3 = new Circle(30, 300, 300);
        drawingPanel.addShape(5, circle3);

        Circle circle4 = new Circle(45,500,67);
        drawingPanel.addShape(6, circle4);

        Point p2 = new Point(400, 600);

        Square square3 = new Square(67,p2);
        drawingPanel.addShape(7, square3);

        Square square4 = new Square(90,300,500);
        drawingPanel.addShape(8, square4);
        
        window.add(drawingPanel);

	    window.setSize(800, 600);
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setLocationRelativeTo(null);
	    window.setVisible(true);
	}
    
}
