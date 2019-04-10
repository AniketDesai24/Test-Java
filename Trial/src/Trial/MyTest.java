package Trial;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class MyTest {

	@Test
	public void myTest() throws InterruptedException {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\Geckodriver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		//driver.get("https://www.google.com/");
		driver.get("https://www.google.com/");
		
		String Title=driver.getTitle();
		System.out.println(Title);
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		Thread.sleep(9000);
		
		driver.quit();
	}

}
