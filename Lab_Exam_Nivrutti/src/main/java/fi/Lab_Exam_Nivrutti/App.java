package fi.Lab_Exam_Nivrutti;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

/**
 * Hello world!
 *
 */
public class App 
{
	
		WebDriver driver;
		public void launchBrowser() 
		{
			System.setProperty("webdriver.edge.driver","C:\\Users\\Admin\\Desktop\\C Dac PPT,Assignment,Code\\edgedriver.exe");
			 driver = new EdgeDriver();
		}
		public void navigate() throws InterruptedException
		{
			driver.navigate().to("https://www.flipkart.com/");
			
			
		}
		public void opengmail() throws InterruptedException
		{
		
	         driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='text']")).sendKeys("nivruttimisal555@gmail.com");
	     	Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//input[@type='password']")).sendKeys("nivrutti@456");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='_1XBjg- row']//form//button[@type='submit']")).click();
			Thread.sleep(2000);
			
			driver.close();
			
		}
		

		
		public static void main(String[] args) throws InterruptedException 
		{
			App obj = new App();
			obj.launchBrowser();
			obj.navigate();
			obj.opengmail();
			
		}
	}