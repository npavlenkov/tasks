
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class Testwork {
    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
    }

    @Test
    void Form() {
        String
                firstName ="Stas",
                lastName = "Stasov",
                userEmail = "Stasov@input.su";



        open("https://demoqa.com/automation-practice-form");
        $x("//input[@id='firstName']").setValue(firstName);
        $x("//input[@id='lastName']").setValue(lastName);
        $x("//input[@id='userEmail']").setValue(userEmail);
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
        $x("//input[@id='uploadPicture']").sendKeys("C://banner.png");
        $x("//textarea[@id='currentAddress']").setValue("shemisheika, stepnaya street");
        $x("//div[@class=' css-1wa3eu0-placeholder']").click();
        $x("//*[text()='NCR']").click();
        $x("//div[@class=' css-1wa3eu0-placeholder']").click();
        $x("//*[text()='Delhi']").click();
        $x("//button[@id='submit']").click();
        //$x("//div[@id='example-modal-sizes-title-lg']]").shouldHave(text("Thanks for submitting the form"));
        //Проверка формы
        //$x("//td[text()='Student Name')']").parent().shouldHave(text()firstName + " " + lastName");
        //$x("//td[text()='Student Email')']").parent().shouldHave(text()"Stasov@input.su");
        //$x("//td[text()='Gender')']").parent().shouldHave(text()"Stasov@input.su");
        //$x("//td[text()='Mobile')']").parent().shouldHave(text()"Stasov@input.su");
        //$x("//td[text()='Date of Birth')']").parent().shouldHave(text()"Stasov@input.su");
        //$x("//td[text()='Subjects')']").parent().shouldHave(text()"Stasov@input.su");
        //$x("//td[text()='Hobbies')']").parent().shouldHave(text()"Stasov@input.su");
        //$x("//td[text()='Picture')']").parent().shouldHave(text()"Stasov@input.su");
        //$x("//td[text()='Address')']").parent().shouldHave(text()"Stasov@input.su");
        //$x("//td[text()='State and City')']").parent().shouldHave(text()"Stasov@input.su");



        sleep(5000);
    }


}

