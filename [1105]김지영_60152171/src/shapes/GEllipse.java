package shapes;
 
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;

import constants.GConstants.EDrawingType;

public class GEllipse extends GShape {
	private int x1, y1, x2, y2;
	public GEllipse() {
		super(EDrawingType.TP);		
		this.shape = new Ellipse2D.Double(0,0,0,0);
	}
	@Override
	public void initDrawing(int x, int y, Graphics2D g2D) {
		Ellipse2D.Double ellipse = (Ellipse2D.Double) this.shape;
		ellipse.x = x;
		ellipse.y = y;
	}
	@Override
	public void keepDrawing(int x, int y, Graphics2D g2D) {
		Ellipse2D.Double ellipse = (Ellipse2D.Double) this.shape;
		this.draw(g2D);
		ellipse.height = y -ellipse.y;
		ellipse.width = x-ellipse.x;
		this.draw(g2D);
		
		
	}
	@Override
	public void draw(Graphics2D g2D) {
		Ellipse2D ellipse = (Ellipse2D) this.shape;
		g2D.draw(ellipse);
		this.getAnchors().draw(g2D,ellipse.getBounds());
	} 
	@Override
	public void continueDrawing(int x, int y, Graphics2D g2d) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void finishDrawing(int x, int y, Graphics2D g2d) {
		// TODO Auto-generated method stub
		
	}
}
