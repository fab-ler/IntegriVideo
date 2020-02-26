import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class XpathLocatorsTest extends BaseTest {

    @Test
    public void locator() {
        driver.findElement(By.className("btn"));
        driver.findElement(By.id("invite-users-to-chat"));
        driver.findElement(By.partialLinkText("Privacy policy"));
        driver.findElement(By.xpath("//code[@class='component-code']"));
        driver.findElement(By.xpath("//div[@class='integri-watermark']//a"));
        driver.findElement(By.xpath("//a[@class='navbar-brand logo']//img"));
        driver.findElement(By.partialLinkText("Log "));
        driver.findElement(By.linkText("Sign up"));
        driver.findElement(By.xpath("//h3[contains(text(),'Follow us')]"));
        driver.findElement(By.xpath("//a[contains(text(),'info@integrivideo.com')]"));
        driver.findElement(By.xpath("//a[contains(text(),'Blog')]"));
        driver.findElement(By.xpath("//span[@class='integri-chat-settings integri-pointer']"));
        driver.findElement(By.xpath("//button[@class='integri-chat-send-message integri-chat-action-button']"));
        driver.findElement(By.xpath("//textarea[@placeholder='Start typing here']"));
        driver.findElement(By.xpath("//span[contains(text(),'Enter to send')]"));
        driver.findElement(By.xpath("//span[contains(text(),'Shift+Enter new line')]"));
        driver.findElement(By.xpath("//span[@class='integri-chat-manual-upload integri-pointer']"));
        driver.findElement(By.xpath("//div[@class='integri-chat-messages']"));
        driver.findElement(By.xpath("//div[@class='footer-line copyright']"))
    }
}
