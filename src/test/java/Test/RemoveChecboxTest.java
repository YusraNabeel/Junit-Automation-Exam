package Test;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import Page.RemoveCheckbox;
import Util.BrowserFactory;

public class RemoveChecboxTest {
 WebDriver driver;
 
 @Test
 public void CheckedboxShouldBeDeleted () {
	 driver = BrowserFactory.init();
	 
	 RemoveCheckbox remove_Checkbox = PageFactory.initElements(driver, RemoveCheckbox.class);
	 remove_Checkbox.ClickCheckbox();
	 remove_Checkbox.remove_Checkbox();
	 
	 
 }
}
