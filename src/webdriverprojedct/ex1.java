package webdriverprojedct;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ex1 {

	public static void main(String[] args) {
		
			WebDriver driver =new ChromeDriver();
			System.getProperty("webdriver.chrome.driver","C:\\Users\\user\\OneDrive\\Desktop\\codes\\testing\\selenium\\selenium\\chromedriver_win32\\chromedriver.exe");
			driver.get("https://google.com");
			driver.close();		
			

	}

}
