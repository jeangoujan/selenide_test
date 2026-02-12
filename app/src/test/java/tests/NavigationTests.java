package tests;
import steps.HomeSteps;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import io.qameta.allure.Epic;
import io.qameta.allure.Feature;

@Epic("UI тесты")
@Feature("Навигация")
public class NavigationTests {
    HomeSteps homeSteps = new HomeSteps();

    @ParameterizedTest
    @MethodSource("testdata.MenuData#menuItems")
    @DisplayName("Пункты меню ведут на корректные страницы")
    public void menuItemsLeadToCorrectPages(String menuItem, String expectedUrl) {
        homeSteps.openHomePage();
        homeSteps.navigateTo(menuItem);
        homeSteps.shouldBeOnPage(expectedUrl);
    }
}
