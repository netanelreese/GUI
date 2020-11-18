import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class GUITest {

	private static final int HEIGHT = 400;
	private static final int WIDTH = 300;

	public static void main(String[] args) {
		// shofar all of our programs were sequential
		//consequential programming not code monkey
		//they reached the END  - finito, "Long silence" - just kidding lol!!!
		// wtf is darkwave????
		// NEw Wave -> Dark wave -> today
		JFrame drJ = new JFrame("Dark Wave");
		drJ.setSize(WIDTH, HEIGHT);
		drJ.setLocationRelativeTo(null);
		
		drJ.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton men = new JButton("Men Who Stare");
		JButton goats = new JButton("At Goats");
		JButton monkeys = new JButton("at code monkeys");
		JButton doNotPushMe = new JButton("my finger is on the button");
		
		FlowLayout layout = new FlowLayout();
		
		drJ.setLayout(layout);
		
		drJ.add(men);
		drJ.add(goats);
		drJ.add(monkeys);
		drJ.add(doNotPushMe);
		
		drJ.pack();
		
		drJ.setVisible(true);
	}

}
