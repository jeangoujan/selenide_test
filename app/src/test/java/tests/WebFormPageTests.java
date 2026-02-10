package tests;
import static com.codeborne.selenide.Configuration.baseUrl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import io.qameta.allure.Epic;
import com.codeborne.selenide.WebDriverRunner;
import Base.BaseTest;
import steps.WebFormSteps;



@Epic("UI тесты страницы Веб-формы")
public class WebFormPageTests extends BaseTest {
    WebFormSteps webFormSteps = new WebFormSteps();

    @Test
    @DisplayName("Пользователь успешно открыл страницу Веб-формы")
    void openWebFormpage(){
        webFormSteps.openWebForm();
        assertEquals(baseUrl + "/web-form.html", WebDriverRunner.url());
    }

    @Test
    @DisplayName("Пользователь видит заголовок страницы Web-Form")
    void webFormTitleShouldBeVisible(){
        webFormSteps.openWebForm();
        webFormSteps.checkWebFormTitleIsVisible();
    }
}
