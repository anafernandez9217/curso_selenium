package curso_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class localizadores_tradicionales {

	public static void main(String[] args) {
		// Validando edge
		System.setProperty("webdriver.edge.driver","C:/Users/Hana/Downloads/RutaSelenium/msedgedriver.exe");
		WebDriver driver_edge = new EdgeDriver();
		// Metodo basico 1, get = nos abre la pagina requerida
		driver_edge.get("https://www.google.com");
		// Encontrando elemento por id 
		driver_edge.findElement(By.id("APjFqb"));
		// Encontrar elemento por classname
		driver_edge.findElement(By.className("gNO89b"));
		// Encontrar elemento por name
		driver_edge.findElement(By.name("btnI"));
		// Encontrar elemento por link text
		driver_edge.findElement(By.linkText("Sobre Google"));
		// Encontrar elemento por link text parcial
		driver_edge.findElement(By.partialLinkText("Sobre"));
		// Encontrar elemento por xpath
		driver_edge.findElement(By.xpath("/html/body/div[1]/div[6]/div[2]/div[2]/a[1]"));
		
		
		// Metodo basico 5, .quit() = termina la sesion del driver
		driver_edge.quit();
		

	}

}
