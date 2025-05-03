import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class DesafioRegrasNegocio {

	private WebDriver driver;
	private DSL dsl;
	
	@Before
	public void inicializar() {
		System.setProperty("webdriver.chrome.driver", "/Users/dego_/CURSOS_UDEMY/AutomacaoTestes/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("File://" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.manage().window().setSize(new Dimension(1200, 675));
		dsl = new DSL(driver);
	}
	
	@After
	public void finalizar() {
		driver.quit();
	}
	
	
	@Test
	public void testarRegraNegocioNome() {
		dsl.clicar("elementosForm:cadastrar");
		Assert.assertEquals("Nome eh obrigatorio", dsl.obterTextoAlert());
	}
	
	@Test
	public void testarRegraNegocioSobrenome() {
		dsl.escrever("elementosForm:nome", "Diego");
		dsl.clicar("elementosForm:cadastrar");
		Assert.assertEquals("Sobrenome eh obrigatorio", dsl.obterTextoAlert());
	}
	
	@Test
	public void testarRegraNegocioSexo() {
		dsl.escrever("elementosForm:nome", "Diego");
		dsl.escrever("elementosForm:sobrenome", "Yoshino");
		dsl.clicar("elementosForm:cadastrar");
		assertEquals("Sexo eh obrigatorio", dsl.obterTextoAlert());
	}
	
	@Test
	public void testarRegraNegocioComida() {
		dsl.escrever("elementosForm:nome", "Diego");
		dsl.escrever("elementosForm:sobrenome", "Yoshino");
		dsl.clicar("elementosForm:sexo:0");
		dsl.clicar("elementosForm:comidaFavorita:0");
		dsl.clicar("elementosForm:comidaFavorita:3");
		dsl.clicar("elementosForm:cadastrar");
		Assert.assertEquals("Tem certeza que voce eh vegetariano?", dsl.obterTextoAlert());
		
		
	}
	
	@Test
	public void testarRegraNegocioEsporte() {
	
		dsl.escrever("elementosForm:nome", "Diego");
		dsl.escrever("elementosForm:sobrenome", "Yoshino");
		dsl.clicar("elementosForm:sexo:0");
		dsl.clicar("elementosForm:comidaFavorita:0");
		dsl.clicar("elementosForm:comidaFavorita:1");
		dsl.selecionarCombo("elementosForm:esportes", "futebol");
		dsl.selecionarCombo("elementosForm:esportes", "natacao");
		dsl.selecionarCombo("elementosForm:esportes", "nada");
		dsl.clicar("elementosForm:cadastrar");
		Assert.assertEquals("Voce faz esporte ou nao?", dsl.obterTextoAlert());
	}
}
