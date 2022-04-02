package andersenlab.lesson13;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestButtonQA {

    @Test
    public void isPressed() throws InterruptedException {
        final String website = "https://andersenlab.com";
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();

        JavascriptExecutor js = driver;
        driver.manage().window().maximize();
        driver.get(website);
        Thread.sleep(5000);

        WebElement header = driver.findElement(By.xpath("//h2[normalize-space()='Hire lead experts in custom software development']"));
        js.executeScript("arguments[0].scrollIntoView();", header);
        WebElement button = driver.findElement(By.xpath("//div[text()='QA']"));
        Thread.sleep(5000);
        button.click();
        assert button.isSelected();
    }
}
