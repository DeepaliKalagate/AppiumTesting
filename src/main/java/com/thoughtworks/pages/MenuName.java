package com.thoughtworks.pages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuName extends BasePage
{
    public enum menuList
    {
        Completed, Scheduled, Trash;
    }
    menuList menuName;

    public MenuName(AndroidDriver driver, menuList name)
    {
        super(driver);
        this.menuName=name;
    }

    public void menuList()
    {
        switch (menuName)
        {
            case Scheduled:
                List<WebElement> elementsNavigate = driver.findElements(By.className("android.widget.ImageButton"));
                for(WebElement elementNavigate : elementsNavigate)
                {
                    if(elementNavigate.getAttribute("content-desc").equals("Open navigation drawer"))
                    {
                        elementNavigate.click();
                        break;
                    }
                }
                List<WebElement> elements = driver.findElements(By.className("android.widget.CheckedTextView"));
                for (WebElement element : elements)
                {
                    if (element.getAttribute("text").equals("Scheduled"))
                    {
                        element.click();
                        break;
                    }
                }
                break;
            case Completed:
                List<WebElement> elementsNavigate1 = driver.findElements(By.className("android.widget.ImageButton"));
                for(WebElement elementNavigate1 : elementsNavigate1)
                {
                    if(elementNavigate1.getAttribute("content-desc").equals("Open navigation drawer"))
                    {
                        elementNavigate1.click();
                        break;
                    }
                }
                List<WebElement> elements1 = driver.findElements(By.className("android.widget.CheckedTextView"));
                for (WebElement element1 : elements1)
                {
                    if (element1.getAttribute("text").equals("Completed"))
                    {
                        element1.click();
                        break;
                    }
                }
                break;
            case Trash:
                List<WebElement> elements2 = driver.findElements(By.className("android.widget.CheckedTextView"));
                for (WebElement element2 : elements2)
                {
                    if (element2.getAttribute("text").equals("Trash"))
                    {
                        element2.click();
                        break;
                    }
                }
                break;
        }
    }
}
