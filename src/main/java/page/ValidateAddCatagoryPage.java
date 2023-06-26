package page;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.ArrayList;


public class ValidateAddCatagoryPage  {
WebDriver driver;
@FindBy(how=How.CSS, using="body > div.advance-controls > input[type=text]:nth-child(1)") WebElement INPUT_ELEMENT;
@FindBy(how=How.CSS , using="body > div.advance-controls > input[type=submit]:nth-child(2)") WebElement CLICK_ADD_ELEMENT;
@FindBy(how=How.CSS , using="#extra > select:nth-child(3)") WebElement DUE_DATE_DROPDOWN_SECTION;



/*@FindBy(how = How.CSS, using = "#todos-content > form > ul > li:nth-child(1)")
WebElement INPUT_ZIRO;
@FindBy(how = How.CSS, using = "#todos-content > form > ul > li:nth-child(2)")
WebElement INPUT_ONE;
@FindBy(how = How.CSS, using = "#todos-content > form > ul > li:nth-child(3)")
WebElement INPUT_TWO;
@FindBy(how = How.CSS, using = "#todos-content > form > ul > li:nth-child(4)")
WebElement INPUT_THREE;
@FindBy(how = How.CSS, using = "#todos-content > form > ul > li:nth-child(5)")
WebElement INPUT_FOUR;*/

public void ListName(String name) {
this.driver=driver;
	String existingNames[] = { "24wqr", "13222221", "24332d", "3dsaaf", "434q" };
	for (int i = 0; i < existingNames.length; i++) {
		for (int j = 1; j < existingNames.length; j++) {
			if (existingNames[i].equals(existingNames[j])) {
				System.out.println("duplicated entry");

			}
		}
	}
}


public void UserShouldBeAbelToPutInInput(String mike) {
	
	INPUT_ELEMENT.sendKeys(mike);
}
public void validation( String mike) {
	
	Assert.assertEquals(mike , INPUT_ELEMENT, "not found");}
public void UserShouldBeAbelToClickAddButton() {
	
	CLICK_ADD_ELEMENT.click();
	 System.out.println("add input desplayed:  " + CLICK_ADD_ELEMENT.isDisplayed());

}
public void UserShouldBeAbelToSeeDropDownOfMonthes() {
	DUE_DATE_DROPDOWN_SECTION.click();

	Select select = new Select(DUE_DATE_DROPDOWN_SECTION);
	List<WebElement> options = select.getOptions();
	ArrayList<String> monthes = new ArrayList<String>();
	
	for(WebElement we : options)
	    monthes.add(we.getText());
	System.out.println("list of months: " + monthes);
	
}
}
	


