package steps;



import cucumber.api.java.es.Dado;
import cucumber.api.java.it.Quando;
import cucumber.api.java.pt.Entao;
import pages.Pagina_CriarUsuarios;

public class Def_TestPagina_Formulario2 {
	
	Pagina_CriarUsuarios automacaobatista= new Pagina_CriarUsuarios();
	
	@Dado("^Ao iniciar o processo de Preencher varios forumularios$")
	public void ao_iniciar_o_processo_de_Preencher_varios_forumularios() throws Throwable 
	{
	  
		automacaobatista.CarregaPagina();
		automacaobatista.verificaElementoTexto("Começar Automação Web");
		automacaobatista.Clicar("step 1","@Dado:","Ao iniciar o processo de Preencher varios forumularios");
		
		automacaobatista.verificaElementoTexto("Formulário"); 
		automacaobatista.Clicar("step 2","@Dado:","Ao iniciar o processo de Preencher varios forumularios");
	}
		
	@Quando("^Ir na opcao novo usuario$")
	public void ir_na_opcao_novo_usuario() throws Throwable 
	{	
		automacaobatista.verificaElementoTexto("Criar Usuários"); 
		automacaobatista.Clicar("step 3","@Quando:","Ir na opcao novo usuario");				
	}
			
	@Entao("^Completar os campos: \"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\",\"([^\"]*)\"$")
	public void completar_os_campos(String name, String lastname, String email, String endereco, String universidade, String profissao, String genero, String idade) throws Throwable
	{		
		            automacaobatista.preencheCampoAutomatico("user_name",name);
					automacaobatista.preencheCampoAutomatico("user_lastname",lastname);
					automacaobatista.preencheCampoAutomatico("user_email",email);
					automacaobatista.preencheCampoAutomatico("user_address",endereco);
					automacaobatista.preencheCampoAutomatico("user_university",universidade);
					automacaobatista.preencheCampoAutomatico("user_profile",profissao);
					automacaobatista.preencheCampoAutomatico("user_gender",genero);
					automacaobatista.preencheCampoAutomatico("user_age",idade);
					
					automacaobatista.verificaElementoBotao("commit");automacaobatista.Clicar("step 4","@Entao:","Completar os campos");
					automacaobatista.fecharPagina();	
												
     }	
			
							
}
	


