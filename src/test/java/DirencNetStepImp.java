import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.Step;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DirencNetStepImp extends BasePage {

    @BeforeScenario
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "src//test//resources//chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Step("Google'yi ayaga kaldir")
        public void googleKaldir(){
            driver.get("https://www.google.com.tr/");
        }



    @Step("Arama yerine <key> yaz")
    public void googleArama(String key) {
        sendKeys(GOOGLE_SEARCH_AREA,key,true);
    }


    @Step("Aranan siteye tikla")
    public void tikla() {
        click(DIRENC_NET_PAGE);
    }

    @Step("<seconds> saniye kadar bekle")
    public void bekle(int seconds) {
        delaySec(seconds);
    }

    @AfterScenario
    public void tearDown() {
        driver.quit();
    }



}
