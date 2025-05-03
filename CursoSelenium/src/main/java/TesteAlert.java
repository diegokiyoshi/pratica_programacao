import static org.junit.Assert.assertEquals;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class TesteAlert {

	@Test
	public void testarAlertSimples() {
		System.setProperty("webdriver.chrome.driver", "/Users/dego_/CURSOS_UDEMY/AutomacaoTestes/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("File://" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.manage().window().setSize(new Dimension(1200, 765));
		
		driver.findElement(By.id("alert")).click();
		Alert alert = driver.switchTo().alert();
		String textAlert = alert.getText();
		Assert.assertEquals("Alert Simples", textAlert);
		alert.accept();
		driver.quit();
		
	}
	
	@Test
	public void testarAlertConfirm() {
		System.setProperty("webdriver.chrome.driver", "/Users/dego_/CURSOS_UDEMY/AutomacaoTestes/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("File://" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.manage().window().setSize(new Dimension(1200, 765));
		
		driver.findElement(By.id("confirm")).click();
		Alert alert = driver.switchTo().alert();
		String textAlert = alert.getText();
		Assert.assertEquals("Confirm Simples", textAlert);
		alert.accept();
		String textAlert2 = alert.getText();
		Assert.assertEquals("Confirmado", textAlert2);
		alert.accept();
		driver.quit();
		
	}
	
	@Test
	public void testarAlertPrompt() {
		System.setProperty("webdriver.chrome.driver", "/Users/dego_/CURSOS_UDEMY/AutomacaoTestes/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("File://" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.manage().window().setSize(new Dimension(1200, 765));
		
		driver.findElement(By.id("prompt")).click();
		Alert alert = driver.switchTo().alert();
		assertEquals("Digite um numero", alert.getText());
		
		alert.sendKeys("123");
		alert.accept();
		Assert.assertEquals("Era 123?", alert.getText());
		alert.accept();
		Assert.assertEquals(":D", alert.getText());
		alert.accept();
		
		driver.quit();
		
		
	}

}
