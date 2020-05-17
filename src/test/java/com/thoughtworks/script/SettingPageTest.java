package com.thoughtworks.script;
import com.thoughtworks.base.BaseTest;
import com.thoughtworks.pages.SettingPage;
import org.testng.annotations.Test;

public class SettingPageTest extends BaseTest
{
    @Test
    public void changeSettingOfApp() throws InterruptedException
    {
       SettingPage settingPage=new SettingPage(driver);
       settingPage.changeSetting();
    }
}
