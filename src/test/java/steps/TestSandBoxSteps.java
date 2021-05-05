package steps;

import pages.TestSandBox;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;



public class TestSandBoxSteps {
     TestSandBox sandboxPage = new TestSandBox();

    @Given("^i navigate to the sandbox page$")   
    public void navigateToTheSandboxSite(){
            sandboxPage.navigateToSandbox(); 
    }
    @And("^select a value from the dropdown$")
        public  void selectState(){
            sandboxPage.selectCategory("Manual"); 
            
        }
}

