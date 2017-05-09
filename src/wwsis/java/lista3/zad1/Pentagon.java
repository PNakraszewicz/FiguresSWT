package wwsis.java.lista3.zad1;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Transform;

public class Pentagon extends Shape {
	
	public Pentagon(){
	}
	
	public Pentagon(int x, int y, int size, int colorID,int angle){
		super(x, y, size, colorID,angle);
	}

	public int getX(){
		return super.getX();
	}
	
	public int getY(){
		return super.getY();
	}
	
	public int getSize(){
		return super.size;
	}
	
	public void setSize(int size){
		this.size=size;
	}
	
	public int getColourID(){
		return colorID;		
	}
	
	public void setColor(int colorID){
		this.colorID=colorID;		
	}
	public int getAngle(){
		return angle;
	}
	public void setAngle(int angle){
		this.angle=angle;
	}
	public void draw(GC gc,Transform transform, int x, int y, int size, int colorID, int angle){
		int[] points={x, y, x+2*size, y+size, x+size, y+2*size, x-size, y+2*size, x-2*size, y+size};
		gc.setBackground(gc.getDevice().getSystemColor(colorID));
		gc.fillPolygon(points);		
	}

}
