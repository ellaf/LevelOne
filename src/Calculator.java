import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener{
	
	JFrame window = new JFrame("Calculator");
	JPanel panel = new JPanel();
	JButton buttonAdd = new JButton("Add (+)");
	JButton buttonSub = new JButton("Subtract (-)");
	JButton buttonMult = new JButton("Multiply (x)");
	JTextField firstNumber = new JTextField(10);
	JTextField secondNumber = new JTextField(10);
	String infoA = "";
	String infoB = "";
	
public static void main(String[] args) {
	
	new Calculator();
	
	
}

@Override
public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
	infoA = (firstNumber.getText());
	infoB = (secondNumber.getText());

JButton clicked = (JButton)e.getSource();
if(clicked == buttonAdd){
	int infoAInt = Integer.parseInt(infoA);
	int infoBInt = Integer.parseInt(infoB);
	int infoCInt = infoAInt + infoBInt;
	System.out.println(infoCInt);
}else if(clicked == buttonSub){
	int infoAInt = Integer.parseInt(infoA);
	int infoBInt = Integer.parseInt(infoB);
	int infoDInt = infoAInt - infoBInt;
	System.out.println(infoDInt);
}else if(clicked == buttonMult){
	int infoAInt = Integer.parseInt(infoA);
	int infoBInt = Integer.parseInt(infoB);
	int infoEInt = infoAInt * infoBInt;
	System.out.println(infoEInt);
}
	
}

Calculator(){
	
	window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	panel.add(buttonAdd);
	panel.add(buttonMult);
	panel.add(buttonSub);
	panel.add(firstNumber);
	panel.add(secondNumber);
	window.add(panel);
	window.setVisible(true);
	window.setSize(500,500);
	panel.setLayout(null);
	buttonAdd.setBounds(75, 80, 100, 100);
	buttonSub.setBounds(175, 80, 100, 100);
	buttonMult.setBounds(275, 80, 100, 100);
	firstNumber.setBounds(125, 40, 100, 30);
	secondNumber.setBounds(250, 40, 100, 30);
	buttonAdd.addActionListener(this);
	buttonSub.addActionListener(this);
	buttonMult.addActionListener(this);

	
	
}
}

