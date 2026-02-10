package pages;
import static com.codeborne.selenide.Selenide.open;


import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.$;

public class HomePage {

    public HomePage openPage(){
        open("/");
        return this;
    }

    public ElementsCollection menuLinks(){
        return $$("a.btn");
    }

    public SelenideElement siteLogo(){
        return $("img.img-fluid");
    }

    
}
