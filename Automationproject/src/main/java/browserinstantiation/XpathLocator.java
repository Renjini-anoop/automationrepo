package browserinstantiation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class XpathLocator extends Base {

	public void relativeXpath()
	{
		//tagName[@attribute ='value]
		WebElement relative = driver.findElement(By.xpath("//button[@id='button-one']"));
		WebElement relatives = driver.findElement(By.xpath("//button[@id='button-two']"));
	}
	public void contains()
	{
		//tagName[contains(@attribute,'value')]
		WebElement con = driver.findElement(By.xpath("//input[contains(@id,'single-input-field')]"));
		WebElement contain = driver.findElement(By.xpath("//input[contains(@id,'value-a')]"));
	}
	public void startsWith()
	{
		//tagName[starts-with(@attribute,'value')]
		WebElement startsW = driver.findElement(By.xpath("//input[starts-with(@id,'single-')]"));
		
	}
	
	public void text()
	{
		//tagName[text()='value']
		WebElement tex = driver.findElement(By.xpath("//button[text() = 'Show Message']"));
		}
	public void and()
	{
		//tagName[@attribute = 'value' and @attribute ='value']
		WebElement andXpath = driver.findElement(By.xpath("//input[@class='form-control' and @placeholder='Message']"));
	}
	public void or()
	{
		//tagName[@attribute = 'value' or @attribute ='value']
		WebElement orXpath = driver.findElement(By.xpath("//button[@type='button' or @id='button-one']"));
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

	}

}
