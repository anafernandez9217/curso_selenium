package curso_selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class localizadores_relativos {// localizadores_amigables

	public static void main(String[] args) {
		// Validando edge
		System.setProperty("webdriver.edge.driver","C:/Users/Hana/Downloads/RutaSelenium/msedgedriver.exe");
		WebDriver driver_edge = new EdgeDriver();
		// Metodo basico 1, get = nos abre la pagina requerida
		driver_edge.get("https://www.google.com");
		//driver_edge.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.className("gb_h"))).click();
		driver_edge.findElement(RelativeLocator.with(By.tagName("a")).toRightOf(By.className("gb_I"))).click();
		//driver_edge.findElement(RelativeLocator.with(By.tagName("a")).toLeftOf(By.className("gb_d")).toRightOf(By.className("gb_I"))).click();
		
		//Implicit Wait
		//driver.edge.manage()timeouts().implicitLyWait(Duration.ofSeconds(10));
		
	}

}
