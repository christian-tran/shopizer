package Autom4.Shopizer;



import org.junit.Test;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class PanierTest {
	
	WebDriver driver;
	String url= "http://192.168.102.67:8080/shopizer";
	String BROWSER = "firefox"; //System.getProperty("navigateur");

	@Before
	public void setup() {
		driver = OutilTechnique.choisirNavigateur(BROWSER);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}
	
	@Test
	public void testPanierShopizer() throws InterruptedException {	
	WebDriverWait wait=new WebDriverWait(driver, 5);
	
	MenuHorizontal menu_horizontal = PageFactory.initElements(driver, MenuHorizontal.class);
	PageBedroom page_bedroom = menu_horizontal.clickOnBedroomButton(driver);
	assertEquals(page_bedroom.arboresence.getText(),"Page d'accueil Bedroom");
	page_bedroom.addToCart();
	assertEquals(page_bedroom.nombre_article.getText(),"Panier d'achat (2)");
	PagePanier page_panier = page_bedroom.clickOnPaiement(driver, BROWSER);
	wait.until(ExpectedConditions.visibilityOf(page_panier.recap));
	assertEquals(page_panier.recap.getText(),"Revoir votre commande");
	assertEquals(page_panier.article1.getText(),"Compact night table");
	assertEquals(page_panier.article2.getText(),"Antique recycled wood storage");
	assertEquals(page_panier.total.getText(),"US$1,329.98");
	page_panier.changeQuantity();
	assertEquals(page_panier.total.getText(),"US$1,329.98");
	page_panier.recalculer();
	assertEquals(page_panier.total.getText(),"US$2,659.96");
	
	}
}