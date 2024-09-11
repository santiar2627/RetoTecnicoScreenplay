package org.example.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import org.example.userinterfaces.ResultPage;

import static net.serenitybdd.screenplay.questions.Text.of;

public class SuccessHash implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
        return of(ResultPage.HASH_FIELD).answeredBy(actor);
    }

    public static SuccessHash value() {
        return new SuccessHash();
    }
}