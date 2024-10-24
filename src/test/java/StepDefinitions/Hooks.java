package StepDefinitions;

import Utilities.GWD_old;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
//import Utilities.ExcelUtility;

public class Hooks {

    // Cucumbera ait her senaryodan sonra çalışan
    // Annotation
    @After
    public void after(Scenario senaryo) // Cucumberın ototmarik senaryo ile ilgili bilgiler değişkeni
    {
//        ExcelUtility.writeToExcel("src/test/java/ApachePOI/resource/CucumberTestSonuçlari.xlsx",
//                senaryo.getName(),
//                senaryo.isFailed() ? "Fail": "Passed";

        // aşağıdaki bölüm sadece extend report plugini devrede ise açılır
//        if (senaryo.isFailed()){
//            TakesScreenshot ts=((TakesScreenshot) GWD.getDriver());
//            byte[] hafizadakiHali=ts.getScreenshotAs(OutputType.BYTES);
//            senaryo.attach(hafizadakiHali, "image/png", "screenshot name");
//        }

        GWD_old.quitDriver();
    }

}
