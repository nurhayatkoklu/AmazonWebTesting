package Utilities;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class Tools {
    public static void compareToList(List<String> menuExpectedList, List<WebElement> menuActualList) {

        for (int i = 0; i < menuExpectedList.size(); i++) {
            // System.out.println(menuActualList.get(i).getText());     //KONTROL AMAÇLI
            Assert.assertEquals(menuExpectedList.get(i), menuActualList.get(i).getText(), "Karşılaştırma sonucu: ");
        }
    }
}
