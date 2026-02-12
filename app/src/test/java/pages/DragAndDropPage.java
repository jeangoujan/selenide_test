package pages;
import static com.codeborne.selenide.Selenide.open;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.actions;





public class DragAndDropPage {
    public DragAndDropPage openDragAndDropPage() {
        open("/drag-and-drop.html");
        return this;
    }

    public SelenideElement draggableElement(){
        return $("#draggable");
    }

    public SelenideElement targetZone(){
        return $("#target");
    }

    public void dragAndDropElement() {
        actions().dragAndDrop(draggableElement(), targetZone()).perform();
    }
}
