import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.driver.Driver;

public class LogIn {
    WebDriver driver;
    By byXpathSignInLink = By.xpath("//a[contains(text(),'Sign in')]");
    By byXpathEmailField = By.id("login_field");
    By byXpathPasswordField = By.id("password");
    By byXpathSignInButton = By.xpath("//input[@value='Sign in']");
    By byXpathBurgerMenu = By.xpath("//header/div[7]");

    private static WebDriverWait wait;
    @Step("Login als user <email>  and password <xxxx>")
    public void implementation1(String email, String password) {
        WebDriver webDriver = Driver.webDriver;
        WebDriverWait wait = new WebDriverWait(webDriver, 10);


        webDriver.findElement(byXpathSignInLink).click();
        //wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(byXpathEmailField)));

        webDriver.findElement(byXpathEmailField).sendKeys(email);
        webDriver.findElement(byXpathPasswordField).sendKeys(password);
        webDriver.findElement(byXpathSignInButton).click();
        //wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(byXpathBurgerMenu)));



    }
}
