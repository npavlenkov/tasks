
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Testwork {
    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;

    }

    String
            firstName = "Stas",
            lastName = "Stasov",
            userEmail = "Stasov@input.su",
            userNumber = "9874520123",
            picture = "banner.png",
            state = "NCR",
            city = "Delhi",
            hobby3 = "Music",
            Gender = "Female";


    @Test
    void Form() {


        open("https://demoqa.com/automation-practice-form");
        $x("//input[@id='firstName']").val(firstName);
        $x("//input[@id='lastName']").setValue(lastName);
        $x("//input[@id='userEmail']").setValue(userEmail);
        $x("//label[@for='gender-radio-2']").click();
        $x("//input[@id='userNumber']").setValue(userNumber);
        $x("//input[@id='dateOfBirthInput']").click();
        $x("//select[@class='react-datepicker__month-select']").click();
        $x("//option[@value='4']").click();
        $x("//select[@class='react-datepicker__year-select']").click();
        $x("//option[@value='1988']").click();
        $x("//div[@class='react-datepicker__day react-datepicker__day--011'] ").click();
        $x("//input[@id='subjectsInput']").setValue("Ar");
        $x("//*[text()='Arts']").click();
        $x("//input[@id='subjectsInput']").setValue("E");
        $x("//*[text()='English']").click();
        $x("//div[@id='hobbiesWrapper']//label[text()='"+hobby3+"']").click();
        $x("//input[@id='uploadPicture']").uploadFromClasspath("img/" + picture);
        $x("//textarea[@id='currentAddress']").setValue("shemisheika, stepnaya street");
        $x("//div[@id='state']").click();
        $x("//div[contains(@id,'react-select')][text()='" + state + "']").click();
        $x("//div[@id='city']").click();
        $x("//div[contains(@id,'react-select')][text()='" + city + "']").click();
        $x("//button[@id='submit']").click();
        $x("//div[@id='example-modal-sizes-title-lg']").shouldHave(text("Thanks for submitting the form"));
        //Проверка формы
        Assertions.assertEquals($x("//td[text()='Student Name']/parent::tr/td[2]").getText(), firstName + " " + lastName, "не найдено искомое");
        $x("//td[text()='Student Email']").parent().shouldHave(text(userEmail));
//        $x("//td[text()='Gender']").parent().shouldHave(text("Female"));
        Assertions.assertEquals($x("//td[text()='Gender']/parent::tr/td[2]").getText(), Gender);
        $x("//td[text()='Mobile']").parent().shouldHave(text(userNumber));
        $x("//td[text()='Date of Birth']").parent().shouldHave(text("11 May,1988"));
        $x("//td[text()='Subjects']").parent().shouldHave(text("Arts, English"));
        $x("//td[text()='Hobbies']").parent().shouldHave(text(hobby3));
        $x("//td[text()='Picture']").parent().shouldHave(text("banner"));
        $x("//td[text()='Address']").parent().shouldHave(text("shemisheika, stepnaya street"));
        $x("//td[text()='State and City']").parent().shouldHave(text("NCR Delhi"));


        sleep(5000);
    }


}

