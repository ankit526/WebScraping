package Assignment1.Assignment1;
 
//triple navigation menu handling with mouse hover actions.

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover2 {
	public static WebDriver driver;
	 
	 @SuppressWarnings("deprecation")
	public static void main(String[] args) throws Throwable {
	ChromeDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://deluxe-menu.com/popup-mode-sample.html");
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	
	new Actions(driver).contextClick(driver.findElement(By.xpath("//p[contains(text(),'Click the image to show the menu')]"))).perform();
	new Actions(driver).moveToElement(new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@id='dm2m1i1tdT']")))).build().perform();
	new Actions(driver).moveToElement(new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//td[@id='dm2m2i1tdT']")))).build().perform();
	new WebDriverWait(driver, 7).until(ExpectedConditions.elementToBeClickable(By.xpath("//td[@id='dm2m3i1tdT']"))).click();
	Thread.sleep(10000);
	driver.quit();
}
}