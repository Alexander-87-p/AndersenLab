package andersenlab.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonPricing {
    final String website = "https://andersenlab.com";

    public void buttonPricingClicker() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(website);
        Thread.sleep(3000);
        WebElement buttonPricing = driver.findElement(By.xpath("//a[text()='Pricing']"));
        buttonPricing.click();
    }
}
