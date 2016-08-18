import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JApplet;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class TootMachine implements ActionListener{
	JFrame frame = new JFrame("Toot Machine");
	JPanel panel = new JPanel();
	JButton buttonOne = new JButton("Sound #1");
	JButton buttonTwo = new JButton("Sound #2");
void setup(){
	
	
	buttonOne.addActionListener(this);
	buttonTwo.addActionListener(this);
	
	frame.setVisible(true);
	panel.add(buttonOne);
	panel.add(buttonTwo);
	frame.add(panel);
	frame.pack();
	
}
	
	public static void main(String[] args){
		
		TootMachine machine = new TootMachine();
		machine.setup();
		
		
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
if(e.getSource().equals(buttonOne)){
		playSound("27137__zippi1__fart4.wav");
		
}else if(e.getSource().equals(buttonTwo)){
	playSound("61047__timtube__fart.wav");
	
}
		
	}
	private void playSound(String fileName) {
		AudioClip sound = JApplet.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

	
}
