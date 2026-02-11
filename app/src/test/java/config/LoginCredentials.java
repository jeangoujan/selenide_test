package config;

import java.util.Objects;

public class LoginCredentials {
    public static final String USERNAME = Objects.requireNonNull(System.getenv("LOGIN_USERNAME"), "Environment variable LOGIN_USERNAME is not set");
    public static final String PASSWORD = Objects.requireNonNull(System.getenv("LOGIN_PASSWORD"), "Environment variable LOGIN_PASSWORD is not set");
}
