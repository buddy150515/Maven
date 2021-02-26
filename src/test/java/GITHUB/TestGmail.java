package GITHUB;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestGmail {

	public static WebDriver driver;
	@BeforeSuite
	public void setUp(){
		WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
	}
	 
	  @Test
	  public void doEhealth(){
		  driver.get("https://google.com");
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		    driver.findElement(By.name("q")).sendKeys("ehealthinsurance");
		    driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[1]/div/div[2]/input")).click();
		   // driver.findElement(By.xpath("//*[@id='tads']/div[1]/div/div/div[1]/a/div[1]")).click();
			driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[2]/div[1]/div[2]/div[2]/div[2]/center/input[1]")).click();
			driver.findElement(By.xpath("//*[@id='tads']/div[1]/div/div/div[1]/a/div[1]")).click();
			driver.findElement(By.xpath("//*[@id='census-ifp-zipcode-input']")).sendKeys("48375");
			driver.findElement(By.xpath("//*[@id='census-get-quote-btn']")).click();
			driver.findElement(By.xpath("//*[@id='census--start--business-owner--button--no']")).click();
		    driver.findElement(By.xpath("//*[@id='census--start--button--next']")).click();	
			driver.findElement(By.xpath("//*[@id='census']/div/div/div/div[2]/label/div[2]")).click();
			driver.findElement(By.xpath("//*[@id='census--insurance-type--button-continue']")).click();
			
		   driver.findElement(By.xpath("//*[@id='census--application--primary--gender--button--female']")).click();
		   driver.findElement(By.xpath("//*[@id='census--application--primary--dob--month']")).sendKeys("06");
			driver.findElement(By.xpath("//*[@id='census--application--primary--dob--day']")).sendKeys("21");
			driver.findElement(By.xpath("//*[@id='census--application--primary--dob--year']")).sendKeys("1986");
		 
	 }
	  @AfterSuite
	  public void exit(){
		  driver.quit();
	  }
}