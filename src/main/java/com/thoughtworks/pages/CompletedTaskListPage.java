package com.thoughtworks.pages;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class CompletedTaskListPage extends BasePage
{
    MenuName list=new MenuName(driver,MenuName.menuList.Completed);
    @FindBy(id = "com.jeffprod.todo:id/checkBoxListView")
    private WebElement clickOnCheckbox;

    public CompletedTaskListPage(AndroidDriver driver)
    {
        super(driver);
    }

    public AddTaskPage completedTaskList() throws InterruptedException
    {
        wait.until(ExpectedConditions.visibilityOf(clickOnCheckbox));
        clickOnCheckbox.click();
        Thread.sleep(500);
        list.menuList();
        return new AddTaskPage(driver);
    }
}
