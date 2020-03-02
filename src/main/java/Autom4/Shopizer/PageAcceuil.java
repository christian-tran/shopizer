package Autom4.Shopizer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageAcceuil extends MenuHorizontal {
	
	@FindBy (xpath="//*[@data-id='150']")
	WebElement thaiFlatCussion;

	@FindBy (xpath="//*[@data-id='50']")
	WebElement compactNightTable;
	
	@FindBy (xpath="//*[@data-id='100']")
	WebElement productWithOptions;
	
	@FindBy (xpath="//*[@data-id='154']")
	WebElement edgeConsole;
	
	@FindBy (xpath="//*[@data-id='153']")
	WebElement tableDecorationStorage;

	@FindBy (xpath="//*[@data-id='151']")
	WebElement asianRosewoodConsole;
	
	@FindBy (xpath="//*[@data-id='152']")
	WebElement antiqueRecycledWoodStorage;
	
	@FindBy (xpath="//*[@data-id='400']")
	WebElement coffeeTableAccacia;
	
	@FindBy (xpath="//div[@class='slider-area']//img")
	WebElement imglink;
}
