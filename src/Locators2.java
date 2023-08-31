import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;


public class Locators2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String name = "Ibukun";
//		System.setProperty("webdriver.gecko.driver", "C:\\Users\\hp\\Downloads\\geckodriver-v0.31.0-win64\\geckodriver.exe");
//		WebDriver driver = new FirefoxDriver();
		System.setProperty("webdriver.edge.driver", "C:\\Users\\hp\\Downloads\\edgedriver_win64\\msedgedriver.exe");
		WebDriver driver = new EdgeDriver();
//		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32.\\chromedriver.exe");
//		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); 
		String password = getPassword(driver);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.className("signInBtn")).click();
		Thread.sleep(2000);
		System.out.println(driver.findElement(By.tagName("p")).getText());
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		Assert.assertEquals(driver.findElement(By.cssSelector("div[class='login-container'] h2")).getText(),"Hello "+name+",");
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		Thread.sleep(2000);
		//driver.close();
			
	}
	
	public static String getPassword (WebDriver driver) throws InterruptedException
	
	{
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(1000);
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		String passwordText =driver.findElement(By.cssSelector("form p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		String[] passwordArray = passwordText.split("'");
//		String[] passwordArray = passwordText.split("'");
//		passwordArray2[0]
		String password = passwordArray[1].split("'")[0];
		return password;
		//0th index - Please use temporary password
		//1st index - rahulshettyacademy' to Login.
		
		//0th index - rahulshettyyacademy
		//1st index - to Login.
		
		
	}
	
	

}
