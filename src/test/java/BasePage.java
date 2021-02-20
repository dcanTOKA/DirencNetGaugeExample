import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class BasePage extends DirencNetConstants{

    protected WebDriver driver;

    public WebElement find (By by){
        return driver.findElement(by);

    }
    public void sendKeys(By by , String text , boolean submit){
        WebElement element = driver.findElement(by);
        element.sendKeys(text);
        log(text + " mesaji yazildi");
        if(submit){
           element.submit();
            log("Mesaj yazildiktan sonra submit edildi");
        }
    }
    public void click(By by){
        driver.findElement(by).click();
        log("Element : " + by +" tiklandi");
    }
    public void delaySec(int sec){
        try {
            TimeUnit.SECONDS.sleep(sec);
        } catch (Exception e) {
            log(e.getMessage());
        }
        log(sec +" saniye kadar beklendi");
    }
    public void log(String msg){
        Logger logger = LogManager.getLogger(BasePage.class);
        logger.info(msg);
    }

}
