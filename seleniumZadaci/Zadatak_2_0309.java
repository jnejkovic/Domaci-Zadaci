package seleniumZadaci;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_2_0309 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		/*
		 * Koristeci selenijum, napravi screenshot svog okacenog domaceg zadatka na
		 * drajvu. Okaciti ovaj zadatak i kao .java (kod sa selenijumom) i
		 * sliku(screenshot).
		 */

		System.setProperty("webdriver.driver.chromedriver", "chromedriver.exe");
		WebDriver wd = new ChromeDriver();
		wd.get("https://www.youtube.com/?hl=sr&gl=RS");
		wd.manage().window().maximize();

		TakesScreenshot scrShot = ((TakesScreenshot) wd);
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		File DestFile = new File("C:\\Users\\Prasko\\Desktop\\screenshot.jpg");
		FileUtils.copyFile(SrcFile, DestFile);

	}
}