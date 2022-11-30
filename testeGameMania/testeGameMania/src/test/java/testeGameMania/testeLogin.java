package testeGameMania;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class testeLogin {
	
private WebDriver driver;
	
	
	
	@Before
	public void ConfigurarTeste() {
		System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
	}
	
	
	
	@Test
	public void Testelogin() {
		
		try {
			driver.get("http://localhost:4200/");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/app-root/app-header/body/header/div/nav/ul/li[2]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("email")).sendKeys("lribeirol@email.com");
			Thread.sleep(3000);
			driver.findElement(By.id("senha")).sendKeys("senhalucas");
			Thread.sleep(3000);
			driver.findElement(By.className("botao-enviar")).click();
			Thread.sleep(4000);
			//------------------limpar-----------------
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("senha")).clear();
			//------------------teste2-----------------
			driver.findElement(By.xpath("/html/body/app-root/app-header/body/header/div/nav/ul/li[2]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("email")).sendKeys("lribeirolacerda@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.id("senha")).sendKeys("senhaerro");
			Thread.sleep(3000);
			driver.findElement(By.className("botao-enviar")).click();
			Thread.sleep(4000);
			//------------------limpar-----------------
			driver.findElement(By.id("email")).clear();
			driver.findElement(By.id("senha")).clear();
			//-----------------teste3------------------
			driver.findElement(By.xpath("/html/body/app-root/app-header/body/header/div/nav/ul/li[2]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("email")).sendKeys("lribeirolacerda@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.id("senha")).sendKeys("senhalucas");
			Thread.sleep(3000);
			driver.findElement(By.className("botao-enviar")).click();
			Thread.sleep(4000);
			
			//pagina Contato
			driver.findElement(By.xpath("/html/body/app-root/app-header/body/header/div/nav/ul/li[3]/a")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("nomesobrenome")).sendKeys("Lucas Ribeiro de Lacerda");
			Thread.sleep(3000);
			driver.findElement(By.id("email")).sendKeys("lribeirolacerda@gmail.com");
			Thread.sleep(3000);
			driver.findElement(By.id("telefone")).sendKeys("11255482256");
			Thread.sleep(3000);
			driver.findElement(By.id("mensagem")).sendKeys("fdhskjhfkjshfj jhsdfhkjhf dhfkhsdkjfh");
			Thread.sleep(3000);
			driver.findElement(By.id("radio-telefone")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/app-root/app-contato/body/main/form/div[2]/select/option[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.className("enviar")).click();
			Thread.sleep(4000);
			
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
	@After
	public void FinalLogin() {
		driver.quit();
	}
	
	
	
}


