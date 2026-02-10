package pages;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.$$;
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
    
}
