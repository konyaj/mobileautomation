package nz.co.riharium.mobile.automation.calculator.page;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;

public class CalculatorHomePage {


  public final String id_base="com.google.android.calculator:id/";

    @AndroidFindBy(id=id_base + "digit_1")
    public MobileElement digit_1;
    @AndroidFindBy(id=id_base + "digit_2")
    public MobileElement digit_2;
    @AndroidFindBy(id=id_base + "digit_3")
    public MobileElement digit_3;
    @AndroidFindBy(id=id_base + "digit_4")
    public MobileElement digit_4;
    @AndroidFindBy(id=id_base + "digit_5")
    public MobileElement digit_5;
    @AndroidFindBy(id=id_base + "digit_6")
    public MobileElement digit_6;
    @AndroidFindBy(id=id_base + "digit_7")
    public MobileElement digit_7;
    @AndroidFindBy(id=id_base + "digit_8")
    public MobileElement digit_8;
    @AndroidFindBy(id=id_base + "digit_9")
    public MobileElement digit_9;
    @AndroidFindBy(id=id_base + "digit_0")
    public MobileElement digit_0;

    @AndroidFindBy(id=id_base + "op_add")
    public MobileElement plusSign;
    @AndroidFindBy(id=id_base + "op_sub")
    public MobileElement minusSign;
    @AndroidFindBy(id=id_base + "op_mul")
    public MobileElement multiplySign;
    @AndroidFindBy(id=id_base + "op_div")
    public MobileElement divideSign;
    @AndroidFindBy(id=id_base + "del")
    public MobileElement deleteSign;
    @AndroidFindBy(id=id_base + "eq")
    public MobileElement equalsSign;
    @AndroidFindBy(id=id_base + "dec_point")
    public MobileElement decimalSign;

    @AndroidFindBy(id=id_base + "result_final")
    public MobileElement result;

    private final AndroidDriver driver;

    public CalculatorHomePage(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }




}
