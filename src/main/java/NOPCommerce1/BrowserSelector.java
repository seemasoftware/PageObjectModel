package NOPCommerce1;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserSelector extends Utils {
    LoadProps loadProps=new LoadProps();

    public void setUpBrowser(){
        String browser = loadProps.getProperty("browser");

        if (browser.equalsIgnoreCase("firefox")){
                System.setProperty("webdriver.gecko.driver","src\\test\\Resources\\BrowserDriver\\geckodriver.exe");
                driver = new FirefoxDriver();
            } else if (browser.equalsIgnoreCase("chrome")){
                System.setProperty("webdriver.chrome.driver","src\\test\\Resources\\BrowserDriver\\chromedriver.exe");
                driver = new ChromeDriver();
            } else if(browser.equalsIgnoreCase("IEchrome")){
                System.setProperty("webdriver.internateExpolar.driver","src\\test\\Resources\\BrowserDriver\\IEDriverServer.exe");
            } else
            {
                System.out.println("Browser name is empty or typed wrong:"+browser);
            }


        }

    }


