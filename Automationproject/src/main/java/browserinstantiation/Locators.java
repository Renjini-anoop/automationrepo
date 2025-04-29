package browserinstantiation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators extends Base{
	
	public void idLocator()
	{
		WebElement messageField = driver.findElement(By.id("single-input-field"));
		WebElement messageTwo = driver.findElement(By.id("value-a"));
	
	}

	public void nameLocator()
	{
		WebElement nameLocator = driver.findElement(By.name("description"));
	}
	public void classLocator()
	{
		WebElement classLocator = driver.findElement(By.className("header-top"));
		WebElement classLocatorTwo = driver.findElement(By.className("list-group list-group-flush"));
	}
	
			public void linkTextLocator()
	{

				WebElement linkText = driver.findElement(By.linkText("simple-form-demo.php"));
				WebElement linkTextTwo = driver.findElement(By.linkText("radio-button-demo.php"));
	}	
			public void PartialLinkLocator()
			{
				WebElement partialLink = driver.findElement(By.partialLinkText("simple-form"));
			}	
public void cssSelector()
			{
WebElement cssSelecId = driver.findElement(By.cssSelector("input#single-input-field"));//tag#id
WebElement cssSelecClass = driver.findElement(By.cssSelector("div.my-2"));//tag.class
WebElement cssSelecAttribute = driver.findElement(By.cssSelector("input[id=single-input-field]"));//tag[attributeType = attributeValue]			
WebElement cssSelecClassAttribute = driver.findElement(By.cssSelector("input.form-control[id=single-input-field]"));//tag.class[attributeType =attributeValue]
			}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locators locators = new Locators();
		locators.initializeBrowser();
		locators.idLocator();
		

	}

}
