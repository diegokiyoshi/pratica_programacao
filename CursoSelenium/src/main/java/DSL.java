import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DSL {

	private WebDriver driver = new ChromeDriver();
	
	
	public DSL(WebDriver driver) {
		this.driver = driver;
	}
	public void escrever(String idCampo, String mensagem) {
		driver.findElement(By.id(idCampo)).sendKeys(mensagem);
	}
	public String obterMensagem(String idCampo) {
		return driver.findElement(By.id(idCampo)).getAttribute("value");	
	}
	public void clicar(String idCampo) {
		driver.findElement(By.id(idCampo)).click();
	}
	public Boolean estaSelecionado(String idCampo) {
		return driver.findElement(By.id(idCampo)).isSelected();
	}
	public void selecionarCombo(String idCombo, String valorCampo) {
		WebElement elemento = driver.findElement(By.id(idCombo));
		Select combo = new Select(elemento);
		combo.selectByValue(valorCampo);
	}
	public String obterTextoCombo(String idCombo) {
		WebElement elemento = driver.findElement(By.id(idCombo));
		Select combo = new Select(elemento);
		return combo.getFirstSelectedOption().getText();
	}
	public Boolean existeOpcaoCombo(String idCombo, String opcaoCombo) {
		WebElement elemento = driver.findElement(By.id(idCombo));
		Select combo = new Select(elemento);
		List<WebElement> opcoes = (List<WebElement>) combo.getOptions();
		Boolean existeOpcao = false;
		for (WebElement valoresCombo : opcoes) {
			if(valoresCombo.getText().equals(opcaoCombo)) {
				existeOpcao = true;
				break;
			}
		}
		return existeOpcao;
	}
	

	public List<String> obterOpcoesSelecionadas (String idCombo){
		WebElement element = driver.findElement(By.id(idCombo));
		Select select = new Select(element);
		List<WebElement> opcoesSelecionadas = select.getAllSelectedOptions();
		List<String> valores = new ArrayList<String>();
		
		for (WebElement opcao : opcoesSelecionadas) {
			valores.add(opcao.getText());
			
		}
		return valores;
	}
	public void clicarLink(String linkText) {
		driver.findElement(By.linkText(linkText)).click();
	}
	public String obterTexto(String idTexto) {
		return driver.findElement(By.id(idTexto)).getText();
	}
	public String obterTexto(By by) {
		return driver.findElement(by).getText();
	}
	public String obterTextoAlert() {
		return driver.switchTo().alert().getText();
	}

}
