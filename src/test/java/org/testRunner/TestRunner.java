package org.testRunner;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.base.Baseclass;
import com.utility.ReadExcelData;

import java.time.Duration;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class TestRunner extends Baseclass {

    public static void main(String[] args) {

        launchingBrowser("Chrome");
        launchingURL("https://www.youtube.com/");
        driver.manage().window().maximize();

        String inputkey = ReadExcelData.readParticularCellData(0, 0);
        
		driver.findElement(By.xpath("//input[@name='search_query']")).sendKeys(inputkey);
		driver.findElement(By.xpath("//button[@class='ytSearchboxComponentSearchButton']")).click();
		
		
		
		
        
    }
}
