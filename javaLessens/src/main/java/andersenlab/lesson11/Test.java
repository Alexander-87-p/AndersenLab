package andersenlab.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://mail.ru");
        WebElement element = driver.findElement(By.xpath("//button[@class='resplash-btn resplash-btn_primary resplash-btn_big svelte-y47oj9']"));
        element.click();
    }
}

