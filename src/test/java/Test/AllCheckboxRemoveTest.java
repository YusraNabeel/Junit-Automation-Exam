package Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.AllCheckboxRemove;
import Util.BrowserFactory;

public class AllCheckboxRemoveTest {

	WebDriver driver;

	@Test
	public void allChechboxesShouldBeDeleted() {
		driver = BrowserFactory.init();
		AllCheckboxRemove checkboxesRemoved = PageFactory.initElements(driver, AllCheckboxRemove.class);
		checkboxesRemoved.checkBox();
		checkboxesRemoved.remove_Checkbox();
	}
}
