package shapes;

import java.awt.Graphics2D;
import java.awt.geom.Line2D;

import constants.GConstants.EDrawingType;

public class GLine extends GShape {
	private Line2D line;
	public GLine() {
		super(EDrawingType.TP);
		this.shape = new Line2D.Double(0, 0, 0, 0);
	}
	@Override
	public void initDrawing(int x, int y, Graphics2D g2D) {
		Line2D.Double line = (Line2D.Double) this.shape;
		line.x1 = x;
		line.y1 = y;
		line.x2 = x;
		line.y2 = y;
	}
	@Override
	public void keepDrawing(int x, int y, Graphics2D g2D) {
		Line2D.Double line = (Line2D.Double) this.shape;
		this.draw(g2D);
		line.x2 = x;
		line.y2 = y;
		this.draw(g2D);
	}
	public void continueDrawing(int x, int y, Graphics2D g2D) {
	}
	@Override
	public void finishDrawing(int x, int y, Graphics2D g2D) {
	}
	@Override
	public void draw(Graphics2D g2D) {
		Line2D.Double line = (Line2D.Double) this.shape;
		g2D.draw(line);
		this.getAnchors().draw(g2D,line.getBounds());
	}
	public GShape cloneShape() {
		// TODO Auto-generated method stub
		return new GLine();
	}
}
