package steps;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.disabled;
import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.WebDriverRunner.url;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.sql.Driver;

import testdata.WebFormTestData;

import io.qameta.allure.Step;
import pages.WebFormPage;

public class WebFormSteps {
    private final WebFormPage webFormPage = new WebFormPage();

    @Step("Пользователь открывает страницу с веб-формой")
    public void openWebForm(){
            webFormPage.openWebFormPage();
    }

    @Step("Пользователь видит заголовок страницы Веб-формы")
    public void checkWebFormTitleIsVisible(){
        webFormPage.title().shouldBe(visible).shouldHave(text("Web Form"));
    }

    @Step("Пользователь заполняет текстовое поле")
    public void fillTextInput(){
        webFormPage.textInput().setValue(WebFormTestData.TEXT_INPUT);
    }

    @Step("Пользователь заполняет поле Textarea")
    public void fillTextArea(){
        webFormPage.textArea().setValue(WebFormTestData.TEXTAREA_INPUT);
    }

    @Step("Пользователь выбирает первую опцию из выпадающего списка")
    public void selectDropdownOption(){
        webFormPage.dropdownSelect().selectOption(WebFormTestData.DROPDOWN_SELECT);
    }

    @Step("Пользователь отправляет форму")
    public void submitForm(){
        webFormPage.submitButton().click();
    }

    @Step("Пользователь видит, что форма была успешно отправлена")
    public void shouldSeeFormSubmitted(){
        webFormPage.receivedMessage().shouldBe(visible).shouldHave(text("Received!"));
    }

    @Step("Проверка, что Disabled поле недоступно для ввода")
    public void checkDisabledInputIsDisabled(){
        webFormPage.disabledInput().shouldBe(disabled).shouldHave(attribute("placeholder", "Disabled input"));
    }

    @Step("Проверка, что Readonly поле доступно только для чтения")
    public void checkReadOnlyInputIsReadOnly(){
        webFormPage.readOnlyInput().shouldHave(attribute("readonly"));
    }

    @Step("Проверка, что Checkbox с атрибутом checked отображается как отмеченный")
    public void shouldSeeCheckedCheckbox(){
        webFormPage.checkedCheckbox().shouldBe(visible).shouldHave(attribute("checked"));
    }
}
