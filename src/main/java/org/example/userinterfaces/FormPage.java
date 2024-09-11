package org.example.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FormPage {
    public static Target TEXT_INPUT = Target.the("input de texto").located(By.id("text-input"));
    public static Target NUMERIC_INPUT = Target.the("input numérico").located(By.id("numeric-input"));
    public static Target CHECKBOX = Target.the("checkbox").located(By.id("checkbox"));
    public static Target RADIO_BUTTON = Target.the("radio button").located(By.id("radio-button"));
    public static Target SELECT_INPUT = Target.the("select input").located(By.id("select-input"));
    public static Target DATE_SELECTOR = Target.the("selector de fecha").located(By.id("date-selector"));
    public static Target SUBMIT_BUTTON = Target.the("botón de enviar").located(By.id("submit"));
}