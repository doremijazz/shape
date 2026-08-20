package shape;

import java.util.HashMap;
import java.util.Map;
import java.awt.Graphics;
import javax.swing.JPanel;
 


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
}
