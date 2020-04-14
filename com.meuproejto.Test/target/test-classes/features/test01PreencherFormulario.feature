#language: pt

Funcionalidade: Acesso site


 @Cenario1 
 Cenario: Preencher um usuario no Forumlario
 Dado     Verificar   a opcao de formularios
 Quando   Clicar em novo usuario
 Entao    Preencher os campos
      
 
 @Cenario2 
 Esquema do Cenario: Preencher diversos usuarios Forumlario
 
 Dado     Ao iniciar o processo de Preencher varios forumularios
 Quando   Ir na opcao novo usuario
 Entao    Completar os campos: "<user_name>","<user_lastname>","<user_email>","<user_address>","<user_university>","<user_profile>","<user_gender>","<user_age>"
 
 Exemplos: 
      |user_name|user_lastname  | user_email            |user_address     | user_university |user_profile |user_gender|user_age|
      |Cleiton  |Lopes Braga    | clopesbraga@gmail.com |AV_Guarulhos     | Drummond        |Test engineer|masc       |38      |
      |Octaviano|Nuna Freitas   | ak47@gmail.com 				|Rua Montes Aureos| Uninove         |Analista N3  |masc       |37      |
      


 @Cenario3 
 Cenario: Listando usuarios cadastrados
 Dado     Ao acessar a tela de funcoes
 Quando   Clicar em listar usuarios
 Entao    Passar pelas paginas     
      