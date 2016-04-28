import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class CutenessTV implements ActionListener {

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JButton buttonOne = new JButton("Adorable Ducks");
	JButton buttonTwo = new JButton("Living Squeaky Toy");
	JButton buttonThree = new JButton("Song You'll Never Forget");

	public static void main(String[] args) {

		CutenessTV tv = new CutenessTV();
		tv.createUI();

	}

	void showDucks() {
		playVideo("ZAC9Mq_9tjU");
	}

	void showFrog() {
		playVideo("cBkWhkAZ9ds");
	}

	void showFluffyUnicorns() {
		playVideo("qRC4Vk6kisY");
	}

	void playVideo(String videoID) {
		try {
			URI uri = new URI("https://www.youtube.com/v/" + videoID + "?autoplay=1");
			java.awt.Desktop.getDesktop().browse(uri);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		JButton orange = (JButton) e.getSource();

		if (orange == buttonOne) {

			showDucks();

		} else if (orange == buttonTwo) {

			showFrog();

		} else if (orange == buttonThree) {

			showFluffyUnicorns();

		}

	}

	void createUI() {

		frame.add(panel);
		frame.setVisible(true);
		panel.setVisible(true);

		buttonOne.addActionListener(this);
		buttonTwo.addActionListener(this);
		buttonThree.addActionListener(this);

		panel.add(buttonOne);
		panel.add(buttonTwo);
		panel.add(buttonThree);
		frame.pack();

		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

	}

}
