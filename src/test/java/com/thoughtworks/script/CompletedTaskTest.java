package com.thoughtworks.script;
import com.thoughtworks.base.BaseTest;
import com.thoughtworks.pages.AddTaskPage;
import com.thoughtworks.pages.CompletedTaskListPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompletedTaskTest extends BaseTest
{
    @Test
    public void completedTaskTest() throws InterruptedException
    {
        AddTaskPage addTask=new AddTaskPage(driver);
        addTask.addToDoTask("Catchup","Appium Task");
        Assert.assertTrue(driver.findElement(By.id("com.jeffprod.todo:id/textViewListView")).getText().equals("Catchup"),"Task Not Added Successfully");

        CompletedTaskListPage completedTaskLIst=new CompletedTaskListPage(driver);
        completedTaskLIst.completedTaskList();
        Assert.assertTrue(driver.findElement(By.id("com.jeffprod.todo:id/textViewListView")).getText().equals("Catchup"),"Task Not Added Successfully");
    }
}
