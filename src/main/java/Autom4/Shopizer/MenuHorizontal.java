package Autom4.Shopizer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MenuHorizontal {
	
	@FindBy (xpath="//div[contains(@class,'mainmenu-area')]//a[text()='Tables']")
	WebElement optionTables ;
	
	@FindBy (xpath="//div[contains(@class,'mainmenu-area')]//a[text()='Bedroom']")
	WebElement bedroomButton ;

}
