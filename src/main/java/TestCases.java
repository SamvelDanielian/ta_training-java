import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCases {
    private WebDriver driver;
    private final String gmailUrl = "https://mail.google.com";
    private LoginPage loginPage;
    private InboxPage inboxPage;
    private EmailPage emailPage;

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\ADanielyan\\IdeaProjects\\LoginPage\\driver\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        driver = new ChromeDriver(options);
        Assert.assertNotNull(driver, "WebDriver is not initialized properly");
    }

    @Test
    public void testLoginFunctionality() throws InterruptedException{
        //Warning, code is written, but as Gmail and other services have strict security measures for test accounts.

        driver.get(gmailUrl);
        loginPage = new LoginPage(driver);

        loginPage.enterUsername("correctUsername");
        Thread.sleep(3000);
        loginPage.enterPassword("correctPassword");
        Thread.sleep(3000);
        loginPage.clickLoginButton();
        Thread.sleep(5000);

        Assert.assertTrue(isLoggedIn(), "Login with correct credentials failed");

        loginPage.clearAll();

        loginPage.enterUsername("wrongUsername");
        Thread.sleep(3000);
        loginPage.enterPassword("wrongPassword");
        Thread.sleep(3000);
        loginPage.clickLoginButton();

        Assert.assertFalse(isLoggedIn(), "Login with wrong credentials succeeded");

        loginPage.clearAll();

        loginPage.clickLoginButton();

        Assert.assertFalse(isLoggedIn(), "Login with empty credentials succeeded");
    }

    @Test
    public void testSendAndReceiveEmail() throws InterruptedException {
        //Same warning as in the previous testMethod...
        String recipientEmail = "recipient@outlook.com";

        driver.get(gmailUrl);

        loginPage = new LoginPage(driver);
        inboxPage = new InboxPage(driver);
        emailPage = new EmailPage(driver);

        loginPage.login("yourUsername", "yourPassword");
        inboxPage.composeNewEmail(recipientEmail, "Test Subject", "Test Content");
        inboxPage.openReceivedEmail(recipientEmail);
        String emailContent = emailPage.getEmailContent();

        Assert.assertTrue(inboxPage.isEmailReceived(recipientEmail), "Email not received");
        Assert.assertTrue(inboxPage.isEmailUnread(recipientEmail), "Email not marked as unread");
        Assert.assertEquals(inboxPage.getSenderEmail(recipientEmail), "yourEmail@example.com", "Incorrect sender");
        Assert.assertEquals(emailContent, "Test Content", "Email content doesn't match");
    }


    private boolean isLoggedIn() {
        try {
            WebElement logoutButton = driver.findElement(By.id("logoutButton"));
            return logoutButton.isDisplayed();
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    @AfterTest
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}

