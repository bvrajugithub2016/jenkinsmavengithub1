package raju.jenkins.maven1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AppTest 
{
	@Test
	public void myStartBrowser(){
		
		String browserName =  System.getProperty("browser");
		
 		WebDriver driver = null;
			
		switch(browserName){
			case "Chrome":
							WebDriverManager.chromedriver().setup();
							driver = new ChromeDriver();
							System.out.println("Launching Chrome Browser");
							break;	
			case "Firebox":
							WebDriverManager.firefoxdriver().setup();
							driver = new FirefoxDriver();
							System.out.println("Launching Firefox Browser");
							break;
			case "Edge":
							WebDriverManager.edgedriver().setup();
							driver = new EdgeDriver();
							System.out.println("Launching Edge Browser");
							break;
		}
		
		
		driver.get("https://www.gitam.edu/");
		
		
		String gitamTitle =  driver.getTitle();
		boolean result =  gitamTitle.contains("University");
		Assert.assertTrue(result, "Title doesn't contain the word University");
		driver.quit();
	}
}
