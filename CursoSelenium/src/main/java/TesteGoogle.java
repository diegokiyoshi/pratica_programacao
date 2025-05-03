import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteGoogle {
	
	@Test
	public void teste() {
		System.setProperty("webdriver.chrome.driver", "/Users/dego_/CURSOS_UDEMY/AutomacaoTestes/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com.br");
		driver.manage().window().setSize(new Dimension(1200, 765));
		String tituloPagina = driver.getTitle();
		Assert.assertEquals("Google", tituloPagina);
		
		
		driver.quit();
		
	}
}
