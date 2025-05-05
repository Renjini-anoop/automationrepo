package browserinstantiation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CheckBoxSample extends Base{

	public void checkboxSam()
	{
		driver.navigate().to("https://selenium.qabible.in/check-box-demo.php");
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='gridCheck']"));
		checkbox.click();
	}
	public void radioButtonSam()
	{
		driver.navigate().to("https://selenium.qabible.in/radio-button-demo.php");
		WebElement radioButton = driver.findElement(By.xpath("//input[@id='inlineRadio1']"));
		radioButton.click();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CheckBoxSample checkBoxSample = new CheckBoxSample();
		checkBoxSample.initializeBrowser();
		checkBoxSample.checkboxSam();
		checkBoxSample.radioButtonSam();
		

	}

}
