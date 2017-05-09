package wwsis.java.lista3.zad1;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Transform;

public class Circle extends Shape {
	
	public Circle(){
		
	}
	
	public Circle (int x, int y, int size, int colorID,int angle){
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
		gc.setBackground(gc.getDevice().getSystemColor(colorID));
		gc.fillOval(x, y, size, size);
	}

	
	
	

}
