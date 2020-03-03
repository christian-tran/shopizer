package Autom4.Shopizer;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ObjetTableTest {

Logger logger = Logger.getLogger("ObjetTableTest");	
WebDriver driver;
String url= "http://192.168.102.67:8080/shopizer";
private String BROWSER = "firefox";//System.getProperty("navigateur");
	
	@Before
	public void setup() {
		driver = OutilTechnique.choisirNavigateur(BROWSER);
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown()
	{
		driver.quit();
	}
	
	@Test
	public void TableTest() throws InterruptedException
	{
		WebDriverWait wait=new WebDriverWait(driver, 5);
		
		PageAcceuil page_accueil = PageFactory.initElements(driver, PageAcceuil.class);
		wait.until(ExpectedConditions.visibilityOf(page_accueil.optionTables));
		// Test 1
		assertEquals("https://s3.ca-central-1.amazonaws.com/shopizer-lightsail/files/DEFAULT/banner.jpg",page_accueil.imglink.getAttribute("src"));
		logger.info("Le site s'est bien affiché");
		
		page_accueil.optionTables.click();
		PageTable page_table = PageFactory.initElements(driver, PageTable.class);
		wait.until(ExpectedConditions.visibilityOf(page_table.collectionH3));
		// Test 2
		assertTrue(page_table.breadcrumbTable.isDisplayed());
		logger.info("L'arborescence est bien affichée");
		
		// Test 3
		assertTrue(page_table.itemNaturalRootConsole.isDisplayed());
		assertEquals("Le prix de la table Natural Root Console est erroné","US$1,499.99",page_table.itemNaturalRootConsolePrix.getText());
		assertTrue(page_table.itemAsianRosewoodConsole.isDisplayed());
		assertEquals("Le prix de la table Asian Rosewood Console est erroné","US$499.99",page_table.itemAsianRosewoodConsolePrix.getText());
		assertTrue(page_table.itemEdgeConsole.isDisplayed());
		assertEquals("Le prix de la table Edge Console est erroné","US$749.99",page_table.itemEdgeConsolePrix.getText());
		assertTrue(page_table.itemCoffeeTableAccacia.isDisplayed());
		assertEquals("Le prix de la table Coffee Table Accacia est erroné","US$399.99",page_table.itemCoffeeTableAccaciaPrix.getText());
		logger.info("Tous les objets sont affichés sur la page et ont le bon prix");
		
		// Test 4
		Thread.sleep(1000);
		page_table.FilterDefault.click();
		assertTrue(driver.findElements(By.xpath("//div[@id='productsContainer']//div[@item-name='Natural root console']")).size()<1);
		assertTrue(page_table.itemAsianRosewoodConsole.isDisplayed());
		assertTrue(page_table.itemEdgeConsole.isDisplayed());
		assertTrue(driver.findElements(By.xpath("//div[@id='productsContainer']//div[@item-name='Coffee table Accacia']")).size()<1);
		logger.info("Le filtre Default a bien fonctionné");
		
		// Test 5
		page_table.FilterAsianWood.click();
		assertTrue(driver.findElements(By.xpath("//div[@id='productsContainer']//div[@item-name='Natural root console']")).size()<1);
		assertTrue(driver.findElements(By.xpath("//div[@id='productsContainer']//div[@item-name='Asian rosewood console']")).size()<1);
		assertTrue(driver.findElements(By.xpath("//div[@id='productsContainer']//div[@item-name='Edge console']")).size()<1);
		assertTrue(page_table.itemCoffeeTableAccacia.isDisplayed());
		logger.info("Le filtre Asian Wood a bien fonctionné");
		
		// Test 6
		page_table.FilterRoots.click();
		assertTrue(page_table.itemNaturalRootConsole.isDisplayed());
		assertTrue(driver.findElements(By.xpath("//div[@id='productsContainer']//div[@item-name='Asian rosewood console']")).size()<1);
		assertTrue(driver.findElements(By.xpath("//div[@id='productsContainer']//div[@item-name='Edge console']")).size()<1);
		assertTrue(driver.findElements(By.xpath("//div[@id='productsContainer']//div[@item-name='Coffee table Accacia']")).size()<1);
		logger.info("Le filtre Root a bien fonctionné");
	}

}
