package com.kodilla.testing2.facebook;

import com.kodilla.testing2.config.WebDriverConfig;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class FacebookTestingApp {

    public static final String XPATH_SELECT_MONTH = "//div[contains(@class, \"_5k_5\")]/span/span/select[1]";
    public static final String XPATH_SELECT_DAY = "//div[contains(@class, \"_5k_5\")]/span/span/select[2]";
    public static final String XPATH_SELECT_YEAR = "//span[contains(@class, \"_5k_4\")]/span/select[3]";
    public static void main(String[] args) {
        WebDriver driver = WebDriverConfig.getDriver(WebDriverConfig.CHROME);
        driver.get("https://www.facebook.com/");


        WebElement selectMonth = driver.findElement(By.xpath(XPATH_SELECT_MONTH));
        Select sM = new Select(selectMonth);
        sM.selectByIndex(5);

        WebElement selectDay = driver.findElement(By.xpath(XPATH_SELECT_DAY));
        Select sD = new Select(selectDay);
        sD.selectByVisibleText("10");

        WebElement selectYear = driver.findElement(By.xpath(XPATH_SELECT_YEAR));
        Select sY = new Select(selectYear);
        sY.selectByValue("2002");

    }

}
