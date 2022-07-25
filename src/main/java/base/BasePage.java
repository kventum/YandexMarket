package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Базовый класс страниц
 */
public abstract class BasePage {
    protected static WebDriver driver;
    public WebDriverWait driverWait;

    public static void setDriver(WebDriver webDriver) {
        driver = webDriver;
    }

    // метод ожидания обертки
    public void waitVisibility (By by) {
        driverWait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(by));
    }

    // метод клика
    public void click(By by) {
        waitVisibility(by);
        driver.findElement(by).click();
    }

    // отображение элемента
    /**public void elementIsDisplayed(WebElement element) {
        waitVisibility(element);
        assertTrue(element.isDisplayed());
    }*/
}
