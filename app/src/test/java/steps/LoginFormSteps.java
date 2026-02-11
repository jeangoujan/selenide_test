package steps;

import io.qameta.allure.Step;
import pages.LoginFormPage;

import static com.codeborne.selenide.Condition.attribute;
import static com.codeborne.selenide.Condition.visible;

import config.LoginCredentials;

public class LoginFormSteps {

    private final LoginFormPage loginFormPage = new LoginFormPage();

    @Step("Пользователь открывает страницу авторизации")
    public void openLoginFormPage() {
        loginFormPage.openLoginForm();
    }

    @Step("Пользователь вводит валидные учетные данные")
    public void loginProcess() {
        loginFormPage.login().setValue(LoginCredentials.USERNAME);
        loginFormPage.password().setValue(LoginCredentials.PASSWORD);
    }

    @Step("Пользователь вводит невалидные учетные данные")
    public void invalidLoginProcess(String username, String password) {
        loginFormPage.login().setValue(username);
        loginFormPage.password().setValue(password);  
    }

    @Step("Пользователь отправляет форму входа")
    public void submitLoginForm() {
        loginFormPage.submitButton().click();
    }

    @Step("Пользователь видит сообщение об успешном входе")
    public void shouldSeeSuccessMessageAfterLogin(){
        loginFormPage.successMessage().shouldBe(visible);
    }

    @Step("Пользователь видит сообщение об ошибке при неудачном входе")
    public void shouldSeeFailMessageAfterLogin(){
        loginFormPage.failMessage().shouldBe(visible);
    }

    @Step("Проверка, что поле пароля имеет тип password")
    public void passwordFieldShouldHaveTypePassword(){
        loginFormPage.password().shouldHave(attribute("type", "password"));
    }
}
