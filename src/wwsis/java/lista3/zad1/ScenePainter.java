package wwsis.java.lista3.zad1;

import java.util.ArrayList;

import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.GC;
import org.eclipse.swt.graphics.Transform;
import org.eclipse.swt.widgets.Display;
public class ScenePainter {
	
	public ArrayList<Shape>shapes = new ArrayList<Shape>();
	
	public ScenePainter(ArrayList<Shape> shapes){
		this.shapes = shapes;
	}


	public void paintScene(GC gc){
		Transform transform = new Transform(Display.getCurrent());
		
		for(int i=0; i<shapes.size();i++){
	        float cos = (float)Math.cos(Math.PI*shapes.get(i).angle/180);
	        float sin = (float)Math.sin(Math.PI*shapes.get(i).angle/180);
	        transform.setElements(cos, sin, -sin, cos, 0, 0);
			gc.setTransform(transform);
			gc.setAntialias(SWT.ON);
			shapes.get(i).draw(gc,transform, shapes.get(i).x, shapes.get(i).y, shapes.get(i).size, shapes.get(i).colorID,shapes.get(i).angle);	
		}
		
	}
}
