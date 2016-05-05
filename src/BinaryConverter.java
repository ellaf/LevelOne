import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {

	JButton button = new JButton("Convert");
	JFrame frame = new JFrame("Binary Converter");
	JPanel panel = new JPanel();
	JTextField textOne = new JTextField(20);
	JTextField textTwo = new JTextField(20);

	public static void main(String[] args) {

		BinaryConverter binary = new BinaryConverter();

		binary.createUI();

	}

	String convert(String binary) {
		int asciiValue = Integer.parseInt(binary, 2);
		char theLetter = (char) asciiValue;
		return "" + theLetter;

	}

	void createUI() {

		button.addActionListener(this);
		panel.add(textOne);
		panel.add(button);
		panel.add(textTwo);
		frame.add(panel);
		frame.setVisible(true);
		frame.pack();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

	}

}
