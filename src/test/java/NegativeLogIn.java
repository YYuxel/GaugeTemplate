import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.driver.Driver;

public class NegativeLogIn {
    WebDriver driver;
    By byXpathSignInLink = By.xpath("//a[contains(text(),'Sign in')]");
    By byXpathEmailField = By.cssSelector("input[id='login_field']");
    By byXpathPasswordField = By.cssSelector("input[id='password']");
    By byXpathSignInButton = By.xpath("//input[@value='Sign in']");
    By byXpatherrorMessageLabel= By.xpath("(//button[@aria-label='Dismiss this message']/..)[1]");
    @Step("Login als negative email <yucel.krtls@icloud.>  and password <Ky.>")
    public void implementationNegativeLogIn(String email, String password) throws InterruptedException {

        WebDriver webDriver = Driver.webDriver;
        WebDriverWait wait = new WebDriverWait(webDriver, 10);

        Thread.sleep(5000);
        webDriver.findElement(byXpathSignInLink).click();
//        //wait.until(ExpectedConditions.visibilityOf(webDriver.findElement(byXpathEmailField)));
//        Thread.sleep(1000);//
//
//        webDriver.findElement(byXpathEmailField).sendKeys(email);
//        webDriver.findElement(byXpathPasswordField).sendKeys(password);
//        webDriver.findElement(byXpathSignInButton).click();
//        Thread.sleep(4000);
//        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
//        String expectedResult="Incorrect username or password.";
//        Assert.assertEquals(expectedResult, webDriver.findElement(byXpatherrorMessageLabel).getText());


    }
}

