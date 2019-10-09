package NOPCommerce1;

import org.openqa.selenium.By;

public class RegistratonResultPage extends Utils{
    LoadProps loadProps = new LoadProps();

    private By _RegistrationSuccessfulMessage = By.xpath("//div[@class=\"result\"]");
    private By _ContinueMessage = By.xpath("//input[@name=\"register-continue\"]");


    public void registrationResultPage()
    {
     validateURL(LoadProps.getProperty("RegistrationSuccessfulMsgURL"));
     }

     public void VerifyUserSuccessfulMessage()
     {

         assertMessage(_RegistrationSuccessfulMessage,LoadProps.getProperty("RegisterSuccessfulMessage"));
     }

     public void ClickOnContinueMethod()
     {
         ClickElement(_ContinueMessage);
     }
}
