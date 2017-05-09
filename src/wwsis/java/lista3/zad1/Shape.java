package wwsis.java.lista3.zad1;

import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Transform;

public abstract class Shape {
	public int x;
	public int y;
	public int size;
	public int colorID;
	public int angle;
	
	public Shape(){
		
	}
	public Shape(int x, int y, int size, int colorID,int angle){
	this.x = x;
	this.y = y;
	this.size = size;
	this.colorID = colorID;
	this.angle = angle;
	}	
	
	public int getX(){
		return x;
	}
	
	public int getY(){
		return y;
	}
	
	public int getSize(){
		return size;
	}
	
	public int getcolorID(){
		return colorID;
	}
	
	public void setX(int x){
		this.x=x;
	}
	public void setY(int y){
		this.y=y;
	}
	public void setSize(int size){
		this.size=size;
	}
	public void setColorID(int colorID){
		this.colorID=colorID;
	}
	public int getAngle(){
		return angle;
	}
	public void setAngle(int angle){
		this.angle=angle;
	}
	
	
	public abstract void draw(GC gc,Transform transform, int x, int y, int size, int colorID, int angle);
	
	
}
