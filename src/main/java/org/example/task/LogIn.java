package org.example.task;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import org.example.userinterfaces.LoginPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LogIn implements Task {
    private final String username;
    private final String password;

    public LogIn(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(username).into(LoginPage.USERNAME_FIELD),
                Enter.theValue(password).into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }

    public static LogIn withCredentials(String username, String password) {
        return instrumented(LogIn.class, username, password);
    }
}