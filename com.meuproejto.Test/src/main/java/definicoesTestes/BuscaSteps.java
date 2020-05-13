package definicoesTestes;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import paginas.Pagina_BuscaelementosBotoes;

public class BuscaSteps {
	
	Pagina_BuscaelementosBotoes automacaobatista= new Pagina_BuscaelementosBotoes();
	
	@Dado("Ao acessar a pagina automacaobatista")
	public void IniciarTesteBotao() 
	{
		
		
		automacaobatista.CarregaPagina();
		automacaobatista.verificaElementoTexto("Come�ar Automa��o Web");
		automacaobatista.Clicar("Step 1","@Dado:","Ao acessar a pagina automacaobatista");
	}
		
	@Quando("Acessar os testes de botoes")
	public void acessarBotoes() 
	{		
		automacaobatista.verificaElementoTexto("Busca de elementos");
		automacaobatista.Clicar("Step 2","@Quando:","Acessar os testes de botoes");
		
		automacaobatista.verificaElementoTexto("Bot�es"); 
		automacaobatista.Clicar("Step 3","@Quando:","Acessar os testes de botoes");				
	}
	
	@Entao("Realizar os testes de click")
	public void clickTestes()
	{		
		automacaobatista.verificaElementoId("teste"); 
		automacaobatista.Clicar("Step 4","@Entao:","Realizar os testes de click");	
		automacaobatista.fecharPagina();	
	}
	

	
}
