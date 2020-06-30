package base;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pages.HomePage;

public class BaseTests {
	private static WebDriver driver;
	protected HomePage homePage;
	
	@BeforeAll
	public static void inicializador() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\lacer\\eclipse-workspace-iterasys\\ecommerce_prestashop\\drivers\\chrome\\83\\chromedriver.exe");
		driver = new ChromeDriver();
	}
	
	@BeforeEach
	public void carregarPaginaInicial() {
		driver.get("https://marcelodebittencourt.com/demoprestashop/");
		homePage = new HomePage(driver);
				
	}
	
	@AfterAll
	public static void finakizar() {
		driver.quit();
	}

}
