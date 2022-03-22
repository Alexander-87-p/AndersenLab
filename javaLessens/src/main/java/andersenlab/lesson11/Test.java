package andersenlab.lesson11;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class Test {
    public static void main(String[] args) throws InterruptedException {
        String login = "AndersenLab";
        String email = "AndersenLab@mail.ru";
        String password = "LabAndersen9";
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://mail.ru");
        String window1 = driver.getWindowHandle();

        WebElement element = driver.findElement(By.xpath("//a[contains(text(),'Почта')]"));
        element.click();
        Thread.sleep(5000);

        Set<String> currentWindows = driver.getWindowHandles();
        String window2 = null;
        for (String window : currentWindows) {
            if (!window.equals(window1)) {
                window2 = window;
                break;
            }
        }
        driver.switchTo().window(window2);

        WebElement inputLogin = driver.findElement(By.xpath("//input[@placeholder='Имя аккаунта']"));
        inputLogin.click();
        inputLogin.sendKeys(login);

        WebElement buttonInputPassword = driver.findElement(By.xpath("//span[contains(text(),'Ввести пароль')]"));
        buttonInputPassword.click();
        Thread.sleep(5000);

        WebElement inputPassword = driver.findElement(By.xpath("//input[@placeholder='Пароль']"));
        inputPassword.click();
        inputPassword.sendKeys(password);

        WebElement inputBottom = driver.findElement(By.xpath("//button[@type='submit']"));
        inputBottom.click();
        Thread.sleep(5000);

        WebElement writeLetter = driver.findElement(By.xpath("//span[text()='Написать письмо']"));
        writeLetter.click();
        Thread.sleep(5000);

        WebElement inputEmail = driver.findElement(By.xpath("//input[@type='text']"));
        inputEmail.click();
        inputEmail.sendKeys(email);

        WebElement inputSubject = driver.findElement(By.name("Subject"));
        inputSubject.click();
        inputSubject.sendKeys("Message");

        WebElement message = driver.findElement(By.xpath("//div[@contenteditable=\"true\"]//div"));
        message.click();
        message.sendKeys("Body text");

        WebElement buttonSend = driver.findElement(By.xpath("//span[@title='Отправить']"));
        buttonSend.click();
    }
}