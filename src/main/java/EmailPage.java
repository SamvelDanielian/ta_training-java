import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class EmailPage {
    private final WebDriver driver;

    public EmailPage(WebDriver driver) {
        this.driver = driver;
    }

    public String getEmailContent() {
        WebElement emailContentElement = driver.findElement(By.id("emailContent"));
        return emailContentElement.getText();
    }
}