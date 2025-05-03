
import java.util.List;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TesteCampoDeTreinamento {

	private WebDriver driver;
	private DSL dsl;
	private CampoTreinamentoPage page;

	@Before
	public void inicializar() {
		System.setProperty("webdriver.chrome.driver", "/Users/dego_/CURSOS_UDEMY/AutomacaoTestes/chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().setSize(new Dimension(1200, 765));
		driver.get("file:///" + System.getProperty("user.dir") + "/src/main/resources/componentes.html");
		dsl = new DSL(driver);
		page = new CampoTreinamentoPage();
	}

	/*@After
	public void finalizar() {
		driver.quit();
	}
*/
	@Test
	public void testeTextField() {
		page.setNome("Teste de escrita");
		Assert.assertEquals("Teste de escrita", dsl.obterMensagem("elementosForm:nome"));
		page.print();
	}

	@Test
	@Ignore
	public void testeTextArea() {
		dsl.escrever("elementosForm:sugestoes",
				"Palmeiras nao tem mundial\\n\\n Palmeiras nao tem mundial\\n\\n Não tem copinha\\n\\n Não tem mundial");
		Assert.assertEquals("Palmeiras nao tem mundial Palmeiras nao tem mundial Não tem copinha Não tem mundial",
				dsl.obterMensagem("elementosForm:sugestoes"));
	}

	@Test
	public void testeRadioButton() {
		dsl.clicar("elementosForm:sexo:0");
		Assert.assertTrue(dsl.estaSelecionado("elementosForm:sexo:0"));
	}

	@Test
	public void testeCheckBox() {
		dsl.clicar("elementosForm:comidaFavorita:0");
		Assert.assertTrue(dsl.estaSelecionado("elementosForm:comidaFavorita:0"));
	}

	@Test
	public void testeComboBox() {
		dsl.selecionarCombo("elementosForm:escolaridade", "superior");
		Assert.assertEquals("Superior", dsl.obterTextoCombo("elementosForm:escolaridade"));
	}

	@Test
	public void testeComboBoxListaOpcoes() {
		Assert.assertTrue(dsl.existeOpcaoCombo("elementosForm:escolaridade", "Superior"));
	}

	@Test
	public void testeComboMultiplaEscolha() {
		dsl.selecionarCombo("elementosForm:esportes", "futebol");
		dsl.selecionarCombo("elementosForm:esportes", "natacao");
		dsl.selecionarCombo("elementosForm:esportes", "Corrida");
		List<String> selectedOptions = dsl.obterOpcoesSelecionadas("elementosForm:esportes");
		Assert.assertEquals(3, selectedOptions.size());
	}

	@Test
	public void testeBotao() {
		dsl.clicar("buttonSimple");
		Assert.assertEquals("Obrigado!", dsl.obterMensagem("buttonSimple"));
	}

	@Test
	public void testeLink() {
		dsl.clicarLink("Voltar");
		Assert.assertEquals("Voltou!", dsl.obterTexto("resultado"));
	}

	@Test
	public void deveBuscarTextoNaPagina() {
		Assert.assertEquals("Campo de Treinamento", dsl.obterTexto(By.tagName("h3")));
	}
}
