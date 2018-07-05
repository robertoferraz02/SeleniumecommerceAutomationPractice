package Pages.Cart;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddProductToCartPage extends BasePage {

    public AddProductToCartPage(WebDriver driver) {
        super(driver);
    }

    public CartBoxFormPage addProduct(){
        driver.findElement(By.xpath("//*[@id=\"add_to_cart\"]/button/span")).click();
        return new CartBoxFormPage(driver);
    }
}
