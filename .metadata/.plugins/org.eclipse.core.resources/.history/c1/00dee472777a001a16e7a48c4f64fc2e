package Configuracao;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Config {
	
	private WebDriver  driver;
	private WebElement elemento;

	
	private String usardiretorio =  "user.dir";
	private String chromedriver  =  "/browser/chromedriver.exe";
	private String firefoxdriver =  "/browser/geckodriver.exe";
	private String edgedriver    =  "/browser/msedgedriver.exe";
	private String iedriver      =  "/browser/IEDriverServer.exe";
	private String site          =  "https://automacaocombatista.herokuapp.com";
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getElemento() {
		return elemento;
	}
	
	public void setDriver(WebDriver driver) {
		this.driver = driver;
	}

	public void setElemento(WebElement elemento) {
		this.elemento = elemento;
	}

	public void chromeNavegador() 
	{	
		System.setProperty("webdriver.chrome.driver",System.getProperty(usardiretorio)+chromedriver);
		driver= new ChromeDriver();
		driver.navigate().to(site);				
	}
	
	public void firefoxNavegador() 
	{
		System.setProperty("webdriver.gecko.driver",System.getProperty(usardiretorio)+firefoxdriver);
		driver= new FirefoxDriver();
		driver.navigate().to(site);			
	}
	
	public void edgeNavegador() 
	{
		System.setProperty("webdriver.edge.driver",System.getProperty(usardiretorio)+edgedriver);
		driver= new EdgeDriver();
		driver.navigate().to(site);	
	}
	
	public void ieNavegador() 
	{
		System.setProperty("webdriver.ie.driver",System.getProperty(usardiretorio)+iedriver);
		driver= new InternetExplorerDriver();
		driver.navigate().to(site);	
	}

	
}
