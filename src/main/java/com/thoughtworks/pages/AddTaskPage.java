package com.thoughtworks.pages;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddTaskPage extends BasePage
{
    @FindBy(id="com.jeffprod.todo:id/fab")
    private WebElement clickOnAddTask;

    @FindBy(id = "com.jeffprod.todo:id/editTextTitre")
    private WebElement addTitle;

    @FindBy(id="com.jeffprod.todo:id/editTextNote")
    private WebElement addNote;

    @FindBy(id="com.jeffprod.todo:id/editTextTag")
    private WebElement addTag;

    @FindBy(id = "android:id/button1")
    private WebElement clickOnOkBtn;

    @FindBy(id="com.jeffprod.todo:id/action_save")
    private WebElement clickOnSave;

    public AddTaskPage(AndroidDriver driver)
    {
        super(driver);
    }

    public UpdateTaskPage addToDoTask(String title, String note)
    {
        clickOnAddTask.click();
        wait.until(ExpectedConditions.visibilityOf(addTitle));
        addTitle.sendKeys(title);
        wait.until(ExpectedConditions.visibilityOf(addNote));
        addNote.sendKeys(note);
        wait.until(ExpectedConditions.visibilityOf(addNote));
        addTag.click();
        driver.findElements(By.className("android.widget.CheckedTextView")).get(3).click();
        wait.until(ExpectedConditions.visibilityOf(clickOnOkBtn));
        clickOnOkBtn.click();
        wait.until(ExpectedConditions.visibilityOf(clickOnSave));
        clickOnSave.click();
        driver.navigate().back();
        return new UpdateTaskPage(driver);
    }
}
