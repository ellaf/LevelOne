import java.awt.Frame;
import java.util.ArrayList;
import java.util.Iterator;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class CelebrityBodyPartGame {

	// Get 3 celebrity photos from the internet, save them to your computer, and fill
	// in their paths here. To get the path, right click on the image, and copy its Location.
	
	//1. Justin Bieber
	String firstImage = "/Users/league/Desktop/LevelOne/src/JustinBeiber.jpg";

	//2. Selena Gomez
	String secondImage = "/Users/league/Desktop/LevelOne/src/SelenaGomez.jpg";
	
	//3. Beyonce
	String thirdImage = "/Users/league/Desktop/LevelOne/src/Beyonce.jpg";

	Frame window = new Frame();


	
	private void startQuiz() {
		// Set the size of the window so that you can only see part of the image.
		
		window.setSize(400, 100);
		// Make an int variable to hold the score.
int score = 0;
		// Ask the user who this person is and store their answer



String firstQuestion = JOptionPane.showInputDialog("Who is this person?");
		// If they got the answer right:
		// -- Tell them they are correct.
		// -- Increase the score by 1
if(firstQuestion.equalsIgnoreCase("Justin Bieber")){
	JOptionPane.showMessageDialog(null, "Correct!");
	score += 1;
}else{
	JOptionPane.showMessageDialog(null, "Sorry, this person is: Justin Bieber.");
}

showNextImage();	
window.setSize(400, 100);

String secondQuestion = JOptionPane.showInputDialog("Who is this person?");

if(secondQuestion.equalsIgnoreCase("Selena Gomez")){
JOptionPane.showMessageDialog(null, "Correct!");
score += 1;
}else{
JOptionPane.showMessageDialog(null, "Sorry, this person is: Selena Gomez.");
}

showNextImage();	
window.setSize(400, 100);

String thirdQuestion = JOptionPane.showInputDialog("Who is this person?");

if(thirdQuestion.equalsIgnoreCase("Beyonce")){
JOptionPane.showMessageDialog(null, "Correct!");
score += 1;
}else{
JOptionPane.showMessageDialog(null, "Sorry, this person is: Beyonce.");
}

JOptionPane.showMessageDialog(null, "Congratulations! Your score is: " + score + " out of 3!");

// Otherwise:
		// -- Tell them they are wrong

		// Use the method below to show the next 

		// Show the score
		// .... repeat for all your images.....
	}

	public void showNextImage() {
		window.removeAll();
		window.add(getNextImage());
		window.pack();
	}

	public static void main(String[] args) {
		CelebrityBodyPartGame quiz = new CelebrityBodyPartGame();
		quiz.initializeGui();
		quiz.startQuiz();
	}

	private void initializeGui() {
		initializeImageList();
		imageIterator = imageList.iterator();
		window.setVisible(true);
		showNextImage();
	}

	private JLabel loadImage(String fileName) {
		Icon icon = new ImageIcon(fileName);
		JLabel image = new JLabel(icon);
		return image;
	}

	ArrayList<JLabel> imageList = new ArrayList<JLabel>();
	Iterator<JLabel> imageIterator;

	private void initializeImageList() {
		JLabel imageLabel = loadImage(firstImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(secondImage);
		imageList.add(imageLabel);
		imageLabel = loadImage(thirdImage);
		imageList.add(imageLabel);
	}

	private JLabel getNextImage() {
		if (imageIterator.hasNext())
			return imageIterator.next();
		window.dispose();
		return new JLabel();
	}
}

