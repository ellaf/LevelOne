import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener{


public static void main(String[] args) {
	
	
	
	FortuneCookie fortune = new FortuneCookie();
	fortune.showButton();

	
	
	
	
}

public void showButton(){
	
	
JFrame frame = new JFrame();
frame.setSize(400, 200);
frame.setVisible(true);
JButton button = new JButton();
frame.add(button);
button.setVisible(true);
button.setText("Want your Fortune?");
button.addActionListener(this);

	
}

@Override
public void actionPerformed(ActionEvent e) {
	
	int random = new Random().nextInt(5);
	if(random == 0){
	JOptionPane.showMessageDialog(null, "You will find great wealth in the near future.");
	}else if(random == 1){
	JOptionPane.showMessageDialog(null, "Happiness awaits you.");
	}else if(random == 2){
	JOptionPane.showMessageDialog(null, "Joy fills your life.");
	}else if(random == 3){
	JOptionPane.showMessageDialog(null, "Pursue your dreams and you will be rewarded.");
	}else if(random == 4){
	JOptionPane.showMessageDialog(null, "Follow your heart; it will lead you in the right directions.");
	}

	// TODO Auto-generated method stub
	
}




}