package andersenlab.lesson14;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import java.util.concurrent.TimeUnit;

public class TestMailPage {
    String login = "AndersenLab";
    String email = "AndersenLab@mail.ru";
    String password = "LabAndersen9";
    String subject = "Message";
    String text = "Hello World";

    @Test
    public void loginTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        driver.get("https://mail.ru");
        MailPage mailPage = new MailPage(driver);
        String window1 = driver.getWindowHandle();

        mailPage.windowSwitch(driver, window1);
        mailPage.enterLoginAndPassword(login, password);
        mailPage.sendMail(email, subject, text);
        Thread.sleep(5000);
        Assert.assertTrue(mailPage.letterPoisoned());
        driver.quit();
    }
}
