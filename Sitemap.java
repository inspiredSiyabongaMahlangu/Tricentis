package Tricentis;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sitemap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		// driver.get("http://www.google.com");

		// Books
		driver.get("http://demowebshop.tricentis.com/sitemap");
		driver.manage().window().maximize();
		// driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[2]/div[2]/ul/li[1]/a"));
		driver.get("http://demowebshop.tricentis.com/books");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
		

		// Computers
		driver.get("http://demowebshop.tricentis.com/sitemap");
		driver.manage().window().maximize();
		// driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[2]/div[2]/ul/li[2]/a"));
		driver.get("http://demowebshop.tricentis.com/computers");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
	

		// Desktops
		driver.get("http://demowebshop.tricentis.com/sitemap");
		driver.manage().window().maximize();
		// driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[2]/div[2]/ul/li[3]/a"));
		driver.get("http://demowebshop.tricentis.com/desktops");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
	

		// Notebooks
		driver.get("http://demowebshop.tricentis.com/sitemap");
		driver.manage().window().maximize();
		// driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[2]/div[2]/ul/li[4]/a"));
		driver.get("http://demowebshop.tricentis.com/notebooks");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
	
		// Accessories
		driver.get("http://demowebshop.tricentis.com/sitemap");
		driver.manage().window().maximize();
		// driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[2]/div[2]/ul/li[5]/a"));
		driver.get("http://demowebshop.tricentis.com/accessories");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
	

		// Electronics
		driver.get("http://demowebshop.tricentis.com/sitemap");
		driver.manage().window().maximize();
		// driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[2]/div[2]/ul/li[6]/a"));
		driver.get("http://demowebshop.tricentis.com/electronics");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
		

		// Camera, Photo
		driver.get("http://demowebshop.tricentis.com/sitemap");
		driver.manage().window().maximize();
		// driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[2]/div[2]/ul/li[7]/a"));
		driver.get("http://demowebshop.tricentis.com/camera-photo");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
		

		// Cellphones
		driver.get("http://demowebshop.tricentis.com/sitemap");
		driver.manage().window().maximize();
		// driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[2]/div[2]/ul/li[8]/a"));
		driver.get("http://demowebshop.tricentis.com/cell-phones");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();
		

		// Apparel and Shoes
		driver.get("http://demowebshop.tricentis.com/sitemap");
		driver.manage().window().maximize();
		// driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[2]/div[2]/ul/li[9]/a"));
		driver.get("http://demowebshop.tricentis.com/apparel-shoes");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();

		// Digital Downloads
		driver.get("http://demowebshop.tricentis.com/sitemap");
		driver.manage().window().maximize();
		// driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[2]/div[2]/ul/li[10]/a"));
		driver.get("http://demowebshop.tricentis.com/digital-downloads");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();

		// Jewelry
		driver.get("http://demowebshop.tricentis.com/sitemap");
		driver.manage().window().maximize();
		// driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[2]/div[2]/ul/li[11]/a"));
		driver.get("http://demowebshop.tricentis.com/jewelry");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();

		// Gift Cards
		driver.get("http://demowebshop.tricentis.com/sitemap");
		driver.manage().window().maximize();
		// driver.get("http://demowebshop.tricentis.com/");
		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div/div/div[2]/div[2]/div[2]/ul/li[12]/a"));
		driver.get("http://demowebshop.tricentis.com/gift-cards");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.navigate().back();

	}

}

