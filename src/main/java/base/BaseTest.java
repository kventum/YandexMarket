package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

import static base.Configuration.Implicit_Wait;
import static base.Configuration.site_url;

/**
 * Базовый класс тестов
 */
public abstract class BaseTest {
    protected WebDriver driver;
    //public BaseRouter baseRouter = new BaseRouter();

    public void openSite() {
        start();
        driver.get("https://market.yandex.ru/");
    }

    @BeforeEach
    private void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(Implicit_Wait));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Implicit_Wait));
        BasePage.setDriver(driver);
        driver.get(site_url);
    }

    @AfterEach
    public void finish() {
        driver.close();
        if (driver != null) {
            driver.quit();
        }
    }
}
