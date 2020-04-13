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
		automacaobatista.verificaElementoTexto("Começar Automação Web");
		automacaobatista.Clicar();
	}
		
	@Quando("Acessar os testes de botoes")
	public void acessarBotoes() 
	{		
		automacaobatista.verificaElementoTexto("Busca de elementos"); automacaobatista.Clicar();
		automacaobatista.verificaElementoTexto("Botões"); automacaobatista.Clicar();				
	}
	
	@Entao("Realizar os testes de click")
	public void clickTestes()
	{
			
		automacaobatista.verificaElementoId("teste"); automacaobatista.Clicar();	
		automacaobatista.fecharPagina();	
	
	}
	

	
}
