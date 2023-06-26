package page;

import java.time.Duration;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

static WebDriver driver;

public void selectFromDropdown(WebElement element, String visibleText) {
Select sel = new Select (element);
sel.selectByVisibleText (visibleText);
}
public void waitForElement (WebDriver driver, Duration timeInSeconds, By locator) {
WebDriverWait wait = new WebDriverWait(driver,timeInSeconds);
wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
}

public int generateRandomNum (int bounderyNum) {
Random rnd = new Random();
int generatedNum = rnd.nextInt (bounderyNum);
return bounderyNum;
}

}