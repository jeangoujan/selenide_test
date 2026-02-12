package pages;
import static com.codeborne.selenide.Selenide.open;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import com.codeborne.selenide.SelenideElement;

public class WebFormPage {
    public WebFormPage openWebFormPage(){
        open("/web-form.html");
        return this;
    }
    
    public SelenideElement title(){
        return $(".display-6");
    }

    public SelenideElement textInput(){
        return $(By.id("my-text-id"));
    }

    public SelenideElement textArea(){
        return $(By.name("my-textarea"));
    }

    public SelenideElement dropdownSelect(){
        return $(By.name("my-select"));
    }    

    public SelenideElement submitButton(){
        return $("button[type='submit']");
    }

    public SelenideElement receivedMessage(){
        return $("p.lead");
    }

    public SelenideElement disabledInput(){
        return $(By.name("my-disabled"));
    }

    public SelenideElement readOnlyInput(){
        return $(By.name("my-readonly"));
    }

    public SelenideElement checkedCheckbox(){
        return $(By.id("my-check-1"));
    }
}
