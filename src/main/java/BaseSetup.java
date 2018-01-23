import java.io.File;
import java.util.concurrent.TimeUnit;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseSetup {
    static WebDriver driver;

    static String Url = "https://www.zalando.pl/";

    public static WebDriver getDriver() {
        return driver;
    }

    private static WebDriver initChromeDriver(String url) {
        File file = new File("C:/Users/Bohdana_Stavriianova/Desktop/selenium/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
        driver.navigate().to(Url);
        return driver;
    }

    private static void setDriver(String Url) {
        driver = initChromeDriver(Url);
    }

    @BeforeClass
    public static void initializeTestBaseSetup() {
        try {
            setDriver(Url);
        } catch (Exception e) {
            System.out.println("Error" + e.getStackTrace());
        }
    }

    @AfterClass
    public static void tearDown() {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
