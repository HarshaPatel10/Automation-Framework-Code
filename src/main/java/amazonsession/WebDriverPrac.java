package amazonsession;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverPrac {

	public static void main(String[] args) {
		
		//System.setProperty("Webdriver.chrome.driver", "D:\\Java\\chromedriver.exe");
		WebDriverManager.chromedriver().setup(); 
		WebDriver driver= new ChromeDriver();
		// TODO Auto-generated method stub

		driver.get("https://www.google.com/");
	}

}
