package Autom4.Shopizer;

import java.util.concurrent.TimeUnit;

import Autom4.Shopizer.OutilTechnique;

import Autom4.Shopizer.ENavigateur;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class ObjetTableTest {
	
WebDriver driver;
	
	@Before
	public void setup() {
		driver = OutilTechnique.choisirNavigateur(ENavigateur.chrome);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void TableTest()
	{
		driver.get("http://192.168.102.67:8080/shopizer/shop");
		driver.manage().window().maximize();
		
		
	}

}
