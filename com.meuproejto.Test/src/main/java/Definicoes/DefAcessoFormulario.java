package Definicoes;

import Pagina.Formulario;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;

public class DefAcessoFormulario {
	
	Formulario automacaobatista= new Formulario();
	
	@Dado("Ao estar na pagina Automacao Batista")
	public void AbrirPagina() 
	{
		automacaobatista.CarregaPagina();
		automacaobatista.verificaElementoTexto("Come�ar Automa��o Web");
		automacaobatista.Clicar();
	}
		
	@Quando("Acessar os formularios")
	public void acessarFormularios() 
	{		
		automacaobatista.verificaElementoTexto("Formul�rio"); automacaobatista.Clicar();
		automacaobatista.verificaElementoTexto("Criar Usu�rios"); automacaobatista.Clicar();				
	}
	
	@Entao("Preencher os campos")
	public void preencherDados()
	{
		
		
		/*PREENCHIMENTO DOS DADOS*/
		automacaobatista.preencheDados("user_name","Cleiton");
		automacaobatista.preencheDados("user_lastname","Lopes Braga");
		automacaobatista.preencheDados("user_email","cleiton.braga@inmetrics.com.br");
		automacaobatista.preencheDados("user_address","Avenida Guarulhos");
		automacaobatista.preencheDados("user_university","Drummond");
		automacaobatista.preencheDados("user_profile","Test Software Enginner");
		automacaobatista.preencheDados("user_gender","Masculino");
		automacaobatista.preencheDados("user_age","38");
		
		
		automacaobatista.verificaElementoBotao("commit");automacaobatista.Clicar();
		automacaobatista.fecharPagina();		
	}
	

	
}
