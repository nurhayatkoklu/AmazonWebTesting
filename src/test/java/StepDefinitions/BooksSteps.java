package StepDefinitions;

import Pages.DialogContent;
import Utilities.GWD;
import Utilities.Tools;
import io.cucumber.java.en.*;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static Utilities.GWD.Bekle;
import static Utilities.GWD.driver;

public class BooksSteps {

    DialogContent dc = new DialogContent();

    @Then("Validate All Menu")
    public void validateAllMenu() {

        List<String> menuExpectedList = new ArrayList<>();
        menuExpectedList.add("All Departments");
        menuExpectedList.add("Arts & Crafts");
        menuExpectedList.add("Automotive");
        menuExpectedList.add("Baby");
        menuExpectedList.add("Beauty & Personal Care");
        menuExpectedList.add("Books");
        menuExpectedList.add("Boys' Fashion");
        menuExpectedList.add("Computers");
        menuExpectedList.add("Deals");
        menuExpectedList.add("Digital Music");
        menuExpectedList.add("Electronics");
        menuExpectedList.add("Girls' Fashion");
        menuExpectedList.add("Health & Household");
        menuExpectedList.add("Home & Kitchen");
        menuExpectedList.add("Industrial & Scientific");
        menuExpectedList.add("Kindle Store");
        menuExpectedList.add("Luggage");
        menuExpectedList.add("Men's Fashion");
        menuExpectedList.add("Movies & TV");
        menuExpectedList.add("Music, CDs & Vinyl");
        menuExpectedList.add("Pet Supplies");
        menuExpectedList.add("Prime Video");
        menuExpectedList.add("Software");
        menuExpectedList.add("Sports & Outdoors");
        menuExpectedList.add("Tools & Home Improvement");
        menuExpectedList.add("Toys & Games");
        menuExpectedList.add("Video Games");
        menuExpectedList.add("Women's Fashion");

        By menuFinder = By.xpath("//option[starts-with(@value,'search')]");
        List<WebElement> menuActualList = GWD.driver.findElements(menuFinder);

        Tools.compareToList(menuExpectedList, menuActualList);
    }

    @Given("Select item from select all menu")
    public void selectItemFromSelectAllMenu() {
        dc.findAndSelect("allSelectMenu", "Books");
    }

    @And("Verify seen to Best Sellers")
    public void verifySeenToBestSellers() {

        dc.scrollToElement(driver.findElement(By.linkText("Privacy Notice")));
        dc.findAndContainsText("booksHeader", "Best sellers");
    }

    @Then("Export books list to excel file")
    public void exportBooksListToExcelFile() throws IOException {

        // Best seller kısmındaki elementleri listeye atıyoruz
        List<WebElement> bestSellersList;
        bestSellersList = driver.findElements(By.id("gridItemRoot"));

        // Best Sellers List 'in tamamı DOM'a gelmiyodu (12'li gruplar halinde geliyodu)
        // waitVisibleListAllElement (Parent) fonksiyonunu kullansam bile 12 element dönüyo.
        // O yüzden, her gelen bi parça için, son elementen sonra, değişmeyecek bi elemente scroll yaptırmak zorunda kaldım:
        int n =0;
        do{
            dc.scrollToElement(dc.getMyElement("booksLastGroupElement"));
            GWD.Bekle(1);
            bestSellersList = driver.findElements(By.id("gridItemRoot"));
            n= bestSellersList.size();
        }while (n < 48);

        // Kontrol amaçlı konsola yazdırma işlemi
        for (WebElement items : bestSellersList) {
            System.out.println(items.getText() + "\n");
        }

        // hafızada  yeni workbook oluştur, sonra sheet oluştur
        XSSFWorkbook workbook = new XSSFWorkbook();
        XSSFSheet sheet = workbook.createSheet("BestSellersBooksList");

        // HAFIZADA satır ve hücre oluşturma ve yazma işlemelri yapılıyor
        Row yeniSatir = sheet.createRow(0); // satır oluşturuldu 0.yerde
        Cell yeniHucre = yeniSatir.createCell(0); // yeni satırda ilk hucre oluşturuldu

        // Siteden Listeye aldığımız verileri hafızadaki excel'e yazdırıyoruz.
        for (int i = 0; i < bestSellersList.size(); i++) {
            yeniHucre = sheet.createRow(i).createCell(0);
            yeniHucre.setCellValue(bestSellersList.get(i).getText());
        }

        // Yazma işlemini YAZMA modunda açıp öyle yapacağız. (Hafızadan, harddiske)
        FileOutputStream fos = new FileOutputStream("src/test/java/ExcelFiles/BooksList.xlsx");
        workbook.write(fos);
        workbook.close();
    }
}
