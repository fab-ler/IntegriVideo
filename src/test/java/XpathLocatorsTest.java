import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class XpathLocatorsTest extends BaseTest {

    @Test
    public void locator() {
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
        //uplod modal
        driver.findElement(By.cssSelector(".integri-file-upload"));
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
        // input user pic or By.xpath("//input[@name='userPic']") или //input[@placeholder='Photo URL']
        driver.findElement(By.name("userPic"));
        // close icon
        driver.findElement(By.className("close-integri-modal"));
        // save btn
        driver.findElement(By.className("integri-user-settings-save"));
        // close btn
        driver.findElement(By.className("integri-button-blue-inverse"));
        // validate user name
        driver.findElement(By.xpath("//*[@class='integri-session-user-name']"));
        //video chat btn
        driver.findElements(By.cssSelector(".integri-chat-start-video.integri-chat-action-button"));
        // browse button on upload modal
        driver.findElements(By.cssSelector(".integri-file-upload-manual-init"));
        //cancel upload btn
        driver.findElements(By.cssSelector(".integri-file-upload-cancel"));
        //start upload btn
        driver.findElements(By.cssSelector(".integri-file-upload-start"));
        //close upload modal icon
        driver.findElement(By.cssSelector(".iv-icon-cross"));
   }

    @Test
    public void runTest() {
        System.out.println(System.getProperty("userName"));
    }
}
