package Pagina;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import BaseTestes.BaseTestes;
import Servicos.CapturaTela;
import Servicos.GeraRelatorio;
import cucumber.api.java.de.Aber;

public class Botoes extends BaseTestes {
	
	int tempoMilisegundos= 5000;
	GeraRelatorio relatorio = new GeraRelatorio();
	
	public void CarregaPagina() 
	{				
			abreNavegador();
			relatorio.gerarDocumento("Relatorio_teste_botoes");
	}
	
	public WebElement verificaElementoTexto(String elemento,String step) 
	{
		Thread tempo = new Thread();
		
		synchronized(tempo) 
		{
			
			try 
			{				
				confereElementoTexto(elemento);
				tempo.wait(tempoMilisegundos);
				//relatorio.incluirPagina("Step 1 doTeste");
				relatorio.incluirPagina(step);
				
			}catch(Exception e) {}
			
			
		}
		
		return	confereElementoTexto(elemento);		
		
	}
	
	public WebElement verificaElementoBotao(String elemento) 
	{
		relatorio.incluirPagina("Step 2 do Teste");
		return  confereElementoBotao(elemento);
			
	}
	
	public WebElement verificaElementoId(String elemento, String step) 
	{
		relatorio.incluirPagina(step);
		return  confereElementoId(elemento);
			
	}
	

	public void fecharPagina() 
	{
		
		
		Thread tempo = new Thread();
		
			synchronized(tempo) 
			{
			
				try 
				{
					relatorio.incluirPagina("Teste Finalizado");
					relatorio.encerrarDocumento();
					fechaNavegador();
										
				}catch(Exception e) {}
		
			}
	
	}
	
	public void Clicar() 
	{
		CapturaTela tela = new CapturaTela();
		
		tela.print();
		acionaBotao();
	}
	
}
