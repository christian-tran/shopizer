package Autom4.Shopizer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuHorizontale {
	
	@FindBy (xpath="//div[contains(@class,'mainmenu-area')]//a[text()='Tables']")
	WebElement optionTables ;

}
