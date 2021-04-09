import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class Testwork {
    @Test

    void Form () {
        open("https://demoqa.com/automation-practice-form");
        $x("//input[@placeholder='First Name']").setValue("Stas");
        $x("//input[@placeholder='Last Name']").setValue("Stasov");
        $x("//input[@placeholder='name@example.com']").setValue("Stasov@input.su");
        $x("//label[@for='gender-radio-2']").click();
        $x("//input[@id='userNumber']").setValue("9874520123");
        $x("//div[@id='dateOfBirth]").click();


        sleep(5000);
    }



    }

