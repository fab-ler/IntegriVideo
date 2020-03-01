import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class XpathLocatorsTest extends BaseTest {

    @Test
    public void locator() {
        driver.manage().timeouts().implicitlyWait(8, TimeUnit.SECONDS);
        // invite btn
        driver.findElement(By.id("invite-users-to-chat"));
        //input area
        driver.findElement(By.xpath("//*[@placeholder='Start typing here']"));
        //user name input
        driver.findElement(By.xpath("//form/input[@type='text']"));
        // save button
        driver.findElement(By.xpath("//button[contains(text(), 'Save')]"));
        // send message button
        driver.findElement(By.xpath("//*[@title='Send message']"));
        // drag'n'drop
        driver.findElement(By.cssSelector(".integri-chat-manual-upload"));
        // settings
        driver.findElement(By.cssSelector(".integri-chat-settings"));
        // code section
        driver.findElement(By.className("component-code"));
        // settings
        driver.findElement(By.className("integri-chat-settings"));
        // input user name
        driver.findElement(By.name("userName"));
        // input user Email
        driver.findElement(By.name("userEmail"));
        // input user pic
        driver.findElement(By.name("userPic"));
        // close icon
        driver.findElement(By.className("close-integri-modal"));
        // save btn
        driver.findElement(By.className("integri-user-settings-save"));
        // close btn
        driver.findElement(By.className("integri-button-blue-inverse"));
        // validate user name
        driver.findElement(By.xpath("//*[@class='integri-session-user-name']"));
    }
}
