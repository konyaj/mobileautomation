package nz.co.riharium.mobile.automation.calculator.steps;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import nz.co.riharium.mobile.automation.calculator.page.CalculatorHomePage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;


public class CalculatorSteps {

    private AndroidDriver<AndroidElement> driver;
    private CalculatorHomePage calculatorHomePage;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("deviceName", "emulator-5554");
        desiredCapabilities.setCapability("platformName", "android");
        desiredCapabilities.setCapability("appPackage", "com.google.android.calculator");
        desiredCapabilities.setCapability("appActivity", "com.android.calculator2.Calculator");
        desiredCapabilities.setCapability("noReset", true);

        URL remoteUrl = new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver<>(remoteUrl, desiredCapabilities);

        calculatorHomePage = new CalculatorHomePage(driver);
    }

    @Test
    public void assertAddition() {
//        (new TouchAction(driver)).tap(PointOption.point(314, 1243)).perform();
        calculatorHomePage.digit_5.click();
        calculatorHomePage.plusSign.click();
        calculatorHomePage.digit_6.click();
        calculatorHomePage.equalsSign.click();
        assertThat(calculatorHomePage.result.getText()).isEqualTo("11");
    }

    @Test
    public void assertSubstraction() {
        calculatorHomePage.digit_5.click();
        calculatorHomePage.minusSign.click();
        calculatorHomePage.digit_6.click();
        calculatorHomePage.equalsSign.click();
        assertThat(calculatorHomePage.result.getText()).isEqualTo("−1");
    }

    @Test
    public void assertMultiplication() {
        calculatorHomePage.digit_5.click();
        calculatorHomePage.multiplySign.click();
        calculatorHomePage.digit_6.click();
        calculatorHomePage.equalsSign.click();
        assertThat(calculatorHomePage.result.getText()).isEqualTo("30");
    }

    @Test
    public void assertDivision() {
        calculatorHomePage.digit_5.click();
        calculatorHomePage.divideSign.click();
        calculatorHomePage.digit_5.click();
        calculatorHomePage.equalsSign.click();
        assertThat(calculatorHomePage.result.getText()).isEqualTo("1");
    }



    @After
    public void tearDown() {
        driver.quit();
    }
}
