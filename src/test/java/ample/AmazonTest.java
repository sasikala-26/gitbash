package ample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class AmazonTest {
@Test

public void AmazonTest() {
	//hi
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	  WebElement ele=driver.findElement(By.name("email"));
	  ele.sendKeys("abc");
	  System.out.println(ele.getAttribute("value"));
}
}
