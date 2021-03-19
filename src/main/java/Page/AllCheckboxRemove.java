package Page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AllCheckboxRemove {

	WebDriver driver;
	
	public void ToggleAllRemoveCheckboxes (WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy(how = How.XPATH, using = "//input[@name='allbox']")
	WebElement Toggle_All;
	@FindBy(how = How.XPATH, using = "//input[@value='Remove']")
	WebElement remove_checkbox;
	
	public void checkBox() {
		Toggle_All.click();
	}
	public void remove_Checkbox() {
		remove_checkbox.click();
	}
}
