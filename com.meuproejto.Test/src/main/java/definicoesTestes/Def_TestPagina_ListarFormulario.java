package definicoesTestes;

import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import paginas.Pagina_ListaUsuarios;

public class Def_TestPagina_ListarFormulario  {
	
	Pagina_ListaUsuarios automacaobatista= new Pagina_ListaUsuarios();
	
	
	@Dado("^Ao acessar a tela de funcoes$")
	public void ao_acessar_a_tela_de_funcoes() throws Throwable 
	{
		automacaobatista.CarregaPagina();
		automacaobatista.verificaElementoTexto("Começar Automação Web");
		automacaobatista.Clicar("step 1");
	}
		
	@Quando("^Clicar em listar usuarios$")
	public void clicar_em_listar_usuarios() throws Throwable {
		
		automacaobatista.verificaElementoTexto("Formulário"); automacaobatista.Clicar("step 2");
		automacaobatista.verificaElementoTexto("Lista de Usuários"); automacaobatista.Clicar("step 3");		
	   
	}
	
	@Entao("^Passar pelas paginas$")
	public void passar_pelas_paginas() throws Throwable 
	{
		
		automacaobatista.verificaElementoTexto("Próximo"); automacaobatista.Clicar("step 4");
		automacaobatista.verificaElementoTexto("Próximo"); automacaobatista.Clicar("step 5");
		automacaobatista.verificaElementoTexto("Próximo"); automacaobatista.Clicar("step 6");		
	
		automacaobatista.fecharPagina();		
	}
	

	
}
