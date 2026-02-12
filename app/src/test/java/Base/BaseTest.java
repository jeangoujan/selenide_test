package Base;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;

public class BaseTest {
    
    @BeforeAll
    static void setup(){
        Configuration.headless = true;
        Configuration.browserSize = "1920x1080";
    }

    @AfterEach
    void tearDown(){
        closeWebDriver();
    }
}
