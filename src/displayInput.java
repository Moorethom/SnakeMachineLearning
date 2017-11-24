import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import java.io.File;

import javax.imageio.ImageIO;


public class displayInput {
	
	static Dimension screenDim;
	static BufferedImage img;
	static Robot robot;
	
	
	public displayInput() {
		
	}
	
	public static void screenCapture() throws Exception{
		
		screenDim = Toolkit.getDefaultToolkit().getScreenSize();
		
		robot = new Robot();
		
		img = robot.createScreenCapture(new Rectangle(0, 0, (int) screenDim.getWidth(),
		        (int) screenDim.getHeight()));
		
		ImageIO.write(img, "jpeg", new File("/C:/Users/dickhead moore/Desktop" + System.currentTimeMillis() + ".jpeg"));
	}
	
	public static boolean test(){
		return true;
	}
	
	
}
