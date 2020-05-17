package com.thoughtworks.pages;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;

public class SettingPage extends BasePage
{
    @FindBy(id = "com.jeffprod.todo:id/radioBt_theme_04")
    private WebElement changeThemeColor;

    public SettingPage(AndroidDriver driver)
    {
        super(driver);
    }

    public ScheduleDisplayPage changeSetting() throws InterruptedException
    {
        List<WebElement> elements = driver.findElements(By.className("android.widget.ImageView"));
        for(WebElement element : elements)
        {
            if(element.getAttribute("content-desc").equals("More options"))
            {
                element.click();
                break;
            }
        }
        Thread.sleep(500);
        List<WebElement> elements1 = driver.findElements(By.className("android.widget.TextView"));
        for(WebElement element1 : elements1)
        {
            if(element1.getAttribute("text").equals("Settings"))
            {
                element1.click();
                break;
            }
        }
        changeThemeColor.click();
        return new ScheduleDisplayPage(driver);
    }
}
