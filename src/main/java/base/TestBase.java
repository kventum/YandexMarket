package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.MainPage;

import java.time.Duration;

public class TestBase {
    WebDriver driver;
    public MainPage mainPage;

    public void start() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        mainPage = new MainPage(driver);
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
