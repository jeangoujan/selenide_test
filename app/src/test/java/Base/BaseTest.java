package Base;

import static com.codeborne.selenide.Selenide.closeWebDriver;

import org.junit.jupiter.api.AfterEach;

public class BaseTest {
    
    @AfterEach
    void tearDown(){
        closeWebDriver();
    }
}
