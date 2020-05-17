package com.thoughtworks.script;
import com.thoughtworks.base.BaseTest;
import com.thoughtworks.pages.AddTaskPage;
import com.thoughtworks.pages.ScheduleDisplayPage;
import com.thoughtworks.pages.UpdateTaskPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ScheduleDisplayPageTest extends BaseTest
{
    @Test
    public void scheduledDisplayTest() throws InterruptedException
    {
        AddTaskPage addTask=new AddTaskPage(driver);
        addTask.addToDoTask("IDFC","Phase-3");
        Thread.sleep(500);
        addTask.addToDoTask("New Task","Hard Work");

        UpdateTaskPage updateTask=new UpdateTaskPage(driver);
        updateTask.updateList();

        ScheduleDisplayPage displayPage=new ScheduleDisplayPage(driver);
        displayPage.displayScheduledList();
        Assert.assertTrue(driver.findElement(By.id("com.jeffprod.todo:id/textViewListView")).getText().equals("IDFC"),"Task Not Scheduled Successfully");
    }
}
