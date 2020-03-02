package Autom4.Shopizer;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenuHorizontal {
	
	@FindBy (xpath="//div[contains(@class,'mainmenu-area')]//a[text()='Tables']")
	WebElement optionTables ;
	
	

	@FindBy (xpath="//div[@class=\"mainmenu hidden-xs\"]/nav/ul/li/a[.=\"Bedroom\"]")
	static
	WebElement bedroomButton ;
	
	public static PageBedroom clickOnBedroomButton(WebDriver driver) {
		  bedroomButton.click();
		  return PageFactory.initElements(driver, PageBedroom.class);
	  }
}
