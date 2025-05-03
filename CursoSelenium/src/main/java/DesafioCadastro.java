import java.util.List;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DesafioCadastro {
	
	private WebDriver driver;
	private DSL dsl;
	
	@Before
	public void inicializar() {
		System.setProperty("webdriver.chrome.driver", "/Users/dego_/CURSOS_UDEMY/AutomacaoTestes/chromedriver.exe");
		driver = new ChromeDriver();
		dsl = new DSL(driver);
		driver.get("File://" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		driver.manage().window().setSize(new Dimension(1200, 765));
	}
	
	@After
	public void finalizar() {
		driver.quit();
	}

	@Test
	public void preencherNome() {

		dsl.escrever("elementosForm:nome", "Diego");
		Assert.assertEquals("Diego", dsl.obterMensagem("elementosForm:nome"));
		// driver.quit();

		dsl.escrever("elementosForm:sobrenome", "Yoshino");
		Assert.assertEquals("Yoshino", dsl.obterMensagem("elementosForm:sobrenome"));
		// driver.quit();

		dsl.clicar("elementosForm:sexo:0");
		Assert.assertTrue(dsl.estaSelecionado("elementosForm:sexo:0"));
		// driver.quit();

		dsl.clicar("elementosForm:comidaFavorita:0");
		Assert.assertTrue(dsl.estaSelecionado("elementosForm:comidaFavorita:0"));
		// driver.quit();

		dsl.selecionarCombo("elementosForm:escolaridade", "superior");
		Assert.assertEquals("Superior", dsl.obterTextoCombo("elementosForm:escolaridade"));

		// driver.quit();

		dsl.selecionarCombo("elementosForm:esportes", "futebol");
		dsl.selecionarCombo("elementosForm:esportes", "natacao");
		dsl.selecionarCombo("elementosForm:esportes", "Corrida");
		WebElement opcaoEsporte = driver.findElement(By.id("elementosForm:esportes"));
/*		Select selectEsporte = new Select(opcaoEsporte);
		selectEsporte.selectByVisibleText("Futebol");
		Assert.assertEquals("Futebol", selectEsporte.getFirstSelectedOption().getText());
		selectEsporte.selectByValue("natacao");
		Assert.assertEquals("Natacao", selectEsporte.getFirstSelectedOption().getText());
		selectEsporte.selectByVisibleText("Corrida");*/
		// Assert.assertEquals("Corrida", select.getFirstSelectedOption().getText());

		Select selectEsporte = new Select(opcaoEsporte);
		List<WebElement> opcoesSelecionadas = selectEsporte.getAllSelectedOptions();
		Boolean existeOpcao = false;
		for (WebElement webElement : opcoesSelecionadas) {
			if (webElement.getText().equals("Corrida")) {
				existeOpcao = true;
				break;
			}
		}
		Assert.assertTrue(existeOpcao);

		dsl.clicar("elementosForm:cadastrar");
		Assert.assertTrue(dsl.obterTexto("resultado").startsWith("Cadastrado!"));
		Assert.assertTrue(dsl.obterTexto("descNome").endsWith("Diego"));
		Assert.assertEquals("Sobrenome: Yoshino", dsl.obterTexto("descSobrenome"));
		Assert.assertEquals("Sexo: Masculino", dsl.obterTexto("descSexo"));
		Assert.assertEquals("Comida: Carne", dsl.obterTexto("descComida"));
		Assert.assertEquals("Escolaridade: superior", dsl.obterTexto("descEscolaridade"));
		Assert.assertEquals("Esportes: Natacao Futebol Corrida", dsl.obterTexto("descEsportes"));

	/*	String span = driver.findElement(By.id("resultado")).getText();
		Assert.assertEquals("Cadastrado!\n"
				+ "Nome: Diego\n"
				+ "Sobrenome: Yoshino\n"
				+ "Sexo: Masculino\n"
				+ "Comida: Carne\n"
				+ "Escolaridade: superior\n"
				+ "Esportes: Natacao Futebol Corrida\n"
				+ "Sugestoes:", span);
		driver.quit();*/
	}
}
