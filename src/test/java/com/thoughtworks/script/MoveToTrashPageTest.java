package com.thoughtworks.script;

import com.thoughtworks.base.BaseTest;
import com.thoughtworks.pages.AddTaskPage;
import com.thoughtworks.pages.MoveToTrashPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MoveToTrashPageTest extends BaseTest
{
    @Test
    public void moveTaskToTrash()throws InterruptedException
    {
        AddTaskPage addTask=new AddTaskPage(driver);
        addTask.addToDoTask("Catchup","Appium Task");
        Assert.assertTrue(driver.findElement(By.id("com.jeffprod.todo:id/textViewListView")).getText().equals("Catchup"),"Task Not Added Successfully");

        MoveToTrashPage moveToTrashPage=new MoveToTrashPage(driver);
        moveToTrashPage.moveToTrash();
        Assert.assertTrue(driver.findElement(By.id("com.jeffprod.todo:id/textViewListView")).getText().equals("Catchup"),"Task moved in Trash Successfully");
    }
}
