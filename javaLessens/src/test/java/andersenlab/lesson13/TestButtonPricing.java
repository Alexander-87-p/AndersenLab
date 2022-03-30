package andersenlab.lesson13;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestButtonPricing {
    @Test
    public void isTrue() throws InterruptedException {
        final String website = "https://andersenlab.com";
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(website);
        Thread.sleep(3000);
        WebElement buttonPricing = driver.findElement(By.xpath("//a[text()='Pricing']"));
        buttonPricing.click();

        String factURL = driver.getCurrentUrl();
        String correctURL = "https://andersenlab.com/";
        Assertions.assertEquals(factURL, correctURL);
    }
}