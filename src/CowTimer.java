import java.applet.AudioClip;
import java.io.IOException;
import javax.swing.JApplet;
import javax.swing.JOptionPane;

public class CowTimer {
	/*
	 * This is an advanced recipe. There may be more than one line of code for
	 * each instruction.
	 * Work in seconds when testing, then change to minutes
	 */
	String time;
	int timeInt;

	public static void main(String[] args) throws InterruptedException {
		/* 1. Make a CowTimer, set the time and start it. */
		CowTimer cow = new CowTimer();
		
		String time = JOptionPane.showInputDialog("How many seconds would you like to set your timer for?");
		
		cow.timeInt = Integer.parseInt(time);
		
		
		cow.setTime(cow.timeInt);
		cow.start();
		
	}
	
	// By the way, there are 60,000 milliseconds in one minute; 1000 milliseconds in a second.

	private int minutes;

	public void setTime(int minutes) {
		this.minutes = minutes;
		System.out.println("Cow set to " + minutes + " seconds.");
	}

	public void start() throws InterruptedException {
		/*
		 * 2. Count down the minutes, print the current minute then sleep for 60
		 * seconds using Thread.sleep(int milliseconds).
		 */


		
		for (int i = 0; i < timeInt; i++) {
			
			Thread.sleep(1000);
			minutes --;
			System.out.println("There are " + minutes + " seconds left on the timer.");
			
			
		}
		
		System.out.println("The timer has finished!");
		
playSound("59245__zozzy__z-moo01.wav");

Thread.sleep(2000);

speak("It's time to walk.");

		
		/*
		 * 3. When the timer is finished, use the playSound method to play a moo
		 * sound. You can download one from freesound.org, then drag it into
		 * your default package. Tell the students (by speaking) it's time to walk.
		 */

	}

	private void playSound(String fileName) {
		AudioClip sound = JApplet
				.newAudioClip(getClass().getResource(fileName));
		sound.play();
	}

private void speak(String stuffToSay) {
		try {
			Runtime.getRuntime().exec("say " + stuffToSay).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
