package Autom4.Shopizer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageBedroom {
	

	@FindBy (xpath="//div[@id='productsContainer']//a[@productid=\"50\"]")
	WebElement nightTable;
	
	@FindBy (xpath="//div[@id='productsContainer']//a[@productid=\"152\"]")
	WebElement woodStorage;
	
	@FindBy (xpath="//div[@class=\"shop-cart\"]/a")
	static
	WebElement boutonPanier ;
	
	@FindBy (xpath="//a[.='Paiement']")
	static
	WebElement boutonPaiement ;
	
	@FindBy (id="miniCartSummary")
	WebElement nombre_article;
	
	@FindBy (xpath="//ol[@class=\"breadcrumb\"]")
	WebElement arboresence;
	
	public void addToCart() throws InterruptedException {
		Thread.sleep(1000);
		nightTable.click();
		Thread.sleep(1000);
		woodStorage.click();
		Thread.sleep(2000);
		
}
	
	public static PagePanier clickOnPaiement(WebDriver driver, String browser) throws InterruptedException {
		Actions act = new Actions(driver);
		act.moveToElement(boutonPanier).click().build().perform();
		if (browser == "chrome") {Thread.sleep(1000);}
		boutonPaiement.click();
		return PageFactory.initElements(driver, PagePanier.class);
	}
}