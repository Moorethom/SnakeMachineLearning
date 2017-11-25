import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics2D;
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
	
	static int rectH = 40;
	static int rectW = 40;
	
	//fields
	static Dimension screenDim;
	static BufferedImage img;
	public static BufferedImage tempImg;
	
	static Robot robot;
	static Graphics2D g2d;
	
	//color setups
	static Color col;
	
	public displayInput() {
		
	}
	
	
	public static void screenCapture() throws Exception{ //This here captures a single image of the screen
		
		screenDim = Toolkit.getDefaultToolkit().getScreenSize(); 
		
		robot = new Robot();
		
		img = robot.createScreenCapture(new Rectangle(xPos, yPos, width, height)); //saves the image here
		tempImg = robot.createScreenCapture(new Rectangle(xPos, yPos, width, height)); //saves the temp image here
		
		//This creates a graphics pane
		g2d = tempImg.createGraphics();
		g2d.setColor(Color.WHITE);
		g2d.fillRect(0, 0, img.getWidth(), img.getHeight());
	
		//The rendering of the images pixels now
		for(int i=0;i<17;i++){
			for(int j = 0; j<15; j++){
				col = new Color(img.getRGB(i*40+20,j*40+20)); //This gets a whole colour value 
				
				if(col.getBlue()>=160){ //finds the blue value from integer values 0-255
					g2d.setColor(Color.BLUE);
					g2d.fillRect(i*40, j*40, rectW, rectH); //draws a blue square for a block
				} else if(col.getRed()>=220){ //^^Same bar with the red values
					g2d.setColor(Color.RED);
					g2d.fillRect(i*40, j*40, rectW, rectH); //draws a red square for fitness block
				}
			}
		}	
		
		//This line of code may be useless but was here for debugging purposes
		ImageIO.write(tempImg, "jpeg",
				new File("/C:/Users/dickhead moore/Desktop/Uni/my Code Stuff/ScreenCapture/"
		        + System.currentTimeMillis() + ".jpeg")); //adds the saved image to a folder (for now)
		
	}
	
	public static boolean test(){ //basic test that checks an image is being captured
		return true;
	}
	
	
}
