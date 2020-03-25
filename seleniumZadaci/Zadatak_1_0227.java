package seleniumZadaci;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zadatak_1_0227 {

	public static void main(String[] args) {
		/*
		 * Pomocu jave i seleniuma Otvoriti novi prozor u pretrazivacu i otici na IT
		 * Bootcamp Primeniti metode koje smo vezbali na casu (get URL i Title, navigate
		 * - refresh, to, back, forward) U kodu treba da se prozor maksimizuje, a pre
		 * zatvaranja drajvera vrati na prvobitnu velicinu (hint: koristite smernice
		 * okruzenja, ako to ne pomaze, guglajte =) )
		 * 
		 * Dodatni neobavezni zadatak Nadji metodu kojom ces vratiti duzinu “naslova”,
		 * ne samo naslov
		 */
		System.setProperty("webdriver.chrome.driver",
				"chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.itbootcamp.rs");
		driver.navigate().refresh();
		driver.navigate().to("https://itbootcamp.rs/kontakt/");
		driver.navigate().back();
		driver.navigate().forward();
		System.out.println(driver.getTitle());
		System.out.println(driver.getTitle().length());
		System.out.println(driver.getCurrentUrl());
		Dimension targetSize = driver.manage().window().getSize();
		driver.manage().window().maximize();
		driver.manage().window().setSize(targetSize);
		driver.close();

	}

}
