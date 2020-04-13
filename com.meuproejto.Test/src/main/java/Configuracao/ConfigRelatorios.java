package Configuracao;

import java.awt.Rectangle;
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
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.ColumnText;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class ConfigRelatorios {
	
	String logotipo           = "C:/Users/Cleiton Braga/eclipse-workspace/Testes/com.meuproejto.Test/logo/Logo.jpg";
	String evidencia          = "C:/Users/Cleiton Braga/Pictures/Testes/evidencia.jpg";
	float  logoposx		      = 400;
	float  logoposy 	      = 700;
	float  logoscalaX     	  = 400;
	float  logoscalay     	  = 200;
	float  evidenciascalax	  = 400;
	float  evidenciascalay	  = 200;
	int    rodapescalay       = 450;
	
	
	Document pdf      = new Document();
	
	
public void  geraPDF(String nomedocumento ) 
{	
	try 
		{
			//PdfWriter.getInstance(pdf,new FileOutputStream("C:/Users/Cleiton Braga/Documents/Teste/"+nomedocumento+".pdf"));
			PdfWriter.getInstance(pdf,new FileOutputStream("C:/Users/Cleiton Braga/eclipse-workspace/Testes/com.meuproejto.Test/relatorios/"+nomedocumento+".pdf"));
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
		
			Image steps = Image.getInstance(evidencia);
			pdf.newPage();
			pdf.add(new Paragraph(cabecalho));
			steps.scaleToFit(evidenciascalax,evidenciascalay);
			pdf.add(steps);
			//criarRodape();
			gerarLogo();
			
		
	   } catch (DocumentException e) {e.printStackTrace();
	   } catch (MalformedURLException e) {e.printStackTrace();
	   } catch (IOException e) {e.printStackTrace();}
	
}

public void gerarLogo() 
{
	
	try {
			
			Image imagem = Image.getInstance(logotipo);
			imagem.scaleToFit(logoscalaX,logoscalay);
		    imagem.setAbsolutePosition(logoposx,logoposy);
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

public void criarRodape() 
{
	
	PdfPTable tab_rodape = new PdfPTable(1);
	tab_rodape.getDefaultCell().setBorder(0);

	PdfPCell c1 = new PdfPCell(new Phrase("Teste automa��o Ltda"));
	c1.setBorder(0);
	c1.setHorizontalAlignment(Element.ALIGN_LEFT);
	c1.setVerticalAlignment(Element.ALIGN_CENTER);
	tab_rodape.addCell(c1);

	
	tab_rodape.addCell("Funcionalidade: Verificar a��o de bot�es");
	tab_rodape.addCell("Realizado por: Cleiton");
	tab_rodape.addCell("Status: Sucesso");
	tab_rodape.addCell("Data: 13/04/20");
	
	
	
	tab_rodape.setHorizontalAlignment(Element.ALIGN_LEFT);
	tab_rodape.setSpacingBefore(rodapescalay);
	try {
		pdf.add(tab_rodape);
		
		
	} catch (DocumentException e){e.printStackTrace();}
	
}

}



