package org.example.pages;

import static org.example.driver.Driver.getDriver;

import org.example.IdOfCalcElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import io.appium.java_client.AppiumBy;

public class CalculatorAppPage {

    private final WebDriver driver = getDriver();

//    private WebElement popUpAcceptElement = driver.findElement(AppiumBy.id("android:id/button1"));

    private WebElement inputField = driver.findElement(AppiumBy.id("my.android.calc:id/input"));

    private WebElement resultField = driver.findElement(AppiumBy.id("my.android.calc:id/result"));

    private String buttonPattern = "my.android.calc:id/%s";

    public String getResultFromInputField() {
        return inputField.getText();
    }

    public String getResultFromResultField() {
        return resultField.getText();
    }

    public CalculatorAppPage clickResult() {
        driver.findElement(AppiumBy.id(String.format(buttonPattern, IdOfCalcElements.RESULT))).click();
        return this;
    }

    public CalculatorAppPage clickOne() {
        driver.findElement(AppiumBy.id(String.format(buttonPattern, IdOfCalcElements.ONE))).click();
        return this;
    }

    public CalculatorAppPage clickPlus() {
        driver.findElement(AppiumBy.id(String.format(buttonPattern, IdOfCalcElements.PLUS))).click();
        return this;
    }

    public CalculatorAppPage closePopUpsIfExist() throws InterruptedException {
//        Thread.sleep(4000);
//        System.out.println(popUpAcceptElement.getText());
//        popUpAcceptElement.click();
        return this;
    }
}
