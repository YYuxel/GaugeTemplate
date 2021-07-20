package SVGapp;

import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.driver.Driver;

public class SVG_Login {
    WebDriver driver;
    WebDriver webDriver = Driver.webDriver;
    By ByIdUsername = By.id("registration-email");
    By ByIdPassword = By.id("registration-password");
    By loginButton = By.id("login-submit");

    @Step("Go to <https://svgapp.de/login>")
    public void Login(String url) {
        webDriver.get(url);

    }

    @Step("Enter username <kurtulus.yuecel@systemverification>")
    public void username(String username) {
        webDriver.findElement(ByIdUsername).sendKeys(username);

    }

    @Step("Enter password <Ky2845@@>")
    public void password(String password) {
        webDriver.findElement(ByIdPassword).sendKeys(password);

    }

    @Step("Click login button")
    public void LoginClik() throws InterruptedException {
        webDriver.findElement(loginButton).click();
        Thread.sleep(3000);
        Assert.assertEquals(webDriver.getTitle(),"Home - SVGProjectPortal");
    }
}
