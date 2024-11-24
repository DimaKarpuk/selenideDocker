import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class Tests extends TestBase {
     @Test
    public void simpleTest(){
         open("https://oz.by/");
         step("ref cookie",()->{
             $("[data-action='click->cookie-dialog#handleRejectClick']").click();
         });
     }
}
