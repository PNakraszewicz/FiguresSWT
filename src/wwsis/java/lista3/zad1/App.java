package wwsis.java.lista3.zad1;

import org.eclipse.swt.SWT;
import org.eclipse.swt.events.PaintEvent;
import org.eclipse.swt.events.PaintListener;
import org.eclipse.swt.layout.FillLayout;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Canvas;


public class App {

	protected Shell shell;

	public static void main(String[] args) {
		
		try {
			App window = new App();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	protected void createContents() {
		shell = new Shell();
		shell.setSize(800, 600);
		shell.setText("Random geometry generator");
		shell.setLayout(new FillLayout(SWT.HORIZONTAL));
		

		final Canvas canvas = new Canvas(shell, SWT.NONE);
		SceneGenerator sg = new SceneGenerator(shell.getBounds());
		final ScenePainter sp = new ScenePainter(sg.getScene());
		
		canvas.addPaintListener(new PaintListener() {
			public void paintControl(PaintEvent event){
//redraw on a resize of frame
				sg.getScene();
				sp.paintScene(event.gc);
			}
		});

		canvas.setBounds(0, 0, 800, 600);
	}
}
