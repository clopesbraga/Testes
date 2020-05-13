package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import Servicos.CapturaTela;
import Servicos.GeraRelatorio;
import basePages.BaseTestes;
import cucumber.api.java.de.Aber;

public class Pagina_BuscaelementosBotoes extends BaseTestes {
	
	int tempoMilisegundos= 5000;
	
	public void CarregaPagina() 
	{				
			abreNavegador(getClass().getName());
	}
	
	public WebElement verificaElementoTexto(String elemento) 
	{
		Thread tempo = new Thread();
		
		synchronized(tempo) 
		{
			
			try 
			{				
				confereElementoTexto(elemento);
				tempo.wait(tempoMilisegundos);
				
			}catch(Exception e) {}
			
			
		}
		
		return	confereElementoTexto(elemento);		
		
	}
	
	public WebElement verificaElementoBotao(String elemento) 
	{
		return  confereElementoBotao(elemento);		
	}
	
	public WebElement verificaElementoId(String elemento) 
	{
		return  confereElementoId(elemento);	
	}
	
	public void Clicar(String step,String condicao,String descricao) 
	{
		acionaBotao(step,condicao,descricao);
	}

	public void fecharPagina() 
	{			
		Thread tempo = new Thread();
		
			synchronized(tempo) 
			{
				try 
				{	
					fechaNavegador(getClass().getName());
										
				}catch(Exception e) {}
			}
	}
	

	
}
