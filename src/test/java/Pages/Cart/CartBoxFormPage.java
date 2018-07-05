package Pages.Cart;

import Pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartBoxFormPage extends BasePage {
    public CartBoxFormPage(WebDriver driver) {
        super(driver);
    }

    public AddProductToCartPage continueShopping(){
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span/i")).click();
        return new AddProductToCartPage(driver);
    }

    public CheckoutPage proceedCheckout(){
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();
        return new CheckoutPage(driver);
    }
}
