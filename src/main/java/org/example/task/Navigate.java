package org.example.task;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

public class Navigate implements Task {

    private String url;

    public Navigate(String url) {
        this.url = url;
    }

    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url(url)
        );
    }

    public static Navigate toLoginPage() {
        return new Navigate("https://tasks.evalartapp.com/automatization/");
    }
}