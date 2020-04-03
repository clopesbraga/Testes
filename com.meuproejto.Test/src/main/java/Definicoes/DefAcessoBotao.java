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
		automacaobatista.verificaElementoTexto("Come�ar Automa��o Web");
		automacaobatista.Clicar();
	}
		
	@Quando("Acessar os testes de botoes")
	public void acessarBotoes() 
	{		
		automacaobatista.verificaElementoTexto("Busca de elementos"); automacaobatista.Clicar();
		automacaobatista.verificaElementoTexto("Bot�es"); automacaobatista.Clicar();				
	}
	
	@Entao("Realizar os testes de click")
	public void clickTestes()
	{
		
		
		automacaobatista.verificaElementoId("teste"); automacaobatista.Clicar();
		//automacaobatista.verificaElementoTexto("btn-floating"); automacaobatista.Clicar();
		//automacaobatista.verificaElementoBotao("Submmit"); automacaobatista.Clicar();
		//automacaobatista.verificaElementoBotao("Voltar"); automacaobatista.Clicar();
		
	
	
		//automacaobatista.fecharPagina();		
	}
	

	
}