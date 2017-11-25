import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;


public class Keyboard {
	
	
	static Robot input;
	
	//key presses
	public boolean pressDown() throws AWTException {
		input = new Robot();
		input.keyPress(KeyEvent.VK_S);
		input.keyRelease(KeyEvent.VK_S);
		return true;
	}
	
	void pressUp() {
		input.keyPress(38);
		input.keyRelease(38);
	}
	
	void pressRight() {
		input.keyPress(KeyEvent.VK_D);
		input.keyRelease(KeyEvent.VK_D);
	}
	
	void pressLeft() {
		input.keyPress(KeyEvent.VK_A);
		input.keyRelease(KeyEvent.VK_A);
	}
	
	void pressSpace() {
		input.keyPress(KeyEvent.VK_SPACE);
		input.keyRelease(KeyEvent.VK_SPACE);
	}
}

