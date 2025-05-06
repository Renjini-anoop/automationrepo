package browserinstantiation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsHomework extends Base{
	public void findElementsWork()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		List<WebElement> message = driver.findElements(By.xpath("//input[@type='text']"));
		
		for(WebElement messages : message)
		{
			messages.sendKeys("Hello World");
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElementsHomework findElements = new FindElementsHomework();
		findElements.initializeBrowser();
		findElements.findElementsWork();

	}

}

