package Configuracao;

import java.io.FileOutputStream;
import java.io.IOException;
import java.net.MalformedURLException;

import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;

public class ConfigRelatorios {
	String   logotipo = "/Logo/Logo.jpg";
	Document pdf      = new Document();
	
	
	
	
public void  geraPDF(String nomedocumento ) 
{	
	try 
		{
			PdfWriter.getInstance(pdf,new FileOutputStream("C:/Users/Cleiton Braga/Documents/Teste/"+nomedocumento+".pdf"));		
			pdf.open();
			pdf.setPageSize(PageSize.A4);
			
		}catch(DocumentException e)
		{
			e.printStackTrace();
				
		}catch(IOException io) 
		{
			io.printStackTrace();	
		}
	
		
}

public void  encerrarPDF() 
{
	pdf.close();

}

public void  incluirPagina(String cabecalho) 
{
	
	try {
		
			pdf.newPage();
			pdf.add(new Paragraph(cabecalho));
			gerarLogo();
		
	   } catch (DocumentException e) {e.printStackTrace();}
	
}


public void gerarLogo() 
{
	
	try {
			
			Image imagem = Image.getInstance(logotipo);
			imagem.scaleToFit(400,200);
			pdf.add(imagem);
			
	    } catch (BadElementException e)   {e.printStackTrace();
	    } catch (MalformedURLException e) {e.printStackTrace();
	    } catch (IOException e) 	      {e.printStackTrace();
	    } catch (DocumentException e)     {e.printStackTrace();}
	
}

public void incluirImagem(Image imagem) throws DocumentException 
{
	
	pdf.add(imagem);
	
}


}



