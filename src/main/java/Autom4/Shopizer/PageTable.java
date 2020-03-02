package Autom4.Shopizer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageTable {
	
	@FindBy (xpath="//ol//a[text()='Tables']")
	WebElement breadcrumbTable;
	
	@FindBy (xpath="//h3[text()='Collection']")
	WebElement collectionH3;
	
	@FindBy (xpath="//div[@id='productsContainer']//div[@item-name='Natural root console']")
	WebElement itemNaturalRootConsole;
	
	@FindBy (xpath="//div[@id='productsContainer']//div[@item-name='Natural root console']//span")
	WebElement itemNaturalRootConsolePrix;
	
	@FindBy (xpath="//div[@id='productsContainer']//div[@item-name='Asian rosewood console']")
	WebElement itemAsianRosewoodConsole;
	
	@FindBy (xpath="//div[@id='productsContainer']//div[@item-name='Asian rosewood console']//span")
	WebElement itemAsianRosewoodConsolePrix;
	
	@FindBy (xpath="//div[@id='productsContainer']//div[@item-name='Edge console']")
	WebElement itemEdgeConsole;
	
	@FindBy (xpath="//div[@id='productsContainer']//div[@item-name='Edge console']//span")
	WebElement itemEdgeConsolePrix;
	
	@FindBy (xpath="//div[@id='productsContainer']//div[@item-name='Coffee table Accacia']")
	WebElement itemCoffeeTableAccacia;
	
	@FindBy (xpath="//div[@id='productsContainer']//div[@item-name='Coffee table Accacia']//span")
	WebElement itemCoffeeTableAccaciaPrix;
	
	@FindBy (xpath="//a[contains(.,'DEFAULT')]")
	WebElement FilterDefault;
	
	@FindBy (xpath="//a[contains(.,'Asian Wood')]")
	WebElement FilterAsianWood;
	
	@FindBy (xpath="//a[contains(.,'Roots')]")
	WebElement FilterRoots;

}
