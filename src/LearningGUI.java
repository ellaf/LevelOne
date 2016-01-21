import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LearningGUI implements ActionListener {
	
	JFrame window = new JFrame();
	JPanel panel = new JPanel();
	JButton start = new JButton("Secret to the Universe");
	JButton other = new JButton("Potato");
	JTextField name = new JTextField(10);
	
public static void main(String[] args) {

	new LearningGUI();
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
JButton clicked =  (JButton)e.getSource();
if(clicked == start){
	System.out.println("Potato.");
}else if(clicked == other){
	System.out.println("French Fries!");
}
}

LearningGUI(){
	
	
	window.setVisible(true);
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.add(start);
	panel.add(other);
	panel.add(name);
	window.add(panel);
	window.setSize(500, 500);
	start.addActionListener(this);
	other.addActionListener(this);
	
}


public void speak(String words){
	
}

}
