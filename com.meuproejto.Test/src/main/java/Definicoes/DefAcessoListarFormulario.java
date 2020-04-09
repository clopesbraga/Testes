package Definicoes;

import Pagina.ListarFormulario;
import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;

public class DefAcessoListarFormulario  {
	
	ListarFormulario automacaobatista= new ListarFormulario();
	
	
	@Dado("Ao acessar a tela de funcoes")
	public void Ao_acessar_a_tela_de_funcoes() throws Throwable 
	{
		automacaobatista.CarregaPagina();
		automacaobatista.verificaElementoTexto("Come�ar Automa��o Web");
		automacaobatista.Clicar();
	}
		
	@Quando("^Clicar em listar usuarios$")
	public void clicar_em_listar_usuarios() throws Throwable {
		
		automacaobatista.verificaElementoTexto("Formul�rio"); automacaobatista.Clicar();
		automacaobatista.verificaElementoTexto("Lista de Usu�rios"); automacaobatista.Clicar();		
	   
	}
	
	@Entao("Passar pelas paginas")
	public void Passar_pelas_paginas() throws Throwable 
	{
		
		automacaobatista.verificaElementoTexto("Pr�ximo"); automacaobatista.Clicar();
		automacaobatista.verificaElementoTexto("Pr�ximo"); automacaobatista.Clicar();
		automacaobatista.verificaElementoTexto("Pr�ximo"); automacaobatista.Clicar();		
	
		automacaobatista.fecharPagina();		
	}
	

	
}
