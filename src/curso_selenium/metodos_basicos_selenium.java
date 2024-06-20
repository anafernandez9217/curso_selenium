package curso_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class metodos_basicos_selenium {
	
	public static void main(String[] args) {
		// Validando chrome driver
		System.setProperty("webdriver.chrome.driver","C:/Users/Hana/Downloads/RutaSelenium/chromedriver.exe");
		WebDriver driver_chrome = new ChromeDriver();
		// Metodo basico 1, get = nos abre la pagina requerida
		driver_chrome.get("https://www.google.com");
		// Metodo basico 2, getTitle() =  nos trae el titulo de la pagina actual
		System.out.println(driver_chrome.getTitle());
		// Metodo basico 3, getCurrentUrl() muestra la direccion actual de la pagina
		System.out.println(driver_chrome.getCurrentUrl());
		// Metodo basico 4, .close() = cierra el navegador
		driver_chrome.close();
		// Metodo basico 5, .quit() = termina la sesion del driver
		driver_chrome.quit();
				
	}

}
