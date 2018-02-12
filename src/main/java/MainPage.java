import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MainPage {
    protected WebDriver driver;
    private By myLoginLink = By.xpath("//span[@class='z-text z-navicat-header_navToolLabelName z-text-cta z-text-black']");

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
