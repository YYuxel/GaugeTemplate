import com.thoughtworks.gauge.Step;
import utils.driver.Driver;

public class Page {

    public static String APP_URL = System.getenv("APP_URL");

    @Step("Go to github page")
    public void openGithubPage() {
        Driver.webDriver.get(APP_URL);
    }
}
