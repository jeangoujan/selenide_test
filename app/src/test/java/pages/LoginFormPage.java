package pages;
import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.By;

import com.codeborne.selenide.SelenideElement;
import static com.codeborne.selenide.Selenide.$;


public class LoginFormPage {
    public LoginFormPage openLoginForm() {
        open("/login-form.html");
        return this;
    }

    public SelenideElement login(){
        return $(By.id("username"));
    }

    public SelenideElement password(){
        return $(By.id("password"));
    }

    public SelenideElement submitButton(){
        return $("button[type='submit']");
    }

    public SelenideElement successMessage(){
        return $(By.cssSelector("div#success"));
    }

    public SelenideElement failMessage(){
        return $(By.cssSelector("div#invalid"));
    }
}
