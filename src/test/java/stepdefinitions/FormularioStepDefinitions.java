package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.example.task.CompleteForm;
import org.example.task.LogIn;
import org.example.question.SuccessHash;
import org.example.task.Navigate;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.CoreMatchers.containsString;

public class FormularioStepDefinitions {

    @Given("^el usuario está en la página de login$")
    public void elUsuarioEstáEnLaPáginaDeLogin() {
        OnStage.setTheStage(new OnlineCast());
        OnStage.theActorCalled("Usuario").wasAbleTo(Navigate.toLoginPage());
    }

    @When("^el usuario inicia sesión con sus credenciales$")
    public void elUsuarioIniciaSesiónConSusCredenciales() {
        OnStage.theActorInTheSpotlight().attemptsTo(LogIn.withCredentials("914453", "10df2f32286b7120MS00LTM1NDQxOQ==30e0c83e6c29f1c3"));
    }

    @When("^el usuario completa el formulario correctamente$")
    public void elUsuarioCompletaElFormularioCorrectamente() {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteForm.cycle());
    }

    @When("^repite el proceso por 10 ciclos$")
    public void repiteElProcesoPor10Ciclos() {
        OnStage.theActorInTheSpotlight().attemptsTo(CompleteForm.multipleCycles(10));
    }

    @Then("^el usuario debe obtener el hash de éxito$")
    public void elUsuarioDebeObtenerElHashDeExito() {
        OnStage.theActorInTheSpotlight().should(seeThat(SuccessHash.value(), containsString("Exitoso")));
    }
}