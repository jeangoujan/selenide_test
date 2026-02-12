package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


import Base.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import steps.LoginFormSteps;


@Epic("UI тесты")
@Feature("Логин форма")
public class LoginFormPageTests extends BaseTest {
    LoginFormSteps loginFormSteps = new LoginFormSteps();

    @Test
    @DisplayName("Тест успешного входа в систему")
    public void testSuccessLoginForm() {
        loginFormSteps.openLoginFormPage();
        loginFormSteps.loginProcess();
        loginFormSteps.submitLoginForm();
        loginFormSteps.shouldSeeSuccessMessageAfterLogin();
    }

    @Test
    @DisplayName("Тест неуспешного входа в систему с неверными учетными данными")
    public void testFailLoginForm() {
        loginFormSteps.openLoginFormPage();
        loginFormSteps.invalidLoginProcess("invalidUser", "invalidPass");
        loginFormSteps.submitLoginForm();
        loginFormSteps.shouldSeeFailMessageAfterLogin();
    }

    @Test
    @DisplayName("Тест неуспешного входа в систему без заполнения полей")
    public void testEmptyLoginForm() {
        loginFormSteps.openLoginFormPage();
        loginFormSteps.submitLoginForm();
        loginFormSteps.shouldSeeFailMessageAfterLogin();
    }

    @Test
    @DisplayName("Тест, что поле пароля имеет тип password")
    public void testPasswordFieldShouldHaveTypePassword() {
        loginFormSteps.openLoginFormPage();
        loginFormSteps.passwordFieldShouldHaveTypePassword();
    }
}
