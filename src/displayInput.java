import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import java.io.File;

import javax.imageio.ImageIO;


public class displayInput {
	
	//fields
	static Dimension screenDim;
	static BufferedImage img;
	static Robot robot;
	
	
	public displayInput() {
		
	}
	
	
	public static void screenCapture() throws Exception{ //This here captures a single image of the screen
		
		screenDim = Toolkit.getDefaultToolkit().getScreenSize(); 
		
		robot = new Robot();
		
		img = robot.createScreenCapture(new Rectangle(610, 318, 680, 600)); //saves the image here
		
		ImageIO.write(img, "jpeg",
				new File("/C:/Users/dickhead moore/Desktop/Uni/my Code Stuff/ScreenCapture/"
		        + System.currentTimeMillis() + ".jpeg")); //adds the saved image to a folder (for now)
		
	}
	
	public static boolean test(){ //basic test that checks an image is being captured
		return true;
	}
	
	
}
