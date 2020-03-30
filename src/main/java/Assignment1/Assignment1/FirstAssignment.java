package Assignment1.Assignment1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FirstAssignment {

	WebDriver driver;
	Integer FlipkartPrice;
	Integer PaytmmallPrice;
	
	@BeforeMethod
	public void setUp() {
		driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);

	}
	@Test(priority=1)
	public void verifyFlipkartPrice() throws Exception {
		driver.get("https://www.flipkart.com");
		driver.findElement(By.xpath("//button[@class='_2AkmmA _29YdH8']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search for products, brands and more']")).sendKeys("iPhone XR (64GB) - Yellow");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/button[1]/*")).click();
		driver.findElement(By.xpath("//div[@class='_3wU53n']")).click();

		String text= driver.findElement(By.xpath("//div[@class='_1vC4OE _2rQ-NK']")).getAttribute("innerHTML");
		
		String i=text.trim().substring(1,text.length());
		FlipkartPrice = Integer.parseInt(i.replaceAll("[^a-zA-Z0-9_-]", ""));
		
		System.out.println("Price in Flipkart.com >>> "+FlipkartPrice+"/-");
	}
	@Test(priority=2)
	public void verifyPaytmMallPrice() {
		driver.get("https://paytmmall.com/apple-iphone-xr-64gb-yellow-CMPLXMOBAPPLE-IPHONEDUMM141A67DE415-pdp");
		String text= driver.findElement(By.xpath("//span[@class='_1V3w']")).getText();

		PaytmmallPrice = Integer.parseInt(text.replaceAll("[^a-zA-Z0-9_-]", ""));
		System.out.println("Price in Paytmmall.com >>> "+PaytmmallPrice+"/-");

	}
	@Test(priority=3)
	public void PriceComparision() {
		if(FlipkartPrice > PaytmmallPrice) {
			System.out.println("Paytmmall has a lesser price : "+PaytmmallPrice+"/-");
		}
		else if(PaytmmallPrice > FlipkartPrice) {
			System.out.println("Flipkart has a lesser price : "+FlipkartPrice+"/-");
		}
		else if (FlipkartPrice.equals(PaytmmallPrice)){
			System.out.println("Both Websites have same price");
		}

	}


	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
