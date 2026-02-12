package tests;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static com.codeborne.selenide.CollectionCondition.size;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import pages.HomePage;
import com.codeborne.selenide.WebDriverRunner;
import Base.BaseTest;
import static com.codeborne.selenide.Configuration.baseUrl;
import steps.HomeSteps;



@Epic("UI тесты")
@Feature("Главная страница")
public class HomePageTests extends BaseTest {
    HomeSteps homeSteps = new HomeSteps();

    @Test
    @DisplayName("Главная страница открывается корректно")
    void openHomePageTest(){
        homeSteps
            .openHomePage();
        assertEquals(baseUrl + "/", WebDriverRunner.url());
    }

    @Test
    @DisplayName("На главной странице отображается логотип сайта")
    void siteLogoShouldBeVisible(){
        homeSteps.openHomePage();
        homeSteps.shouldSeeSiteLogo();
    }
    
    @Test
    @DisplayName("Все пункты главного меню кликабельны")
    void menuButtonShouldBeClickable(){
        homeSteps.openHomePage();
        homeSteps.checkMenuButtonAreClickable();
    }

    @Test
    @DisplayName("На главной странице отображается 27 пунктов меню")
    void menuShouldContain27Buttons(){
        homeSteps.openHomePage();
        new HomePage().menuLinks().shouldHave(size(27));
    }


}
