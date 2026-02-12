package tests;
import static com.codeborne.selenide.Configuration.baseUrl;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

import com.codeborne.selenide.WebDriverRunner;
import Base.BaseTest;
import steps.WebFormSteps;



@Epic("UI тесты")
@Feature("Веб-форма")
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

    @Test
    @DisplayName("Пользователь успешно заполнил и отправил форму")
    void webFormSmokeTest(){
        webFormSteps.openWebForm();
        webFormSteps.fillTextInput();
        webFormSteps.fillTextArea();
        webFormSteps.selectDropdownOption();
        webFormSteps.submitForm();
        webFormSteps.shouldSeeFormSubmitted();
    }

    @Test
    @DisplayName("Пользователь успешно отправляет форму без заполнения полей")
    void webFormSubmitEmptyFieldsTest(){
        webFormSteps.openWebForm();
        webFormSteps.submitForm();
        webFormSteps.shouldSeeFormSubmitted();
    }

    @Test
    @DisplayName("Проверка, что Disabled поле недоступно для ввода")
    void checkDisabledInputIsDisabled(){
        webFormSteps.openWebForm();
        webFormSteps.checkDisabledInputIsDisabled();
    }

    @Test
    @DisplayName("Проверка, что Readonly поле доступно только для чтения")
    void checkReadOnlyInputIsReadOnly(){
        webFormSteps.openWebForm();
        webFormSteps.checkReadOnlyInputIsReadOnly();
    }

    @Test
    @DisplayName("Проверка, что 'Checked Checkbox' отмечен")
    void shouldSeeCheckedCheckbox(){
        webFormSteps.openWebForm();
        webFormSteps.shouldSeeCheckedCheckbox();
    }
}

