package shape;

import java.awt.Graphics;
import javax.swing.JPanel;
 


public class IJobImpl extends JPanel{
    public void drawShape(Graphics g) {
        ShapeList shapes = new ShapeList();
    	for (Shape s : shapes.getShapes().values())
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
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		drawShape(g);
		
	}
}
