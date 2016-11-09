package frames;

import java.awt.Cursor;

import shapes.GShape;

public class cursor {
	private GDrawingPanel drawingPanel;
	private GShape shape;
	public cursor() {
		// TODO Auto-generated constructor stub
	}
	public void init(GDrawingPanel drawingPanel) {
		this.drawingPanel = drawingPanel;
	}
	public void changeCursor(int x, int y){
		shape = drawingPanel.changePointShape(x, y);
		if(shape != null) {
				drawingPanel.setCursor(new Cursor(Cursor.MOVE_CURSOR));
			} 
	}
}
