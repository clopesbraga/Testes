package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.gl.E;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import pages.Pagina_Alerta;

public class FocoSteps {
	
	
Pagina_Alerta automacaobatista= new Pagina_Alerta();
	
	@Dado("O acesso a pagina automacaobatista")
	public void o_acesso_a_pagina_automacaobatista() 
	{
		automacaobatista.CarregaPagina();
		automacaobatista.verificaElementoTexto("Come�ar Automa��o Web");
		automacaobatista.Clicar("Step 1","@Dado:","O acesso a pagina automacaobatista");
	}
		
	@Quando("Clicar na opcao Mudanca de foco")
	public void clicar_na_opcao_mudanca_de_foco() 
	{		
		automacaobatista.verificaElementoTexto("Mudan�a de foco");
		automacaobatista.Clicar("Step 2","@Quando:","Clicar na opcao Mudanca de foco");			
	}
	
	@E ("Clicar na opcao Alert")
	public void clicar_na_opcao_alert() 
	{		
		automacaobatista.verificaElementoTexto("Alert");	
		automacaobatista.Clicar("Step 3","@E:","Clicar na opcao Alert");			
	}
	
	@Entao("Realizar os testes no botao JS Alert")
	public void realizar_os_testes_no_botao_jsalert()
	{	
		automacaobatista.verificaElementoBotao("Clique para JS Alert");	
		automacaobatista.Clicar("Step 4","@Entao:","Realizar os testes no bot�o JS Alert");	
		
		automacaobatista.verificaElementoBotao("Eu sou um alerta JS!");	
		automacaobatista.Clicar("Step 5","@Entao:","Realizar os testes no bot�o JS Alert");	
		
		//automacaobatista.verificaElementoTexto("Voltar");	
		//automacaobatista.Clicar("Step 6","@Entao:","Realizar os testes no bot�o JS Alert");	
		
		automacaobatista.fecharPagina();	
	}

}
