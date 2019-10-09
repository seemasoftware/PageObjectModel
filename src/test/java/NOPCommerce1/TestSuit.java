package NOPCommerce1;

import org.testng.annotations.Test;

public class TestSuit extends BaseTest {
    HomePage homePage = new HomePage();
    RegistrationPage registrationPage = new RegistrationPage();
    RegistratonResultPage registratonResultPage = new RegistratonResultPage();
    JewelleryPage jewelleryPage = new JewelleryPage();
    Flower_girl_bracelet flower_girl_bracelet=new Flower_girl_bracelet();
    EmailAFriend emailAFriend=new EmailAFriend();
    EmailAFriendSuccessfulPage emailAFriendSuccessfulPage=new EmailAFriendSuccessfulPage();
    ShoppingPage shoppingPage=new ShoppingPage();
    CheckOutPage checkOutPage=new CheckOutPage();
    OrderConfirmation orderConfirmation= new OrderConfirmation();
    GuestCheckOut guestCheckOut=new GuestCheckOut();



@Test

public void UserShouldBeAbleTORegisterSuccessfully() {
    homePage.ClickonRegistrationButton();
    registrationPage.VarifyUserOnRegistrationPage();
    registrationPage.UserEnterRegistrationDetails();
    registratonResultPage.registrationResultPage();
    registratonResultPage.VerifyUserSuccessfulMessage();
}

@Test
public void RegisterUserShouldBeAbleToReferAProduct(){
    UserShouldBeAbleTORegisterSuccessfully();
    registratonResultPage.ClickOnContinueMethod();
    homePage.VerifyUserIsOnHomePage();
    homePage.ClickOnJewelleryButton();
    jewelleryPage.VerifyUserIsOnJewelleyPage();
    jewelleryPage.ClickOnBracelet();
    flower_girl_bracelet.VerifyUserIsOnflowergirlbraceletPage();
    flower_girl_bracelet.ClickOnEmailAFriend();
    emailAFriend.verifyUserIsOnemailAFriendPage();
    emailAFriend.EnterFreindsDetails();
    emailAFriendSuccessfulPage.VerifyProductHasBeenSend();
    emailAFriendSuccessfulPage.VerifyProductHasBeenSendSuccessfulMessage();
}

@Test
public void UnregisterUserCanNotSendReferAProduct(){
    homePage.VerifyUserIsOnHomePage();
    homePage.ClickOnJewelleryButton();
    jewelleryPage.VerifyUserIsOnJewelleyPage();
    jewelleryPage.ClickOnBracelet();
    flower_girl_bracelet.VerifyUserIsOnflowergirlbraceletPage();
    flower_girl_bracelet.ClickOnEmailAFriend();
    emailAFriend.verifyUserIsOnemailAFriendPage();
    emailAFriend.EnterUnregisterFriendDetails();
    emailAFriend.VerifyUnsuccessfulMessage();
}

@Test
public void UserShouldBuyAProductSuccessfullyWithMasterCard()
{
    UserShouldBeAbleTORegisterSuccessfully();
    registratonResultPage.ClickOnContinueMethod();
    homePage.VerifyUserIsOnHomePage();
    homePage.ClickOnJewelleryButton();
    jewelleryPage.VerifyUserIsOnJewelleyPage();
    jewelleryPage.ClickOnBracelet();
    flower_girl_bracelet.ClickOnShoppingBasket();
    shoppingPage.EnterShoppiingDetils();
    shoppingPage.VerifyShoppingURL();
    checkOutPage.VerifyCheckOutURL();
    checkOutPage.CheckOutDetails();
    orderConfirmation.VerifyOrderConfirmationSuccessfulMessage();
}

@Test
public void UserShouldAbleBuyProductAsAGuest()
{
    homePage.VerifyUserIsOnHomePage();
    homePage.ClickOnJewelleryButton();
    jewelleryPage.VerifyUserIsOnJewelleyPage();
    jewelleryPage.ClickOnBracelet();
    flower_girl_bracelet.ClickOnShoppingBasket();
    shoppingPage.EnterShoppiingDetils();
    guestCheckOut.CheckOutASAGuest();
    orderConfirmation.VerifyOrderConfirmationSuccessfulMessage();

}
}
