import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class XpathLocatorsTest extends BaseTest {

    @Test
    public void locator() {
        driver.findElement(By.className("btn"));
        driver.findElement(By.id("invite-users-to-chat")); //invite link
    }
}
