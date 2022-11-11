package Runners;

import com.aventstack.extentreports.service.ExtentService;
import com.aventstack.extentreports.testng.listener.ExtentITestListenerClassAdapter;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Listeners;

public class testRunner extends AbstractTestNGCucumberTests {


    @CucumberOptions(
            tags = "@Nurhayat",
            features = {"src/test/java/FeatureFiles"},
            glue = {"StepDefinitions"}
    )

    @Listeners({ExtentITestListenerClassAdapter.class})
    public class ExtentReports extends AbstractTestNGCucumberTests {
        @AfterClass
        public static void writeExtentReport() {
            ExtentService.getInstance().setSystemInfo("User Name", "Nurhayat");
            ExtentService.getInstance().setSystemInfo("Application Name", "amazon");
            ExtentService.getInstance().setSystemInfo("Operating System Info", System.getProperty("os.name").toString());
            ExtentService.getInstance().setSystemInfo("Department", "Automation Test Group");
            ExtentService.getInstance().setSystemInfo("Team Members", "8 Passionate Automation Testers");
        }



    }
}
