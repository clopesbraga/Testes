package Definicoes;

import Pagina.Botoes;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;

public class DefAcessoBotao {
	
	Botoes automacaobatista= new Botoes();
	
	@Dado("Ao acessar a pagina automacaobatista")
	public void IniciarTesteBotao() 
	{
		automacaobatista.CarregaPagina();
		automacaobatista.verificaElementoTexto("Come�ar Automa��o Web","Step 1");automacaobatista.Clicar();
	}
		
	@Quando("Acessar os testes de botoes")
	public void acessarBotoes() 
	{		
		automacaobatista.verificaElementoTexto("Busca de elementos","Step 2"); automacaobatista.Clicar();
		automacaobatista.verificaElementoTexto("Bot�es","Step 3"); automacaobatista.Clicar();				
	}
	
	@Entao("Realizar os testes de click")
	public void clickTestes()
	{
			
		automacaobatista.verificaElementoId("teste","Step 4"); automacaobatista.Clicar();	
		automacaobatista.fecharPagina();	
	
	}
	

	
}
