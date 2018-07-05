package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AuthenticationPage extends BasePage{

    public AuthenticationPage(WebDriver driver) {
        super(driver);
    }

    public CreateAccountPage typeEmail(String email_create){
        driver.findElement(By.id("email_create")).sendKeys(email_create);
        driver.findElement(By.xpath("//*[@id=\"SubmitCreate\"]/span")).click();

        return new CreateAccountPage(driver);
    }
}
