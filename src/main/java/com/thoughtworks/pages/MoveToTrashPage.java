package com.thoughtworks.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class MoveToTrashPage extends BasePage
{
    MenuName list=new MenuName(driver,MenuName.menuList.Trash);
    @FindBy(id="com.jeffprod.todo:id/textViewListView")
    private WebElement clickOnList;

    @FindBy(id = "com.jeffprod.todo:id/imageButtonDelete")
    private WebElement clickOnTrash;

    public MoveToTrashPage(AndroidDriver driver)
    {
        super(driver);
    }

    public UpdateTaskPage moveToTrash() throws InterruptedException
    {
        clickOnList.click();
        driver.navigate().back();
        clickOnTrash.click();
        Thread.sleep(300);
        List<WebElement> elementsNavigate2 = driver.findElements(By.className("android.widget.ImageButton"));
        for(WebElement elementNavigate2 : elementsNavigate2)
        {
            if(elementNavigate2.getAttribute("content-desc").equals("Open navigation drawer"))
            {
                elementNavigate2.click();
                break;
            }
        }
        list.menuList();
        return new UpdateTaskPage(driver);
    }
}
