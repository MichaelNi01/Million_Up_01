package Chou.Million_Up.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources/features/Million.feature", glue="Chou.Million_Up.definitions")//, tags= "@tag4")
//

public class Runner {

}
