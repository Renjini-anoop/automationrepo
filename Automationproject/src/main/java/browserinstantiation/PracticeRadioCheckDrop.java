package browserinstantiation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PracticeRadioCheckDrop {
	public WebDriver driver;
	
	public void initialize() {
		driver = new ChromeDriver();
	driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
	driver.manage().window().maximize();
	
	}
	public void checkboxSam()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
List<WebElement> multipleCheckbox = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		for(WebElement multiplebox : multipleCheckbox)
		{
			multiplebox.click();
			
		}
		
		
	}
	public void radioButtonSam()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement radioButton = driver.findElement(By.xpath("//input[@value='green']"));
		radioButton.click();
	}
	public void dropDownEx()
	{
		driver.navigate().to("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		WebElement dropdown = driver.findElement(By.xpath("//select[@id='dropdowm-menu-1']"));
	Select select = new Select(dropdown);
	select.selectByIndex(3);
	WebElement dropdown2 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-2']"));
	Select select2 = new Select(dropdown2);
	select2.selectByVisibleText("Maven");
    WebElement dropdown3 = driver.findElement(By.xpath("//select[@id='dropdowm-menu-3']"));
	Select select3 = new Select(dropdown3);
	select3.selectByValue("css");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PracticeRadioCheckDrop practiceRadioCheckDrop = new PracticeRadioCheckDrop();
		practiceRadioCheckDrop.initialize();
		//practiceRadioCheckDrop.checkboxSam();
		//practiceRadioCheckDrop.radioButtonSam();
		practiceRadioCheckDrop.dropDownEx();
	}

}
