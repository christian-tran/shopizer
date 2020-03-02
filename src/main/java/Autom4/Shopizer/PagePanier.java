package Autom4.Shopizer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PagePanier {

	@FindBy (xpath="//h1")
	WebElement recap;
	
	@FindBy (xpath="//strong[.='Compact night table']")
	WebElement article1;
	
	@FindBy (xpath="//strong[.='Antique recycled wood storage']")
	WebElement article2;
	
	@FindBy (xpath="(//span[@class='amount'])[2]")
	WebElement total;
	
	@FindBy (xpath="//tr[1]/td/input[@type=\"number\"]")
	WebElement quantité_article1;
	
	@FindBy (xpath="//tr[2]/td/input[@type=\"number\"]")
	WebElement quantité_article2;
	
	@FindBy (xpath="//a[.='Recalculer']")
	WebElement bouton_recalculer;
	
	public void changeQuantity() {
		quantité_article1.clear();
		quantité_article1.sendKeys("2");
		quantité_article2.clear();
		quantité_article2.sendKeys("2");
	}
	
		public void recalculer() throws InterruptedException {
		bouton_recalculer.click();
		Thread.sleep(2000);
	}

		
}
