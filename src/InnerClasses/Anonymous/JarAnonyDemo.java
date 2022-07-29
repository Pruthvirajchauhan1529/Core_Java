package InnerClasses.Anonymous;

import java.awt.*;
import java.awt.event.*;

class JarAnonyDemo{
	public static void main(String[] args) {
		Frame f = new Frame();
		f.addWindowListener(new WindowAdapter(){

			public void windowClosing(WindowEvent e){
				for (int i = 1; i<=5; i++) {
					System.out.println("I am closing window : "+ i);
				}
				System.exit(0);
			}
		});
		f.add(new Label("I can create executable JarFile!!!"));
		f.setSize(500,500);
		f.setVisible(true);
	}
}