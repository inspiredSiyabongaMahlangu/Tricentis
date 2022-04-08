package Tricentis;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ContactUs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		//driver.get("http://www.google.com");
		
		driver.get("http://demowebshop.tricentis.com/contactus");
		driver.manage().window().maximize();
		driver.findElement(By.id("FullName")).sendKeys("Siyabonga Mahlangu");
		driver.findElement(By.id("Email")).sendKeys("dylan@gmail.com");
		driver.findElement(By.id("Enquiry")).sendKeys("Hello, please respond to my emails");
		
		try {
			Thread.sleep(1000);
			} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}

		driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[3]/form/div[3]/input")).click();

	}

}
