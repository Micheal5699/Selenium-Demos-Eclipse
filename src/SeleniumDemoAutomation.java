import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\hp\\Downloads\\chromedriver_win32.\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.seleniumeasy.com/");

	}

}
