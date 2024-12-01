package test;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
public class Practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		System.setProperty("webdriver.chrome.driver", "\\Users\\HP\\Downloads\\chromedriver-win64/chromedriver.exe");
System.setProperty("webdriver.chromedriver", "");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com");
		
		driver.close();

		//driver.quit();



		}



		}
