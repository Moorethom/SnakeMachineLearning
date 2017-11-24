import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import java.io.File;

import javax.imageio.ImageIO;


public class displayInput {
	
	//feilds
	static Dimension screenDim;
	static BufferedImage img;
	static Robot robot;
	
	
	public displayInput() {
		
	}
	
	
	public static void screenCapture() throws Exception{ //This here captures a single image of the screen
		
		screenDim = Toolkit.getDefaultToolkit().getScreenSize(); 
		
		robot = new Robot();
		
		img = robot.createScreenCapture(new Rectangle(0, 0, (int) screenDim.getWidth(),
		        (int) screenDim.getHeight())); //saves the image here
		
		ImageIO.write(img, "jpeg", new File("/C:/Users/dickhead moore/Desktop/" + System.currentTimeMillis() + ".jpeg"));
		//^^ adds the saved image to desktop (for now)
	}
	
	public static boolean test(){ //basic test that checks an image is being captured
		return true;
	}
	
	
}
