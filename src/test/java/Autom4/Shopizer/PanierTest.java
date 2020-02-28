package Autom4.Shopizer;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PanierTest {
	
	WebDriver driver =  new ChromeDriver();
	String url= "http://192.168.102.67:8080/shopizer";

	@Before
	public void setup() {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	@Test
	public void testPanierShopizer() {
	
	}
	
}
