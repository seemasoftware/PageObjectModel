package NOPCommerce1;

import org.openqa.selenium.By;

public class EmailAFriendSuccessfulPage extends Utils {
    LoadProps loadProps= new LoadProps();
    private By _EmailaFreondSuccessfulMessgae= By.xpath("//div[@class=\"result\"]");

    public void VerifyProductHasBeenSend()
    {
        validateURL(LoadProps.getProperty("EmailAFriendURL"));
    }

    public void VerifyProductHasBeenSendSuccessfulMessage()
    {
        assertMessage(_EmailaFreondSuccessfulMessgae,LoadProps.getProperty("SuccessfulMessage"));
    }

}
