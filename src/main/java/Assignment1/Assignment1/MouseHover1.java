package Assignment1.Assignment1;

 
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
public class MouseHover1 {
 
 public static WebDriver driver;
 
 @SuppressWarnings("deprecation")
public static void main(String[] args) {
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("http://www.spicejet.com/");
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


//Main Menu

new Actions(driver).moveToElement(new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@id='ctl00_HyperLinkLogin']")))).build().perform();
new Actions(driver).moveToElement(new WebDriverWait(driver, 5).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'SpiceClub Members')]")))).build().perform();
new WebDriverWait(driver, 7).until(ExpectedConditions.elementToBeClickable(By.xpath("//li[@class='hide-mobile']//ul//li//a[contains(text(),'Member Login')]"))).click();


 }
 
 }
 

