package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;

import java.time.Duration;

public class TestBase {
    WebDriver driver = new ChromeDriver();
    public MainPage mainPage;
    public BaseRouter baseRouter = new BaseRouter();

    public void start() {
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @BeforeEach
    public void openSite() {
        start();
        driver.get("https://market.yandex.ru/");
    }

    @AfterEach
    public void finish() {
        driver.quit();
    }

}
