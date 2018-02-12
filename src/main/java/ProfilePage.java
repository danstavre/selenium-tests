import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProfilePage {
    WebDriver driver;

    private By enterProfileEmail = By.xpath("//input[@type='email']");
    private By enterPassword = By.xpath("//div[@class='z-field__component']//input[@type='password']");
    private By loginButton = By.xpath("//button[@class='z-button z-coast-reef_login_button z-button--primary z-button--button']");

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProfilePage() {
        WebElement element = driver.findElement(enterProfileEmail);
        return (element.getText());
    }

    public Boolean loginButtonIsPresent() {
        WebElement element = driver.findElement(loginButton);
        return (element.isDisplayed());
    }
}
