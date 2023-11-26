import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class InboxPage {
    private final WebDriver driver;

    public InboxPage(WebDriver driver) {
        this.driver = driver;
    }

    public void composeNewEmail(String recipient, String subject, String content) {
        WebElement composeButton = driver.findElement(By.id("composeButton"));
        composeButton.click();

        WebElement recipientField = driver.findElement(By.id("recipientField"));
        WebElement subjectField = driver.findElement(By.id("subjectField"));
        WebElement contentField = driver.findElement(By.id("contentField"));
        WebElement sendButton = driver.findElement(By.id("sendButton"));

        recipientField.sendKeys(recipient);
        subjectField.sendKeys(subject);
        contentField.sendKeys(content);
        sendButton.click();
    }

    public void openReceivedEmail(String recipient) {
        WebElement receivedEmail = driver.findElement(By.xpath("//div[contains(@class, 'email') and contains(text(),'" + recipient + "')]"));
        receivedEmail.click();
    }

    public boolean isEmailReceived(String recipient) {
        WebElement receivedEmail = driver.findElement(By.xpath("//div[contains(@class, 'email') and contains(text(),'" + recipient + "')]"));
        return receivedEmail.isDisplayed();
    }

    public boolean isEmailUnread(String recipient) {
        WebElement unreadEmail = driver.findElement(By.xpath("//div[contains(@class, 'email') and contains(text(),'" + recipient + "') and contains(@class, 'unread')]"));
        return unreadEmail.isDisplayed();
    }
    public String getSenderEmail(String recipient) {
        WebElement emailElement = driver.findElement(By.xpath("//div[contains(@class, 'email') and contains(text(),'" + recipient + "')]"));
        String senderText = emailElement.findElement(By.className("sender")).getText();
        return extractEmail(senderText);
    }

    private String extractEmail(String senderText) {
        String email = "";
        String regex = "\\b[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\\b";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(senderText);

        while (matcher.find()) {
            email = matcher.group();
        }
        return email;
    }
}