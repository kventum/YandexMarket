import base.BaseTest;
import org.junit.jupiter.api.Test;
import pages.MainPage;

public class AuthenticationTest extends BaseTest {

    @Test
    public void selectCategory() {
        MainPage mainPage = new MainPage();
        mainPage.checkLogo();
    }

}
