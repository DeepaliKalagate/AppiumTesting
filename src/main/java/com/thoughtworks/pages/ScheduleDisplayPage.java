package com.thoughtworks.pages;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.List;

public class ScheduleDisplayPage extends BasePage
{
    MenuName list=new MenuName(driver,MenuName.menuList.Scheduled);
    public ScheduleDisplayPage(AndroidDriver driver)
    {
        super(driver);
    }

    public CompletedTaskListPage displayScheduledList()
    {
        list.menuList();
        return new CompletedTaskListPage(driver);
    }
}
