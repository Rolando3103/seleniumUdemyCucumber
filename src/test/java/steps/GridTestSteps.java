package steps;

import cucumber.api.java.en.*;
import pages.GridPage;

public class GridTestSteps {
    GridPage grid = new GridPage();

    @Given("^i navigate to the static table$")
    public void navigateToGridPage(){
        grid.navigateToGrid(); 
    }
    @And("^I can return the value I wanted$")
        public void returnValue(){
        String value = grid.getValueFromGrid(3,2);

        System.out.println(value);
        }
    }  
