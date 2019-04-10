package Trial;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgTrial {
	@Test
	public void myTest() throws InterruptedException {

		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\Geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.google.com/");
		driver.get("http://192.168.1.48/web/form/final/login.php");
		//Assert.assertEquals("", driver.getTitle());
		String URL=driver.getCurrentUrl();
		Assert.assertEquals("http://192.168.1.48/web/form/final/login.php", URL);
		System.out.println("Current URL = "+URL);
		
		Thread.sleep(3000);
		WebElement Id= driver.findElement(By.xpath("//input[@id='email']"));
		WebElement Password= driver.findElement(By.xpath("//input[@id='pass']"));
		
		Id.sendKeys("pooja.gandhi@arrka.com");
		System.out.println("ID = "+Id.getAttribute("value"));
		Assert.assertEquals(Id.getAttribute("value"), "pooja.gandhi@arrka.com");
		System.out.println("Assert SUCCESS:");
		System.out.println("Testing");
		
		Thread.sleep(3000);
		Password.sendKeys("123456");
		Assert.assertEquals(Password.getAttribute("value"), "123456");
		System.out.println("Assert SUCCESS:");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='btn-sub']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='card-header text-center']")).click();
		//driver.findElement(By.xpath("//input[@id='lst-ib']")).sendKeys("Arrka Infosec Pune");
		//driver.findElement(By.xpath("//input[@value='Google Search']")).click();
		Thread.sleep(9000);
		
		//driver.close();
		driver.quit();
		System.out.println("Close Browser");
	}

}
