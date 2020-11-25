import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.awt.*;

public class Main {

    WebDriver driver;

    @BeforeEach
    public void driverSetup(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver1.exe");
        driver = new ChromeDriver();
        driver.manage().window().setSize(new Dimension(1290,730));
        driver.manage().window().setPosition(new Point(8,30));
        driver.navigate().to("www.wikipedia.org");
    }

    @AfterEach
    public void closeAndQuit(){
        driver.close();
        driver.quit();
    }
}
