package shape;

import java.util.HashMap;
import java.util.Map;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

import job.Graphic;
 


public class IJobImpl extends JPanel implements IJob {
	private Map<Integer, Shape> shapes;

    public IJobImpl() {
        shapes = new HashMap<>();
    }

    @Override
    public void addShape(int id, Shape shape) {
        shapes.put(id, shape);
    }

    @Override
    public void deleteShape(int id) {
        shapes.remove(id);
    }

    @Override
    public Shape getShapeById(int id) {
        return shapes.get(id);
    }

    @Override
    public void moveShape(int id, int x, int y) {
        Shape shape = shapes.get(id);
        shape.getCenter().setX(x);
        shape.getCenter().setY(y);
    }
    
    
    @Override
    public void drawShape(Graphics g) {
    	for (Shape s : shapes.values())
    	{
    		if (s instanceof Square)
    		{
				g.drawRect(s.getCenter().getX(),s.getCenter().getY(),s.getSide(),s.getSide());
    		}
            else if(s instanceof Circle){
                g.fillOval(s.getCenter().getX(),s.getCenter().getY() , s.getRadius(), s.getRadius());
            }
    	}
    }

    @Override
    public void displayAll() {
        for (Shape s : shapes.values()) {
            System.out.println(s);
        }
    }

	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawShape(g);
		
	}
	
	public static void main(String[] args) {

	    JFrame window = new JFrame("Test dessin");

	    IJobImpl drawingPanel = new IJobImpl();

	    Square square1 = new Square(50, 200, 200);
	    drawingPanel.addShape(1, square1);

	    Square square2 = new Square(65, 200, 50);
	    drawingPanel.addShape(2, square2);
         
        Circle circle1 = new Circle(20, 30,50);
        drawingPanel.addShape(3, circle1);
        
        window.add(drawingPanel);

	    window.setSize(800, 600);
	    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    window.setLocationRelativeTo(null);
	    window.setVisible(true);
	}
}
