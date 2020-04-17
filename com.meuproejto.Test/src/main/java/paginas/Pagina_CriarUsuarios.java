package paginas;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import Servicos.CapturaTela;
import Servicos.GeraRelatorio;
import baseTestes.BaseTestes;
import cucumber.api.java.de.Aber;

public class Pagina_CriarUsuarios extends BaseTestes {
	
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
	
	public WebElement preencheCampoAutomatico(String elemento, String dados)
	{
		return preencheDados(elemento,dados);
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
					tempo.wait(tempoMilisegundos);
					fechaNavegador(getClass().getName());
					
				}catch(Exception e) {}
		
			}
	
	}
	

}
