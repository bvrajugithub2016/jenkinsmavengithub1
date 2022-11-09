package raju.jenkins.maven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
	@Test
	public void myStartBrowser(){
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.gitam.edu/");
		
		String gitamTitle =  driver.getTitle();
		boolean result =  gitamTitle.contains("University");
		Assert.assertTrue(result, "Title doesn't contain the word University");
		driver.quit();
	}
}
