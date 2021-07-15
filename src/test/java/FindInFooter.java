import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.driver.Driver;

public class FindInFooter {
    WebDriver driver;
    By byXpathCondition = By.xpath("//*[contains(text(),'Status')]");
    By byXpathTerms = By.xpath("//*[contains(text(),'Terms')]");
    By byXpathPrivacy = By.xpath("//*[contains(text(),'Privacy')]");

    @Step("Verify <Status> in the footer")
    public void implementation1(String str) throws InterruptedException {
        WebDriver webDriver = Driver.webDriver;
        WebDriverWait wait = new WebDriverWait(webDriver, 10);
        String Condition="Status";
        String Terms="Terms";
        String Privacy="Privacy";

        Thread.sleep(2000);
        Assert.assertTrue(webDriver.findElement(byXpathCondition).isDisplayed());
//        Thread.sleep(2000);
//        Assert.assertEquals(Terms,webDriver.findElement(byXpathTerms).getText());
//        Thread.sleep(2000);
//        Assert.assertEquals(Condition,webDriver.findElement(byXpathPrivacy).getText());


    }
}
