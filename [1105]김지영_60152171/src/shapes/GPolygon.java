package shapes;

import java.awt.Graphics2D;
import java.awt.Polygon;

import constants.GConstants.EDrawingType;

public class GPolygon extends GShape {
	private Polygon polygon;
	private int x, y,Px,Py;
	public GPolygon() {
		super(EDrawingType.NP);
		this.shape = new Polygon();
	}
	@Override
	public void initDrawing(int x, int y, Graphics2D g2D) {
		Polygon polygon = (Polygon) this.shape;
		polygon.addPoint(x, y);
		polygon.addPoint(x, y);
		this.Px=x; this.Py=y;this.x=x; this.y=y;
	}
	@Override
	public void keepDrawing(int x, int y, Graphics2D g2D) {
		Polygon polygon = (Polygon) this.shape;
		g2D.drawPolyline(polygon.xpoints, polygon.ypoints, polygon.npoints);g2D.drawLine(this.x,this.y, this.Px, this.Py);
		polygon.xpoints[polygon.npoints-1] = x;
		polygon.ypoints[polygon.npoints-1] = y;
		g2D.drawPolyline(polygon.xpoints, polygon.ypoints, polygon.npoints);g2D.drawLine(x, y, this.Px, this.Py);
		this.x=x;this.y=y;
		
	}
	public void continueDrawing(int x, int y, Graphics2D g2D) {
		Polygon polygon = (Polygon) this.shape;
		polygon.addPoint(x, y);
	}
	@Override
	public void finishDrawing(int x, int y, Graphics2D g2D) {
		Polygon polygon = (Polygon) this.shape;
		g2D.drawPolyline(polygon.xpoints, polygon.ypoints, polygon.npoints);g2D.drawLine(x, y, this.Px, this.Py);
		this.draw(g2D);
	}
	@Override
	public void draw(Graphics2D g2D) {
		Polygon polygon = (Polygon) this.shape;
		g2D.draw(polygon);
		this.getAnchors().draw(g2D,polygon.getBounds());
	}
	public GShape cloneShape() {
		// TODO Auto-generated method stub
		return new GPolygon();
	}
}
