package com.thoughtworks.pages;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.touch.TouchActions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class UpdateTaskPage extends BasePage
{
    @FindBy(id="com.jeffprod.todo:id/textViewListView")
    private WebElement clickOnList;

    @FindBy(id="com.jeffprod.todo:id/editTextTag")
    private WebElement addTag;

    @FindBy(id = "com.jeffprod.todo:id/buttonStartDate")
    private WebElement startDate;

    @FindBy(id = "android:id/button1")
    private WebElement clickOnOkBtn;

    @FindBy(id = "com.jeffprod.todo:id/buttonDeadline")
    private WebElement endDate;

    @FindBy(id = "com.jeffprod.todo:id/editTextPriority")
    private WebElement setPriority;

    @FindBy(id = "com.jeffprod.todo:id/action_save")
    private WebElement clickOnUpdate;

    public UpdateTaskPage(AndroidDriver driver)
    {
        super(driver);
    }

    public SettingPage updateList() throws InterruptedException {
        wait.until(ExpectedConditions.visibilityOf(clickOnList));
        clickOnList.click();
        driver.navigate().back();
        wait.until(ExpectedConditions.visibilityOf(startDate));
        startDate.click();
        Thread.sleep(500);
        List<WebElement> elements = driver.findElements(By.className("android.view.View"));
        for(WebElement element : elements)
        {
            if(element.getAttribute("text").equals("18"))
            {
                element.click();
                break;
            }
        }
        clickOnOkBtn.click();
        endDate.click();
        Thread.sleep(1000);
        List<WebElement> elements1 = driver.findElements(By.className("android.view.View"));
        for(WebElement element1 : elements1)
        {
            if(element1.getAttribute("text").equals("25"))
            {
                element1.click();
                break;
            }
        }
        clickOnOkBtn.click();
        setPriority.click();
        List<WebElement> elements2 = driver.findElements(By.className("android.widget.CheckedTextView"));
        for(WebElement element2 : elements2)
        {
            if(element2.getAttribute("text").equals("High"))
            {
                element2.click();
                break;
            }
        }
        clickOnOkBtn.click();
        clickOnUpdate.click();
        driver.navigate().back();
        return new SettingPage(driver);
    }
}

