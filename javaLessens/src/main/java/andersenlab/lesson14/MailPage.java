package andersenlab.lesson14;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Set;

public class MailPage {
    @FindBy(xpath = "//a[contains(text(),'Почта')]")
    private WebElement buttonMail;

    @FindBy(xpath = "//input[@placeholder='Имя аккаунта']")
    private WebElement loginField;

    @FindBy(xpath = "//span[contains(text(),'Ввести пароль')]")
    private WebElement buttonInputPassword;

    @FindBy(xpath = "//input[@placeholder='Пароль']")
    private WebElement passwordField;

    @FindBy(xpath = "//button[@type='submit']")
    private WebElement logIn;

    @FindBy(xpath = "//span[@class='compose-button__txt']")
    private WebElement writeLetter;

    @FindBy(xpath = "//div[@class='container--ItIg4']//input[@type='text']")
    private WebElement mailField;

    @FindBy(name = "Subject")
    private WebElement subjectField;

    @FindBy(xpath = "//div[@contenteditable=\"true\"]//div")
    private  WebElement textField;

    @FindBy(xpath = "//span[@title='Отправить']")
    private WebElement buttonSend;

    @FindBy(xpath = "//a[@class='layer__link']")
    private WebElement messageLetterPoisoned;

    public MailPage(WebDriver webDriver) {
        PageFactory.initElements(webDriver, this);
    }

    public void windowSwitch(WebDriver driver, String window1) {
        buttonMail.click();
        Set<String> currentWindows = driver.getWindowHandles();
        String window2 = null;
        for (String window : currentWindows) {
            if (!window.equals(window1)) {
                window2 = window;
                break;
            }
        }
        driver.switchTo().window(window2);
    }

    public void enterLoginAndPassword(String login, String password) {
        loginField.sendKeys(login);
        buttonInputPassword.click();
        passwordField.sendKeys(password);
        logIn.click();
    }

    public void sendMail(String email, String subject, String text) {
        writeLetter.click();
        mailField.click();
        mailField.sendKeys(email);
        subjectField.click();
        subjectField.sendKeys(subject);
        textField.sendKeys(text);
        buttonSend.click();
    }

    public boolean letterPoisoned() {
        return messageLetterPoisoned.isDisplayed();
    }
}