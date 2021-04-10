import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class Testwork {
    @BeforeAll
    static void setup(){
        Configuration.startMaximized = true;
    }
    @Test
    void Form() {
        open("https://demoqa.com/automation-practice-form");
        $x("//input[@placeholder='First Name']").setValue("Stas");
        $x("//input[@placeholder='Last Name']").setValue("Stasov");
        $x("//input[@placeholder='name@example.com']").setValue("Stasov@input.su");
        $x("//label[@for='gender-radio-2']").click();
        $x("//input[@id='userNumber']").setValue("9874520123");
        $x("//input[@id='dateOfBirthInput']").click();
        $x("//select[@class='react-datepicker__month-select']").click();
        $x("//option[@value='4']").click();
        $x("//select[@class='react-datepicker__year-select']").click();
        $x("//option[@value='1988']").click();
        $x("//div[@class='react-datepicker__day react-datepicker__day--005'] ").click();
        $x("//input[@id='subjectsInput']").setValue("Ar");
        $x("//*[text()='Arts']").click();
        $x("//input[@id='subjectsInput']").setValue("E");
        $x("//*[text()='English']").click();
        $x("//label[@for='hobbies-checkbox-3']").click();
        //$x("//input[@id='uploadPicture']").uploadFromClasspath("img/battletoads.zip");
        $x("//textarea[@id='currentAddress']").setValue("shemisheika, stepnaya street");
        $x("//div[@class=' css-1wa3eu0-placeholder']").click();
        $x("//*[text()='NCR']").click();
        $x("//div[@class=' css-1wa3eu0-placeholder']").click();
        $x("//*[text()='Delhi']").click();
        $x("//button[@id='submit']").click();




        sleep(5000);
    }


}

