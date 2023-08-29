package Run;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(features="FeatureFile/BankLogin.feature",glue={"CucumberDemo"},
dryRun=true

)


public class Runner {
	
	 

}
