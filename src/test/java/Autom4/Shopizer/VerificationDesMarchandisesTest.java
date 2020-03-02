package Autom4.Shopizer;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VerificationDesMarchandisesTest {
	
	
	WebDriver driver =  new ChromeDriver();
	String url= "http://192.168.102.67:8080/shopizer";

	@Before
	public void setup() {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	@Test
	public void testPanierShopizer() {
		
		PageAcceuil pageAccueil = PageFactory.initElements(driver, PageAcceuil.class);
	
	// 1 Ouvrir un navigateur et accéder à l'application Shopizer:
		assertEquals("https://s3.ca-central-1.amazonaws.com/shopizer-lightsail/files/DEFAULT/banner.jpg",pageAccueil.imglink.getAttribute("src"));
		System.out.println("Le navigateur s'ouvre et l'image en fond apparaît");
		
	// 2 Verifier la présence des éléments suivant :
		
		// Compact Night Table :

		assertTrue(pageAccueil.compactNightTable.isDisplayed());
		System.out.println("L'élément 'Compact Night Table' est présent");
		
		// Thai Flat Cussion
		assertTrue(pageAccueil.thaiFlatCussion.isDisplayed());
		System.out.println("L'élément 'Thai Flat Cussion' est présent");
	
		// Product With Options
		assertTrue(pageAccueil.productWithOptions.isDisplayed());
		System.out.println("L'élément 'Product With Options' est présent");
	
		// Asian Rosewood Console
		assertTrue(pageAccueil.asianRosewoodConsole.isDisplayed());
		System.out.println("L'élément 'Asian Rosewood Console' est présent");
	
		// Antique Recycled Wood Storage
		assertTrue(pageAccueil.antiqueRecycledWoodStorage.isDisplayed());
		System.out.println("L'élément 'Antique Recycled Wood Storage' est présent");
	
		// Table Decoration Storage
		assertTrue(pageAccueil.tableDecorationStorage.isDisplayed());
		System.out.println("L'élément 'Table Decoration Storage' est présent");
	
		// Edge Console
		assertTrue(pageAccueil.edgeConsole.isDisplayed());
		System.out.println("L'élément 'Edge Console' est présent");
	
		// CoffeTable Accacia
		assertTrue(pageAccueil.coffeeTableAccacia.isDisplayed());
		System.out.println("L'élément 'CoffeTable Accacia' est présent");

		
	// 3 Verifier le prix actuel de tous les éléments :
		
		// Compact Night Table :
		assertEquals("US$129.99",pageAccueil.compactNightTablePrice.getText());
		System.out.println("Le prix actuel de l'élément 'Compact Night Table' est bien : "+pageAccueil.compactNightTablePrice.getText());
				
		// Thai Flat Cussion
		assertEquals("US$59.99",pageAccueil.thaiFlatCussionPrice.getText());
		System.out.println("Le prix actuel de l'élément 'Thai Flat Cussion' est bien : "+pageAccueil.thaiFlatCussionPrice.getText());
			
		// Product With Options
		assertEquals("US$99.99",pageAccueil.productWithOptionsPrice.getText());
		System.out.println("Le prix actuel de l'élément 'Product With Options' est bien :"+pageAccueil.productWithOptionsPrice.getText());
			
		// Asian Rosewood Console
		assertEquals("US$499.99",pageAccueil.asianRosewoodConsolePrice.getText());
		System.out.println("Le prix actuel de l'élément 'Asian Rosewood Console' est bien : "+pageAccueil.asianRosewoodConsolePrice.getText());
			
		// Antique Recycled Wood Storage
		assertEquals("US$1,199.99",pageAccueil.antiqueRecycledWoodStoragePrice.getText());
		System.out.println("Le prix actuel de l'élément 'Antique Recycled Wood Storage' est bien : "+pageAccueil.antiqueRecycledWoodStoragePrice.getText());
			
		// Table Decoration Storage
		assertEquals("US$64.99",pageAccueil.tableDecorationStoragePrice.getText());
		System.out.println("Le prix actuel de l'élément 'Table Decoration Storage' est bien : "+pageAccueil.tableDecorationStoragePrice.getText());
		
		// Edge Console
		assertEquals("US$749.99",pageAccueil.edgeConsolePrice.getText());
		System.out.println("Le prix actuel de l'élément 'Edge Console' est bien : "+pageAccueil.edgeConsolePrice.getText());
			
		// CoffeTable Accacia
		assertEquals("US$399.99",pageAccueil.coffeeTableAccaciaPrice.getText());
		System.out.println("Le prix actuel de l'élément 'CoffeTable Accacia' est bien : "+pageAccueil.coffeeTableAccaciaPrice.getText());

	}
	
}
