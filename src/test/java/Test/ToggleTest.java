package Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.ToggleAll;
import Util.BrowserFactory;



public class ToggleTest {

	WebDriver driver;

	@Test
	public void ToggleAllShouldBeChecked() {
		driver = BrowserFactory.init();

		ToggleAll toggle_all = PageFactory.initElements(driver, ToggleAll.class);
		toggle_all.checkBox();

	}
}