package Autom4.Shopizer;

import static org.junit.Assert.*;

import java.util.concurrent.TimeUnit;

import Autom4.Shopizer.OutilTechnique;

import Autom4.Shopizer.ENavigateur;

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
	
WebDriver driver;
	
	@Before
	public void setup() {
		driver = OutilTechnique.choisirNavigateur(ENavigateur.chrome);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@After
	public void tearDown()
	{
		//driver.quit();
	}
	
	@Test
	public void TableTest() throws InterruptedException
	{
		driver.get("http://192.168.102.67:8080/shopizer/shop");
		driver.manage().window().maximize();
		WebDriverWait wait=new WebDriverWait(driver, 20);
		
		PageAcceuil page_accueil = PageFactory.initElements(driver, PageAcceuil.class);
		wait.until(ExpectedConditions.visibilityOf(page_accueil.imglink));
		// Test 1
		assertTrue(page_accueil.imglink.isDisplayed());
		
		
		page_accueil.optionTables.click();
		PageTable page_table = PageFactory.initElements(driver, PageTable.class);
		wait.until(ExpectedConditions.visibilityOf(page_table.collectionH3));
		// Test 2
		assertTrue(page_table.breadcrumbTable.isDisplayed());
		
		// Test 3
		assertTrue(page_table.itemNaturalRootConsole.isDisplayed());
		assertEquals("Le prix de la table Natural Root Console est erroné","US$1,499.99",page_table.itemNaturalRootConsolePrix.getText());
		assertTrue(page_table.itemAsianRosewoodConsole.isDisplayed());
		assertEquals("Le prix de la table Asian Rosewood Console est erroné","US$499.99",page_table.itemAsianRosewoodConsolePrix.getText());
		assertTrue(page_table.itemEdgeConsole.isDisplayed());
		assertEquals("Le prix de la table Edge Console est erroné","US$749.99",page_table.itemEdgeConsolePrix.getText());
		assertTrue(page_table.itemCoffeeTableAccacia.isDisplayed());
		assertEquals("Le prix de la table Coffee Table Accacia est erroné","US$399.99",page_table.itemCoffeeTableAccaciaPrix.getText());
		Thread.sleep(5000);
		
	}

}
