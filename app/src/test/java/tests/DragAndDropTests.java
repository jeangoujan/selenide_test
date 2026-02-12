package tests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import Base.BaseTest;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import steps.DragAndDropSteps;

@Epic("UI тесты")
@Feature("Drag and Drop")
public class DragAndDropTests extends BaseTest {
    

    @Test
    @DisplayName("Тест на успешное перетаскивание элемента")
    public void testDragAndDrop() {
        DragAndDropSteps dragAndDropSteps = new DragAndDropSteps();
        dragAndDropSteps.openDragAndDropPage();
        dragAndDropSteps.successfulDragAndDropElement();
    }
}
