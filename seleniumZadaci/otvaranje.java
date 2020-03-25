package seleniumZadaci;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class otvaranje {
	public WebDriver driver;
	
	@BeforeClass
	public void beforeMetoda() {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://google.com");
	}
  @Test
  public void proveraTitla() {
	  Assert.assertEquals(driver.getTitle(), "Google");
  }
  @AfterClass
  public void zatvaranje() {
	  driver.close();
  }
}
