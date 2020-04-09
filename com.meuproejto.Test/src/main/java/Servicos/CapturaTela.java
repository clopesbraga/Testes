package Servicos;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CapturaTela {
		
	public void print() 
	{
		int pagina=0;	
		try 
		{		
			Robot robot = new Robot();
			BufferedImage bi=robot.createScreenCapture(new Rectangle(800,400));
			ImageIO.write(bi,"jpg", new File("C:/Users/Cleiton Braga/Pictures/Testes/imageTest"+pagina+".jpg"));
			pagina++;
			
		}catch (AWTException e) { e.printStackTrace();
		
		}catch (IOException e) { e.printStackTrace();}
				
	}

}
