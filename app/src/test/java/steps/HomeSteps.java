package steps;

import pages.HomePage;
import io.qameta.allure.Step;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Condition.visible;

public class HomeSteps {
    private final HomePage homePage = new HomePage();

    @Step("Пользователь открывает главную страницу")
    public void openHomePage(){
        homePage.openPage();
    }

    @Step("Пользователь видит, что все пункты меню кликабельны")
    public void checkMenuButtonAreClickable(){
        homePage
            .menuLinks()
            .forEach(link -> link.shouldBe(enabled));
    }

    @Step("Пользователь видит логотип сайта на главной странице")
    public void shouldSeeSiteLogo(){
        homePage.siteLogo().shouldBe(visible);
    }
}
