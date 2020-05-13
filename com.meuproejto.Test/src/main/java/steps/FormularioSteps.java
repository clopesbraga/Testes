package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import pages.Pagina_CriaUsuario;

public class FormularioSteps {
	
	Pagina_CriaUsuario automacaobatista= new Pagina_CriaUsuario();
	
	
	@Dado("^Verificar   a opcao de formularios$")
	public void verificar_a_opcao_de_formularios() throws Throwable 
	{
	   
		automacaobatista.CarregaPagina();
		
		automacaobatista.verificaElementoTexto("Começar Automação Web");
		automacaobatista.Clicar("step 1","@Dado:","Verificar a opcao de formularios");
		
		automacaobatista.verificaElementoTexto("Formulário"); 
		automacaobatista.Clicar("step 2","@Dado:","Verificar a opcao de formularios");
		
	}
	
	@Quando("^Clicar em novo usuario$")
	public void clicar_em_novo_usuario() throws Throwable {
		
		automacaobatista.verificaElementoTexto("Criar Usuários"); 
		automacaobatista.Clicar("step 3","@Quando:","Clicar em novo usuario");
		
	}
	
	@Entao("^Preencher os campos$")
	public void preencher_os_campos() throws Throwable{
		
		/*PREENCHIMENTO DOS DADOS*/
		automacaobatista.preencheDados("user_name","Cleiton");
		automacaobatista.preencheDados("user_lastname","Lopes Braga");
		automacaobatista.preencheDados("user_email","cleiton.braga@inmetrics.com.br");
		automacaobatista.preencheDados("user_address","Avenida Guarulhos");
		automacaobatista.preencheDados("user_university","Drummond");
		automacaobatista.preencheDados("user_profile","Test Software Enginner");
		automacaobatista.preencheDados("user_gender","Masculino");
		automacaobatista.preencheDados("user_age","38");
		
		
		automacaobatista.verificaElementoBotao("commit");
		automacaobatista.Clicar("step 4","@Entao:","Preencher os campos");
		
		automacaobatista.fecharPagina();		
	}
	
	
}
