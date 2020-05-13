package steps;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import pages.Pagina_ListaUsuarios;

public class Def_TestPagina_ListarFormulario  {
	
	Pagina_ListaUsuarios automacaobatista= new Pagina_ListaUsuarios();
	
	
	@Dado("^Ao acessar a tela de funcoes$")
	public void ao_acessar_a_tela_de_funcoes() throws Throwable 
	{
		automacaobatista.CarregaPagina();
		
		automacaobatista.verificaElementoTexto("Come�ar Automa��o Web");
		automacaobatista.Clicar("step 1","@Dado:","Ao acessar a tela de funcoes");
	}
		
	@Quando("^Clicar em listar usuarios$")
	public void clicar_em_listar_usuarios() throws Throwable {
		
		automacaobatista.verificaElementoTexto("Formul�rio"); 
		automacaobatista.Clicar("step 2","@Quando:","Clicar em listar usuarios");
		
		automacaobatista.verificaElementoTexto("Lista de Usu�rios"); 
		automacaobatista.Clicar("step 3","@Quando:","Clicar em listar usuarios");		
	   
	}
	
	@Entao("^Passar pelas paginas$")
	public void passar_pelas_paginas() throws Throwable 
	{
		
		automacaobatista.verificaElementoTexto("Pr�ximo"); 
		automacaobatista.Clicar("step 4","@Entao:","Passar pelas paginas");
		
		automacaobatista.verificaElementoTexto("Pr�ximo"); 
		automacaobatista.Clicar("step 5","@Entao:","Passar pelas paginas");
		
		automacaobatista.verificaElementoTexto("Pr�ximo"); 
		automacaobatista.Clicar("step 6","@Entao:","Passar pelas paginas");		
	
		automacaobatista.fecharPagina();		
	}
	

	
}
