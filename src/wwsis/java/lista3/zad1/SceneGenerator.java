package wwsis.java.lista3.zad1;

import java.util.ArrayList;
import java.util.Random;
import org.eclipse.swt.graphics.Rectangle;

public class SceneGenerator {

	private ArrayList<Shape> sceneList = new ArrayList<Shape>();
	Rectangle tempBounds = new Rectangle(0, 0, 0, 0);
	
	
	public SceneGenerator(Rectangle bounds){
		this.tempBounds=bounds;
		
	}
	
	public ArrayList<Shape> getScene(){
		
		randomizeScene(sceneList);
		return sceneList;
		
	}
	
	public void randomizeScene(ArrayList<Shape> aList){
		
		int figAmount=0, figureNo=0, randX=0, randY=0, randSize=0, randColorID=0,randAngle=0;
		Random rand = new Random();

		figAmount = rand.nextInt(100)+40;
		
			
		for(int i=0; i<figAmount; i++){
			figureNo=rand.nextInt(4);
			
			switch (figureNo){
				case 0:
					Square square = new Square();
					aList.add(square);
					break;
				case 1:
					Circle circle = new Circle();
					aList.add(circle);
					break;
				case 2:
					Triangle triangle = new Triangle();
					aList.add(triangle);
					break;
				case 3:
					Pentagon pentagon = new Pentagon();
					aList.add(pentagon);
					break;
			}
		}

		for(int i=0; i<figAmount; i++){
			randX=rand.nextInt(tempBounds.width);
			randY=rand.nextInt(tempBounds.height);
			randSize=rand.nextInt(80);
			randColorID=rand.nextInt(10)+1;
			randAngle=rand.nextInt(360);
			aList.get(i).x=randX;
			aList.get(i).y=randY;
			aList.get(i).size=randSize;
			aList.get(i).colorID=randColorID;
			aList.get(i).angle=randAngle;
		}		
	}

}
