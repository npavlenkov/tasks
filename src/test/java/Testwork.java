import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class Testwork {
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
        //$x("//select[@class='react-datepicker__year-select']").click();
        $x("//div[@id='subjectsContainer']").setValue("Ar");



        sleep(5000);
    }


}

