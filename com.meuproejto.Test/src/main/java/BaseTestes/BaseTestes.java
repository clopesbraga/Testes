package BaseTestes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;

public class BaseTestes {
	
	public WebDriver driver;
	public WebElement elemento;
	
	//String chromedriver= ("user.dir")+"/Chromedriver/chromedriver.exe";
	String usardiretorio = "user.dir";
	String chromedriver=     "/browser/chromedriver.exe";
	String firefoxdriver =  "/browser/geckodriver.exe";
	String site=		   "https://automacaocombatista.herokuapp.com";
	
	
	
	
	public void abreNavegador() 
	{
		
		//System.setProperty("webdriver.chrome.driver",System.getProperty(chromedriver));
		
		//CHROME
		System.setProperty("webdriver.chrome.driver",System.getProperty(usardiretorio)+chromedriver);
		driver= new ChromeDriver();
		driver.navigate().to(site);
		
		//FIREFOX
		/*System.setProperty("webdriver.gecko.driver",System.getProperty(usardiretorio)+firefoxdriver);
		driver= new FirefoxDriver();
		driver.navigate().to(site);*/
		
	}
	
	public WebElement confereElementoTexto(String xpath) 
	{
		
		elemento = driver.findElement(By.xpath("//a[contains(text(),'"+xpath+"')]"));
		return elemento;
		
	}
	
	public WebElement confereElementoBotao(String xpath) 
	{
		
		elemento = driver.findElement(By.name(xpath));
		return elemento;
		
	}
	

	public WebElement confereElementoId(String xpath) 
	{
		elemento = driver.findElement(By.id(xpath));
		return elemento;
	}
	
	
	public WebElement preencheDados(String xpath,String dados ) 
	{
		elemento = driver.findElement(By.id(xpath));
		elemento.sendKeys(dados);
		return elemento;
	}
	
	public void acionaBotao() 
	{
		
		if(elemento.isEnabled()) {elemento.click();}		
		
	}
	
	public void fechaNavegador() 
	{
		
		driver.quit();
		
	}
	

}
