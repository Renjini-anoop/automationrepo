package browserinstantiation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FindElementsEx extends Base{
	public void findElements()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		List<WebElement> multipleCheckbox = driver.findElements(By.xpath("//input[@class='check-box-list']"));
		
		for(WebElement multiplebox : multipleCheckbox)
		{
			multiplebox.click();
		}
	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElementsEx findElementsEx = new FindElementsEx();
		findElementsEx.initializeBrowser();
		findElementsEx.findElements();

	}

}
