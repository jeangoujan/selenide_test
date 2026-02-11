package testdata;

import java.util.stream.Stream;

import org.junit.jupiter.params.provider.Arguments;



public class MenuData {
    public static Stream<Arguments> menuItems() {
        return Stream.of(
            Arguments.of("Web Form", "/web-form.html"),
            Arguments.of("Navigation", "/navigation1.html"),
            Arguments.of("Dropdown menu", "/dropdown-menu.html"),
            Arguments.of("Mouse over", "/mouse-over.html"),
            Arguments.of("Drag and drop", "/drag-and-drop.html"),
            Arguments.of("Draw in canvas", "/draw-in-canvas.html"),
            Arguments.of("Loading images", "/loading-images.html"),
            Arguments.of("Slow calculator", "/slow-calculator.html"),
            Arguments.of("Web Form", "/web-form.html"),
            Arguments.of("Login form", "/login-form.html"),
            Arguments.of("Slow login", "/login-slow.html"),
            Arguments.of("Long page", "/long-page.html"),
            Arguments.of("Infinite scroll", "/infinite-scroll.html"),
            Arguments.of("Shadow DOM", "/shadow-dom.html"),
            Arguments.of("Cookies", "/cookies.html"),
            Arguments.of("Dialog boxes", "/dialog-boxes.html"),
            Arguments.of("Web storage", "/web-storage.html"),
            Arguments.of("Geolocation", "/geolocation.html"),
            Arguments.of("Notifications", "/notifications.html"),
            Arguments.of("Get user media", "/get-user-media.html"),
            Arguments.of("Multilanguage", "/multilanguage.html"),
            Arguments.of("Console logs", "/console-logs.html"),
            Arguments.of("Random calculator", "/random-calculator.html"),
            Arguments.of("Download files", "/download.html"),
            Arguments.of("A/B Testing", "/ab-testing.html"),
            Arguments.of("Data types", "/data-types.html")
        );
    }
}
