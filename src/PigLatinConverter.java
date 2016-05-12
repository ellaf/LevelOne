import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class PigLatinConverter implements ActionListener{

	PigLatinTranslator piggie = new PigLatinTranslator();
	
	public static void main(String[] args) {
		
		PigLatinConverter pig = new PigLatinConverter();
		pig.createUI();
		
			
		}
		
	 void createUI(){
		  
			JFrame frame = new JFrame("Pig Latin Translator");
			JPanel panel = new JPanel();
			JTextField fieldA = new JTextField(20);
			JTextField fieldB = new JTextField(20);
			JButton button = new JButton("Translate");
			button.addActionListener(this);
		frame.add(panel);
		frame.setVisible(true);
		panel.setVisible(true);
		panel.add(fieldA);
		panel.add(button);
		panel.add(fieldB);
		frame.pack();
		
	
		  
	  }

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		String candy = "yellow";
		System.out.println(piggie.translate(candy));
		
	}
	
}
