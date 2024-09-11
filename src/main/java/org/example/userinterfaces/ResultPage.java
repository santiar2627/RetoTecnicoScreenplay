package org.example.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class ResultPage {
    // Localizador para el campo donde aparece el hash de éxito
    public static final Target HASH_FIELD = Target.the("hash de éxito")
            .located(By.id("success-hash"));
}