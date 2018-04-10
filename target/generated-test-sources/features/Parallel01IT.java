import java.io.File;
import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.ExtentProperties;
import com.cucumber.listener.Reporter;
import com.csm.stepdefs.ScenarioHooks;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
        strict = true,
        features = {"C:/Users/clavios/eclipse-workspace/CSMAutomation/src/test/resources/features/Login.feature"},
        plugin = {"com.cucumber.listener.ExtentCucumberFormatter:C:/Users/clavios/eclipse-workspace/CSMAutomation/target/cucumber-parallel/1.html", "json:C:/Users/clavios/eclipse-workspace/CSMAutomation/target/cucumber-parallel/1.json", "html:C:/Users/clavios/eclipse-workspace/CSMAutomation/target/cucumber-parallel/1"},
        monochrome = false,
        
        tags = {"@onescenario"},
        glue = {"com.csm.stepdefs"})
public class Parallel01IT {
	
	@AfterClass
	public static void tearDown() throws IOException {
		Reporter.loadXMLConfig(new File("src/test/resources/extent-config.xml"));
        Reporter.setSystemInfo("user", System.getProperty("user.name"));
        Reporter.setSystemInfo("os", "Windows");
	}
}