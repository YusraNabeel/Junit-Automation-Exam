package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class RemoveCheckbox {
	
	WebDriver driver;
	
	public RemoveCheckbox (WebDriver driver) {
		this.driver = driver;
	}

	@FindBy(how = How.XPATH, using = "//input[@name='todo[0]']")
	WebElement checkbox;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement remove_checkbox;
	
	public void ClickCheckbox () {
		checkbox.click();
	}
	public void remove_Checkbox() {
		remove_checkbox.click();
	}
}
