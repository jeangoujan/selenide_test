package steps;

import io.qameta.allure.Step;

import static org.junit.jupiter.api.Assertions.assertNotEquals;

import java.time.Duration;


import org.openqa.selenium.Point;

import pages.DragAndDropPage;
import static com.codeborne.selenide.Selenide.Wait;

public class DragAndDropSteps {
    private final DragAndDropPage dragAndDropPage = new DragAndDropPage();

    @Step("Пользователь открывает страницу Drag and Drop")
    public void openDragAndDropPage() {
        dragAndDropPage.openDragAndDropPage();
    }

    @Step("Пользователь успешно перетаскивает элемент")  
    public void successfulDragAndDropElement() {
        Point before = dragAndDropPage.draggableElement().getLocation();
        dragAndDropPage.dragAndDropElement();
        Wait().withTimeout(Duration.ofSeconds(5))
          .until(d -> !dragAndDropPage.draggableElement().getLocation().equals(before));
        Point after = dragAndDropPage.draggableElement().getLocation();
        assertNotEquals(after, before);
    }

}
