import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class ChuckleClicker implements ActionListener {

	JFrame frameA = new JFrame("Carrot Joke");
	JFrame frameB = new JFrame("Sticky Situation Joke");
	JFrame frameC = new JFrame("Buffalo Joke");
	JPanel panelA = new JPanel();
	JPanel panelB = new JPanel();
	JPanel panelC = new JPanel();
	JButton buttonA = new JButton("Joke");
	JButton buttonB = new JButton("Punchline");
	JButton buttonC = new JButton("Joke");
	JButton buttonD = new JButton("Punchline");
	JButton buttonE = new JButton("Joke");
	JButton buttonF = new JButton("Punchline");

	public static void main(String[] args) {

		ChuckleClicker clicky = new ChuckleClicker();
		clicky.makeButtonsA();
		clicky.makeButtonsB();
		clicky.makeButtonsC();

	}

	void makeButtonsA() {

		frameA.setVisible(true);
		frameA.setSize(200, 70);
		frameA.add(panelA);
		panelA.setVisible(true);
		panelA.add(buttonA);
		panelA.add(buttonB);
		buttonA.addActionListener(this);
		buttonB.addActionListener(this);

	}

	void makeButtonsB() {

		frameB.setVisible(true);
		frameB.setSize(200, 70);
		frameB.add(panelB);
		panelB.setVisible(true);
		panelB.add(buttonC);
		panelB.add(buttonD);
		buttonC.addActionListener(this);
		buttonD.addActionListener(this);

	}

	void makeButtonsC() {

		frameC.setVisible(true);
		frameC.setSize(200, 70);
		frameC.add(panelC);
		panelC.setVisible(true);
		panelC.add(buttonE);
		panelC.add(buttonF);
		buttonE.addActionListener(this);
		buttonF.addActionListener(this);

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		JButton buttonClicked = (JButton) e.getSource();
		if (buttonClicked == buttonA) {
			JOptionPane.showMessageDialog(null, "How do you know that carrots are good for your eyesight?");
		} else if (buttonClicked == buttonB) {
			JOptionPane.showMessageDialog(null, "Have you ever seen a rabbit with glasses?");
		} else if (buttonClicked == buttonC) {
			JOptionPane.showMessageDialog(null, "Why did the chewing gum cross the road?");
		} else if (buttonClicked == buttonD) {
			JOptionPane.showMessageDialog(null, "He was stuck to the chicken's foot.");
		} else if (buttonClicked == buttonE) {
			JOptionPane.showMessageDialog(null, "What did the dad buffalo say to his son on the first day of school?");
		} else if (buttonClicked == buttonF) {
			JOptionPane.showMessageDialog(null, "Bison.");
		}

	}

}
