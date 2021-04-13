import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Testwork2 {
    @Test
    void FormSelenide() {

        open("https://github.com/selenide/selenide");
        $x("//a[@data-hotkey='g w']").click();

        $x("//a[contains(@href,'SoftAssertions')]").shouldHave(text("Soft Assertions"));
        $x("//a[contains(@href,'SoftAssertions')]").click();

        sleep(5000);


    }
}
