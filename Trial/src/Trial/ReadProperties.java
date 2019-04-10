package Trial;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProperties {

	public static void main(String[] args) throws IOException {
	
	WebDriver driver = null;
	Properties prop=new Properties();
	FileInputStream ip=new FileInputStream("C:\\Users\\Admin\\Desktop\\PROJECT\\Trial\\src\\config.properties");
	prop.load(ip);
	System.out.println(prop.getProperty("browser"));
	
	String browserName=prop.getProperty("browser");
	
	if(browserName.equals("firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\Geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	
	else if(browserName.equals("chrome")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Admin\\Downloads\\Geckodriver\\geckodriver.exe");
		driver=new FirefoxDriver();
	}
	else {
		System.out.println("No Browser ");
	}
	
	//url
	driver.get(prop.getProperty("url"));
	driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(prop.getProperty("username"));
	driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	driver.findElement(By.xpath("//div[@id='password']//div[@class='aCsJod oJeWuf']")).sendKeys(prop.getProperty("password"));
			
	}

}
