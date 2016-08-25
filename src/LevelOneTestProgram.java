import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LevelOneTestProgram implements ActionListener {
	JButton buttonOne = new JButton("Submit");
	JButton buttonTwo = new JButton("Hint");
	JTextField text = new JTextField(20);
	String answer = text.getText();


	public static void main(String[] args) {

		LevelOneTestProgram start = new LevelOneTestProgram();
		start.setup();
	}

	void setup() {

		JFrame frame = new JFrame("Riddle");
		JPanel panel = new JPanel();

		JLabel label = new JLabel(
				"You will always find me in the past.  I can be created in the present, but the future can never taint me.  What am I?");
		

		frame.add(panel);
		panel.add(buttonOne);
		panel.add(buttonTwo);
		frame.setVisible(true);
		panel.add(label);
		panel.add(text);
		frame.pack();
		buttonOne.addActionListener(this);
		buttonTwo.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(buttonOne)) {
			if(answer.contains("history")){
				JOptionPane.showMessageDialog(null, "Correct!");
			}
		} else if (e.getSource().equals(buttonTwo)) {
			JOptionPane.showMessageDialog(null, "Hint: You will often learn about this in school.");
		}
	}
}
