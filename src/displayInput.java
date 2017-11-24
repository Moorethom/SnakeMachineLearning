import java.awt.Color;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;

import java.io.File;

import javax.imageio.ImageIO;


public class displayInput {
	
	//Screen Dimensions here:
	static int xPos = 610; //The starting x and y co-ords for the game
	static int yPos = 318;
	
	static int width = 680; //width and height of the game
	static int height = 600;
	
	//fields
	static Dimension screenDim;
	static BufferedImage img;
	static Robot robot;
	
	//color setups
	static int r;
	static int g;
	static int b;
	static Color col = new Color(r, g, b);
	
	
		
	public displayInput() {
		
	}
	
	
	public static void screenCapture() throws Exception{ //This here captures a single image of the screen
		
		screenDim = Toolkit.getDefaultToolkit().getScreenSize(); 
		
		robot = new Robot();
		
		img = robot.createScreenCapture(new Rectangle(xPos, yPos, width, height)); //saves the image here
	
		for(int i=0;i<17;i++){
			for(int j = 0; j<15; j++){
				col = new Color(img.getRGB(i*40+20,j*40+20));
				System.out.println(j + " i" + i);
				if(b>=140){
					
				} else if(r>=140){
					
				}
			}
		}
		
		//This line of code may be useless but was here for debugging purposes
		ImageIO.write(img, "jpeg",
				new File("/C:/Users/dickhead moore/Desktop/Uni/my Code Stuff/ScreenCapture/"
		        + System.currentTimeMillis() + ".jpeg")); //adds the saved image to a folder (for now)
		
	}
	
	public static boolean test(){ //basic test that checks an image is being captured
		return true;
	}
	
	
}
