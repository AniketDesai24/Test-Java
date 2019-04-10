package Trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MyTrial {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\Geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Arrka Infosec Pune");
		driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		Thread.sleep(9000);
		
		driver.close();
		System.out.println("Browser Close");
		
	}

}
