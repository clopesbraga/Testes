package Servicos;

import configuracaoTestes.ConfigRelatorios;

public class GeraRelatorio {
	
	ConfigRelatorios config = new ConfigRelatorios();
	
	public void gerarDocumento(String documento)
	{	
		config.geraPDF(documento);	
	}
	
	public void incluirPagina(String cabecalho)
	{
		config.incluirPagina(cabecalho);
	}
	
	public void encerrarDocumento(String nomePagina) 
	{	
		config.criarRodape(nomePagina);
		config.encerrarPDF();	
	}

}
