#language: pt

Funcionalidade: Acesso site



 @formulario2 
 Esquema do Cenario: Preencher Foruml�rio
 
 Dado     Ao iniciar o processo de Preencher varios forumularios
 Quando   Ir na opcao formularios
 Entao    Completar os campos: "<user_name>","<user_lastname>","<user_email>","<user_address>","<user_university>","<user_profile>","<user_gender>","<user_age>"
 
 Exemplos: 
      |user_name|user_lastname  | user_email            |user_address     | user_university |user_profile |user_gender|user_age|
      |Cleiton  |Lopes Braga    | clopesbraga@gmail.com |AV_Guarulhos     | Drummond        |Test engineer|masc       |38      |
      |Octaviano|Nuna Freitas   | ak47@gmail.com 				|Rua Montes Aureos| Uninove         |Analista N3  |masc       |37      |
      