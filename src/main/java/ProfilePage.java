import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class ProfilePage {
    WebDriver driver;

    private By enterProfileText = By.xpath("//*[@id='login_tab']");
    private By facebookLoginButton = By.xpath("//*[@id='fblogin']");

    public ProfilePage(WebDriver driver) {
        this.driver = driver;
    }

    public String getProfilePage() {
        WebElement element = driver.findElement(enterProfileText);
        return (element.getText());
    }

    public Boolean facebookButtonIsPresent() {
        WebElement element = driver.findElement(facebookLoginButton);
        return (element.isDisplayed());
    }
}
