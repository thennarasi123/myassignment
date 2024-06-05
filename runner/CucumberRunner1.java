package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import steps.BaseClass;

@CucumberOptions(features={"src/test/java/features/Login.feature","src/test/java/features/EditLead.feature"},
                   glue="steps",
                   monochrome=true,
                   publish=true,
                   tags="@sanity and not @functional")
public class CucumberRunner1 extends BaseClass {

}
