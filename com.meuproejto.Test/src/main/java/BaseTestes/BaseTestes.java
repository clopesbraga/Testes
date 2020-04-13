package BaseTestes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

import Configuracao.ConfigNavegadores;
import Configuracao.ConfigRelatorios;

public class BaseTestes {
	
	ConfigNavegadores config  =  new ConfigNavegadores();
	ConfigRelatorios  config2 =  new ConfigRelatorios ();
	
	public void abreNavegador() 
	{
		//config.chromeNavegador();
		//config.edgeNavegador();
		//config.ieNavegador();
		config.firefoxNavegador();
		
	}
	
	public WebElement confereElementoTexto(String xpath) 
	{
		config.setElemento(config.getDriver().findElement(By.xpath("//a[contains(text(),'"+xpath+"')]")));
		return config.getElemento();	
	}
	
	public WebElement confereElementoBotao(String xpath) 
	{		
		config.setElemento(config.getDriver().findElement(By.name(xpath)));
		return config.getElemento();		
	}
	
	public WebElement confereElementoId(String xpath) 
	{	
		config.setElemento(config.getDriver().findElement(By.id(xpath)));
		return config.getElemento();
	}
		
	public WebElement preencheDados(String xpath,String dados ) 
	{
		config.setElemento(config.getDriver().findElement(By.id(xpath)));
		config.getElemento().sendKeys(dados);
		return config.getElemento();
	}
	
	public void acionaBotao() 
	{			
		if(config.getElemento().isEnabled()) {config.getElemento().click();}
	}
	
	public void fechaNavegador() 
	{		
		config.getDriver().quit();		
	}
	

	

}
