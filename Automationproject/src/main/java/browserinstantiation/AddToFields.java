package browserinstantiation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AddToFields extends Base {
	public void navigation()
	{
		driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php");
		WebElement x = driver.findElement(By.xpath("//input[@id='value-a']"));
		x.sendKeys("67");
		WebElement y = driver.findElement(By.xpath("//input[@id='value-b']"));
		y.sendKeys("7");
		WebElement button = driver.findElement(By.xpath("//button[@id='button-two']"));
		button.click();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AddToFields addToFields = new AddToFields();
		addToFields.initializeBrowser();
		addToFields.navigation();
		

	}

}
