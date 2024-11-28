import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class Tests extends TestBase {

     @Test
    public void simpleTest(){
         Configuration.headless=true;
         open("https://oz.by/");
         step("ref cookie",()->{
             $("[data-action='click->cookie-dialog#handleRejectClick']").click();
         });
     }


    @Test
    public void simple2Test(){
        Configuration.headless=true;
        open("https://oz.by/");
        step("ref cookie",()->{
            $("[data-action='click->cookie-dialog#handleRejectClick']").shouldHave(text("iiiiiii"));
        });
    }
}
