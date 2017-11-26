import java.awt.Robot;
import java.awt.event.KeyEvent;

public class SnakeMachineLearning {

	static displayInput snakeGame;
	static Robot input;
	static NeuralNetwork network;
	
	
	public static void main(String[] args) throws Exception { //this is the main function that runs the whole program
		
		input = new Robot(); //setup
		
		Thread.sleep(4000); //4 Second wait time
		
		//pressRight(); //initial start
		
		
		while(displayInput.test() == true){ //adds an infinite loop
			//displayInput.screenCapture();  //returns a picture of the screen
			
			
		}
	}
	
	
	void snakeMove() throws Exception { 

	}
	
	
	
	//Movements
	static void pressDown() {
		input.keyPress(KeyEvent.VK_S);
		input.keyRelease(KeyEvent.VK_S);
	}
	
	static void pressUp() {
		input.keyPress(38);
		input.keyRelease(38);
	}
	
	static void pressRight() {
		input.keyPress(KeyEvent.VK_D);
		input.keyRelease(KeyEvent.VK_D);
	}
	
	static void pressLeft() {
		input.keyPress(KeyEvent.VK_A);
		input.keyRelease(KeyEvent.VK_A);
	}
	
	static void pressSpace() {
		input.keyPress(KeyEvent.VK_SPACE);
		input.keyRelease(KeyEvent.VK_SPACE);
	}
}
