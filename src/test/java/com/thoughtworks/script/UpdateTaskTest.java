package com.thoughtworks.script;
import com.thoughtworks.base.BaseTest;
import com.thoughtworks.pages.AddTaskPage;
import com.thoughtworks.pages.UpdateTaskPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UpdateTaskTest extends BaseTest
{
    @Test
    public void updateTaskInToDo() throws InterruptedException
    {
        AddTaskPage addTask=new AddTaskPage(driver);
        addTask.addToDoTask("IDFC","Phase-3");
        Thread.sleep(1000);
        addTask.addToDoTask("Catchup","Automation with Selenium Task");

        UpdateTaskPage updateTask=new UpdateTaskPage(driver);
        updateTask.updateList();
        Assert.assertTrue(driver.findElement(By.id("com.jeffprod.todo:id/textViewListView")).getText().equals("Catchup"),"Not Updated Successfully");
    }
}
