import javax.swing.JFrame;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
	
		
		JFrame frame = new JFrame();
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(500, 500);
		/* 1. Get the panel to show */
		panel.setVisible(true);
		
		/* 2. Set the background image of the panel to the Galapagos Islands */
panel.setBackgroundImage("https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg");
		
		/* 3. Instantiate a Turtle and add it to the panel */
	
		/* 4. Put 50 Turtles on the beach. */
		
	int b = 1;
for (int i = 0; i < 2000; i++) {
	Turtle Bob = new Turtle();
	b ++;
	Bob.setSpeed(10);
Bob.penUp();
	i += 10;
	panel.addTurtle(Bob);
	Bob.turn(i);
	Bob.move(b);
}
	}
}

