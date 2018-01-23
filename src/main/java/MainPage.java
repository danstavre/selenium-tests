import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    protected WebDriver driver;
    private By myLoginLink = By.xpath("//*[@id=\"z-navicat-header-root\"]/header/div[3]/div/div/div/div/z-grid/z-grid-item/div/div[1]/div[3]/div/div[1]/a");

    public MainPage(WebDriver driver) {
        this.driver = driver;
    }

    public ProfilePage clickMyProfileLink() {
        System.out.println("Clicking on My login link.");
        WebElement myLoginLinks = driver.findElement(myLoginLink);
        myLoginLinks.click();
        return new ProfilePage(driver);
    }
}
