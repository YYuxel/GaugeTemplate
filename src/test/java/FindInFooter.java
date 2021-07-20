import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.driver.Driver;

import java.util.ArrayList;
import java.util.List;

public class FindInFooter {
    WebDriver driver;
    //    By byXpathCondition = By.xpath("//*[contains(text(),'Status')]");
//    By byXpathTerms = By.xpath("//*[contains(text(),'Terms')]");
//    By byXpathPrivacy = By.xpath("//*[contains(text(),'Privacy')]");
    By byXpathElements = By.xpath("//li[@class='mb-1']");

    @Step("Verify the footer")
    public void footer() {
        WebDriver webDriver = Driver.webDriver;
        WebDriverWait wait = new WebDriverWait(webDriver, 10);

        List<WebElement> allElements = webDriver.findElements(byXpathElements);

        List<String> elementTexts=new ArrayList<>();
        for (WebElement element: allElements) {
            elementTexts.add(element.getText());

        }
        System.out.println(elementTexts);

        Assert.assertTrue(elementTexts.contains("Status"));
        Assert.assertTrue(elementTexts.contains("Terms"));
        Assert.assertTrue(elementTexts.contains("Privacy"));

    }
}
