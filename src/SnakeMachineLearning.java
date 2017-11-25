
public class SnakeMachineLearning {

	static displayInput snakeGame;
	static Keyboard moveSnake;
	
	
	public static void main(String[] args) throws Exception { //this is the main function that runs the whole program
		
		Thread.sleep(3000);
		//snakeMove();
		
		while(displayInput.test() == true){ //adds an infinite loop
			displayInput.screenCapture();  //returns a picture of the screen
			
		}
	}
	
	static void snakeMove() throws Exception { 
		moveSnake.pressDown();
	}
}
