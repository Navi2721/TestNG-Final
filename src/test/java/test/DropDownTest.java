package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import page.ValidateAddCatagoryPage;
import util.BrowserFactory;

public class DropDownTest {
	
	static WebDriver driver;
ValidateAddCatagoryPage vcp;
	@BeforeTest
	public void init() {
		
		driver = BrowserFactory.init();
	}
	
	@Test(priority=1)
	public void UserShouldBeAbelToSeeDropdownMonth() {

vcp = PageFactory.initElements(driver, ValidateAddCatagoryPage.class);

		vcp.UserShouldBeAbelToSeeDropDownOfMonthes();
	}
    @Test (priority=2)
	public void UserShouldBeAbelToPutInInPut(String name) {

		driver = BrowserFactory.init();
	vcp =PageFactory.initElements(driver,ValidateAddCatagoryPage.class);

	vcp.UserShouldBeAbelToPutInInput(name);}
    public void validateAddedCatagory(String name) {

		driver = BrowserFactory.init();
		vcp = PageFactory.initElements(driver, ValidateAddCatagoryPage.class);

	
		vcp.validation(name);
	}
		
	
		@Test (priority=3)
	public void UserShouldBeAbelToClickAddButton() {

		driver = BrowserFactory.init();
		vcp = PageFactory.initElements(driver, ValidateAddCatagoryPage.class);

	
		vcp.UserShouldBeAbelToClickAddButton();
	}

}
