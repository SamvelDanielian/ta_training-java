import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {
    private final WebDriver driver;
    private final By usernameField = By.xpath("//*[@id=\"identifierId\"]");
    private final By passwordField = By.xpath("//*[@id=\"password\"]/div[1]/div/div[1]/input");
    private final By loginButton = By.xpath("//*[@id=\"passwordNext\"]/div/button/span");

    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterUsername(String username) {
        driver.findElement(usernameField).sendKeys(username, Keys.ENTER);
    }

    public void enterPassword(String password) {
        driver.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        driver.findElement(loginButton).click();
    }

    public void login(String username, String password) throws InterruptedException {
        enterUsername(username);
        Thread.sleep(4000);
        enterPassword(password);
        Thread.sleep(4000);
        clickLoginButton();
    }

    public void clearAll() {
        WebElement usernameField = driver.findElement(By.id("username"));
        WebElement passwordField = driver.findElement(By.id("password"));

        clearField(usernameField);
        clearField(passwordField);
    }

    private void clearField(WebElement element) {
        element.clear();
    }
}

