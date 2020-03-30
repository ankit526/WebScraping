package Assignment1.Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A {

	public static void main(String[] args) {
		ChromeDriver driver =  new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//String url ="https://www.goair.in/?gref=AFSEDIG4&utm_source=Affiliates&utm_medium=CPM&utm_campaign=GoAir_SenseDigital";
		driver.get("http://tutorialsninja.com/demo/");
	//	driver.findElement(By.xpath("//input[@type='text' and @class='_2zrpKA _1dBPDZ']")).sendKeys("saisharan387@gmail.com");
		//driver.findElement(By.xpath("//input[@class='_2zrpKA _3v41xv _1dBPDZ']")).sendKeys("mani1996");
		//driver.findElement(By.xpath("//button[@class='_2AkmmA _1LctnI _7UHT_c']")).click();
		
new Actions(driver).moveToElement(new WebDriverWait(driver,10).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Desktops')]")))).build().perform();
new WebDriverWait(driver,30).until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Mac (1)')]"))).click();
	}
}
