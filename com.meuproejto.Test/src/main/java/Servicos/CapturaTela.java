package Servicos;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

public class CapturaTela {
	
	private String diretorio = "C:/Users/Cleiton Braga/Pictures/Testes/evidencia.jpg";
	private int scalax 		 = 1366;
	private int scalay 		 = 768;
	
	public void print() 
	{
		
		try 
		{		
			Robot robot = new Robot();
			BufferedImage bi=robot.createScreenCapture(new Rectangle(scalax,scalay));
			ImageIO.write(bi,"jpg",new File(diretorio));
			
		}catch (AWTException e) { e.printStackTrace();
		}catch (IOException e) { e.printStackTrace();}
				
	}

}
