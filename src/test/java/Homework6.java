import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Selectors.byName;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import org.testng.Assert;


public class Homework6 {
    @BeforeTest
    public void openChrome() {
        open("https://www.google.com//");
    }
    @Test
    public void test1() {
        SelenideElement ser = $(byName("q")),
                ber =$(byText("Ima"));
        ser.setValue("sofo tugulashvili");
        Assert.assertFalse(ber.is(Condition.visible));
        Assert.assertEquals(ser.getValue(),"sofo tugulashvili","mesiji");
        sleep(50000);


    }

}
