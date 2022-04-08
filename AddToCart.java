public class AddToCart {
    	WebDriverManager.chromedriver().setup();
    ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

    // virtual gift card
		driver.get("http://demowebshop.tricentis.com/25-virtual-gift-card");


		driver.findElement(By.id("giftcard_2_RecipientName")).sendKeys("Neo");
		driver.findElement(By.id("giftcard_2_RecipientEmail")).sendKeys("neyo@gmail.com");
		driver.findElement(By.id("giftcard_2_SenderName")).sendKeys("Jabulani Mahlangu");
		driver.findElement(By.id("giftcard_2_SenderEmail")).sendKeys("jabsmahlangu@gmail.com");

    //bugs
    //driver.findElement(By.id("giftcard_2_SenderEmail")).sendKeys("lets work lets work");
    //driver.findElement(By.id("addtocart_2_EnteredQuantity")).sendKeys("1");


		driver.findElement(By.id("add-to-cart-button-2")).click();

		try {
        Thread.sleep(1000);
    } catch (InterruptedException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

    //driver.close();



}
}
