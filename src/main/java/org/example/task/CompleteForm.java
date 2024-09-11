package org.example.task;

import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Click;
import org.example.userinterfaces.FormPage;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class CompleteForm implements Task {

    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Texto de prueba").into(FormPage.TEXT_INPUT),
                Enter.theValue("12345").into(FormPage.NUMERIC_INPUT),
                Click.on(FormPage.CHECKBOX),
                Click.on(FormPage.RADIO_BUTTON),
                Click.on(FormPage.SUBMIT_BUTTON)
        );
    }

    public static CompleteForm cycle() {
        return instrumented(CompleteForm.class);
    }

    public static CompleteForm multipleCycles(int cycles) {
        return instrumented(CompleteForm.class, cycles);
    }
}

class MultipleCycles implements Task {
    private final int cycles;

    public MultipleCycles(int cycles) {
        this.cycles = cycles;
    }

    @Override
    public <T extends net.serenitybdd.screenplay.Actor> void performAs(T actor) {
        for (int i = 0; i < cycles; i++) {
            actor.attemptsTo(CompleteForm.cycle());
        }
    }
}