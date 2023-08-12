package Assigment2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaseStudy {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		 driver.manage().window().maximize();
		 
		 try {
			 driver.findElement(By.id("user-name")).sendKeys("standard_user");
			 driver.findElement(By.id("password")).sendKeys("secret_sauce");
			 driver.findElement(By.id("login-button")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.id("add-to-cart-sauce-labs-backpack")).click();
			 Thread.sleep(2000);
			driver.findElement(By.className("shopping_cart_link")).click();
			 
			 Thread.sleep(2000);
			 driver.findElement(By.id("checkout")).click();
			 driver.findElement(By.id("first-name")).sendKeys("sachin");
			 driver.findElement(By.id("last-name")).sendKeys("suryawanshi");
			 driver.findElement(By.id("postal-code")).sendKeys("431605");
			 driver.findElement(By.id("continue")).click();
			 Thread.sleep(2000);
			 driver.findElement(By.id("finish")).click();
			 Thread.sleep(20000);
			 driver.quit();
		 }
		 catch(NoSuchElementException e) {
			 System.out.println("Uable to Finde Element");
		 }

	}

}
