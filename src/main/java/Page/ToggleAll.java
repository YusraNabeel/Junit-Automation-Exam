package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class ToggleAll {

	WebDriver driver;
	
	public ToggleAll (WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name='allbox']")
	WebElement Toggle_All;
	
	public void checkBox() {
		Toggle_All.click();
	}
}
