package NOPCommerce1;

import org.openqa.selenium.By;

public class Flower_girl_bracelet extends Utils{
LoadProps loadProps=new LoadProps();
private By _EmailAFriend=By.xpath("//input[@value=\"Email a friend\"]");
private By _AddToCart = By.xpath("//input[@id=\"add-to-cart-button-41\"]");


public void VerifyUserIsOnflowergirlbraceletPage()
{
    validateURL(LoadProps.getProperty("FlowerGirlBraceletURL"));

}

public void ClickOnEmailAFriend()
{
   ClickElement(_EmailAFriend);
}

public void ClickOnShoppingBasket()
{
    ClickElement(_AddToCart);

}

public void VerifyShoppintURL()
{
    validateURL("ShoppingCartURL");
}
}
