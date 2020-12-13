package Chou.Million_Up.Pageobject;

import static org.junit.Assert.assertTrue;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.SwitchToWindow;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.actions.Switch;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("http://thedemosite.co.uk/addauser.php")

public class Pageobject extends PageObject {
	

	
	String usuario = "//tbody/tr[1]/td[2]/p[1]/input[1]";
	String pass = "//tbody/tr[2]/td[2]/p[1]/input[1]";
	String login = "//a[contains(text(),'4. Login')]";
	String login_exitoso = "//b[contains(text(),'**Successful Login**')]";
	String login_fallido = "//b[contains(text(),'**Failed Login**')]";
	String hacer_login = "//tbody/tr[3]/td[2]/p[1]/input[1]";
	
	
	public void ingresar_usuario (String arg1) {
		find(By.xpath(usuario)).sendKeys(arg1);
		
	}
	
	public void ingresar_pass (String arg1) throws InterruptedException {
		find(By.xpath(pass)).sendKeys(arg1);
		find(By.xpath(hacer_login)).click();
	}
	
	public void seleccionar_login () {
		find(By.xpath(login)).click();
	}
	
	public void verificar_login () {
		boolean login = find(By.xpath(login_exitoso)).isVisible();
		assertTrue(login);
	}
	
	public void verificar_login_fallido () {
		boolean login = find(By.xpath(login_fallido)).isVisible();
		assertTrue(login);
	}
	
	public void verificar_alerta () throws InterruptedException {
		find(By.xpath(hacer_login)).click();
		Alert alert = getDriver().switchTo().alert();
		String alerta = alert.getText();
		System.out.println(alerta);
		boolean pass_corto = alerta.contains("Username too short.");
		assertTrue(pass_corto);
	}
	
	public void verificar_alerta_password () throws InterruptedException {
		find(By.xpath(hacer_login)).click();
		Alert alert = getDriver().switchTo().alert();
		String alerta = alert.getText();
		System.out.println(alerta);
		boolean pass_corto = alerta.contains("Password too short.");
		assertTrue(pass_corto);
	}

}
