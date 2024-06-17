package curso_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Validando_drivers_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Validando chrome driver
		System.setProperty("webdriver.chrome.driver","C:/Users/Hana/Downloads/RutaSelenium/chromedriver.exe");
		WebDriver driver_chrome = new ChromeDriver();
		driver_chrome.get("https://www.google.com");
		
		// Validando gecko.driver
		System.setProperty("webdriver.gecko.driver","C:/Users/Hana/Downloads/RutaSelenium/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");

		// Validando edge
		System.setProperty("webdriver.edge.driver","C:/Users/Hana/Downloads/RutaSelenium/msedgedriver.exe");
		WebDriver driver_edge = new EdgeDriver();
		driver_edge.get("https://www.google.com");
	}

}
