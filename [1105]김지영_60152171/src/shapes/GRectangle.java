package shapes;

import java.awt.Graphics2D;
import java.awt.Rectangle;

import constants.GConstants.EDrawingType;

public class GRectangle extends GShape {
	private Rectangle rectangle;
	public GRectangle() {
		super(EDrawingType.TP); 
		this.shape = new Rectangle(0, 0, 0, 0);
	}
	@Override
	public void initDrawing(int x, int y, Graphics2D g2D) {
//		this.rectangle.setLocation(x, y);
		Rectangle rectangle = (Rectangle) this.shape;
		rectangle.setLocation(x, y);
//		rectangle.setSize(0, 0);
	}
	@Override
	public void keepDrawing(int x, int y, Graphics2D g2D) {
		Rectangle rectangle = (Rectangle) this.shape;
		this.draw(g2D);
		rectangle.width = x -rectangle.x;
		rectangle.height = y - rectangle.y;
		this.draw(g2D);
	}
	public void continueDrawing(int x, int y, Graphics2D g2D) {
	}
	@Override
	public void finishDrawing(int x, int y, Graphics2D g2D) {
	}
	@Override
	public void draw(Graphics2D g2D) {
		Rectangle rectangle = (Rectangle) this.shape;
		g2D.draw(rectangle);
		this.getAnchors().draw(g2D,rectangle.getBounds());
	}
	public GShape cloneShape() {
		// TODO Auto-generated method stub
		return new GRectangle();
	}
}
