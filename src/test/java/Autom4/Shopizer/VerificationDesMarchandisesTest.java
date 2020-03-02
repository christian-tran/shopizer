package Autom4.Shopizer;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerificationDesMarchandisesTest {
	
	// 1 Ouvrir un navigateur et accéder à l'application Shopizer:
	
	WebDriver driver =  new ChromeDriver();
	String url= "http://192.168.102.67:8080/shopizer";

	@Before
	public void setup() {
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);	
	}
	
	@Test
	public void testPanierShopizer() {
		
		PageAcceuil pageAccueil = new PageAcceuil();
	
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
		
		// Thai Flat Cussion

		// Product With Options

		// Asian Rosewood Console

		// Antique Recycled Wood Storage

		// Table Decoration Storage

		// Edge Console

		// CoffeTable Accacia	
		
	}

	public boolean isElementPresent(By id) {
		  try {
		    driver.findElement(id);
		    return true;
		  }
		catch (org.openqa.selenium.NoSuchElementException e) {
		    return false;
		  }
		}
	
}
