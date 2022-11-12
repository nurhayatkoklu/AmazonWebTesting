package Runners;

import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;

@CucumberOptions(
        tags = "@Hankulu",
        features = {"src/test/java/FeatureFiles"},
        glue = {"StepDefinitions"}
)

@Listeners({ExtentITestListenerClassAdapter.class})
public class ComputersTestRunner extends AbstractTestNGCucumberTests {


    @AfterClass
    public static void writeExtendReport(){
        ExtentService.getInstance().setSystemInfo("User Name", "Bahriye Hankulu");
        ExtentService.getInstance().setSystemInfo("Application Name", "Amazon");
        ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
        ExtentService.getInstance().setSystemInfo("Department", "QA");
        ExtentService.getInstance().setSystemInfo("Ek Satır", "green tick test");
    }




}
