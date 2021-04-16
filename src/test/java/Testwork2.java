import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;

public class Testwork2 {
    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;

    }

    @Test
    void FormSelenide() {

        open("https://github.com/selenide/selenide");
        $x("//span[@data-content='Wiki']").click();
        $x("//div[@class=' js-wiki-sidebar-toggle-display']").shouldHave(text("SoftAssertions"));
        $x("//li[@class='Box-row'][last()]").scrollTo();
        $x("//li[@class='Box-row'][last()]").click();
        $x("//ol[@start='3']").scrollTo();
        $x("//ol[@start='3']").shouldHave(text("Using JUnit5 extend test class:"));


    }
}
