package WebService;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;



public class WebService {
	
/*
	//MOSTRA MENSAGEM INFORMANDO O ACESSO AO SITE
		public void MensagemAcesso() {
			
		
		     System.out.println("Acessando https://automcaobatista");
				
		}
		

		// METODO PARA BUSCAR NO SITE A LISTA DE FILMES
		public void PesquisarLista() throws Exception {
				
					System.out.println("Listando cadastro...");
					String url = "https://swapi.co/api/films/?format=json";
					 
					URL obj = new URL(url);
					HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			 
					con.setRequestMethod("GET");
			 
					//CHAMADA PARA INCLUS�O DO HEADER
					con.setRequestProperty("User-Agent", USER_AGENT);
			 
					int responseCode = con.getResponseCode();
					
					//CAMPO ONDE A VARIAVEL RESPOSTA RECEBE AS INFORMA��ES DA TELA 
					BufferedReader in = new BufferedReader(
					        new InputStreamReader(con.getInputStream()));
					String inputLine;
					StringBuffer response = new StringBuffer();
			 
					while ((inputLine = in.readLine()) != null) {
						response.append(inputLine);
					}
					in.close();
					
					try{
						
						// JASON RECEBE A RESPOSTA 
						 JsonObject objJSON = new JsonObject();
			                
						 	
					} 
			               
			                 	                  
			                
			                     
			                
					}catch(JSONException e){
						
						e.printStackTrace();
						
					}
					
					
					
				}
	
	
*/
}
