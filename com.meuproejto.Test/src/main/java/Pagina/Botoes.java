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
			relatorio.gerarDocumento("Relatorio-Teste");
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
				relatorio.incluirPagina("Step 1 doTeste");
				
			}catch(Exception e) {}
			
			
		}
		
		return	confereElementoTexto(elemento);		
		
	}
	
	public WebElement verificaElementoBotao(String elemento) 
	{
		relatorio.incluirPagina("Step 2 do Teste");
		return  confereElementoBotao(elemento);
			
	}
	
	public WebElement verificaElementoId(String elemento) 
	{
		relatorio.incluirPagina("Step 3 do Teste");
		return  confereElementoId(elemento);
			
	}
	
	public WebElement preencheCampo(String elemento, String dados)
	{
		relatorio.incluirPagina("Step 4 do Teste");
		return preencheDados(elemento,dados);
	}

	public void fecharPagina() 
	{
		
		Thread tempo = new Thread();
		
			synchronized(tempo) 
			{
			
				try 
				{				
					fechaNavegador();
					
					relatorio.incluirPagina("Teste Finalizado");
					relatorio.encerrarDocumento();
				
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
