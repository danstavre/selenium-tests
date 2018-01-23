import static junit.framework.TestCase.assertTrue;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

public class FirstTest  extends BaseSetup {

        private static WebDriver driver;
        private MainPage mainPage;

        @BeforeClass
        public static void setUp() {
            driver = getDriver();
        }

        @Test
        public void myProfileOpen() {

            mainPage = new MainPage(driver);

            System.out.println("\nMy Profile page test started. ");
            ProfilePage myProfilePage = mainPage.clickMyProfileLink();
            assertTrue(myProfilePage.getProfilePage().contains("Войти"));
            System.out.println("My Profile page test has been completed.\n");
        }

        @Test
        public void myProfileFacebookButtonPresent() {
            mainPage = new MainPage(driver);
            ProfilePage myProfilePage = mainPage.clickMyProfileLink();
            Assert.assertTrue("not", myProfilePage.facebookButtonIsPresent());
        }
}

