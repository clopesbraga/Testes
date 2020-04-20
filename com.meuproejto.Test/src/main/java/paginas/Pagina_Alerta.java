package paginas;

import org.openqa.selenium.WebElement;

import baseTestes.BaseTestes;

public class Pagina_Alerta extends BaseTestes
{
	
	int tempoMilisegundos = 5000;
	
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
	
	public void verificaElementoBotao(String elemento) 
	{
		
		confereElementoBotao(elemento);
		
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