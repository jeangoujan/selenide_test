package steps;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;

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
}
