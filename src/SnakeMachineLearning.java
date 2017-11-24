public class SnakeMachineLearning {

	static displayInput snakeGame;
	
	public static void main(String[] args) throws Exception {
		while(displayInput.test() == true){
			snakeDisplay();
		}
	}
	
	static void snakeDisplay() throws Exception{
		displayInput.screenCapture();	
	}

}
