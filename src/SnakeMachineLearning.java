import java.awt.Robot;

public class SnakeMachineLearning {
	
	static Robot robot;

	static displayInput snakeGame;
	
	public static void main(String[] args) throws Exception { //this is the main function that runs the whole program
		
		while(displayInput.test() == true){ //adds an infinite loop
			//robot.delay(50);
			displayInput.screenCapture();  //returns a picture of the screen
			snakeDisplay(); //turns the image into a readable image for the code
		}
	}
	
	static void snakeDisplay() { //
			
	}

}
