package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.GooglePage;

public class GoogleSteps {
    
    //creamos la isntancia de esa clase
GooglePage google = new GooglePage(); 

    @Given("^navego en google$") 
    public void navigateToGoogle(){
        google.navigateToGoogle();
        
        }
    @When("^busco algo$") 
    public void buscarCriterio(){
        google.enterSearchCriteria("Banco Santander");
    }
    @And("^click  en el boton search$") 
    public void enterBotonBuscar(){
        google.clickGoogleSearch();
    }
    @Then("^obtengo unos resultados$") 
    public void obtenerResultado(){

    }

}
