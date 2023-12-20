package Pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.Select;
import org.testng.asserts.Assertion;
import util.ElementHelper;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.beans.PropertyChangeListener;

public class HomePage {
    static WebDriver driver;
    util.ElementHelper elementHelper;

    By acceptcookies = By.xpath("//a[@class='cookie-policy__cta cookie-policy__cta--accept']");
    By clicksubeveatmarama = By.xpath("//span[contains(text(),'Şube / ATM Arama')]");

    By citycombobox = By.cssSelector("body > div.root.responsivegrid > div > div.responsivegrid.sub-page.aem-GridColumn.aem-GridColumn--default--12 > div > div.responsivegrid.content.aem-GridColumn--offset--tablet--0.aem-GridColumn--default--none.aem-GridColumn--phone--none.aem-GridColumn--phone--12.aem-GridColumn--tablet--none.aem-GridColumn--default--9.aem-GridColumn.aem-GridColumn--tablet--9.aem-GridColumn--offset--phone--0.aem-GridColumn--offset--default--0 > div > div.responsivegrid.content__content.aem-GridColumn--phone--none.aem-GridColumn--phone--12.aem-GridColumn--default--9.aem-GridColumn.aem-GridColumn--tablet--9.aem-GridColumn--offset--phone--0 > div > div > div > div.branchatmsearch.aem-GridColumn.aem-GridColumn--default--12 > div > div > div.atm-search__controls > div > form > div > div > div:nth-child(3) > div > div > div > span");
    By writecitytextbox = By.cssSelector("body > span > span > span.select2-search.select2-search--dropdown > input");
    By districtcombobox = By.xpath("/html/body/div[1]/div/div[3]/div/div[2]/div/div[2]/div/div/div/div[2]/div/div/div[1]/div/form/div/div/div[4]/div/div/div/span/span[1]/span/span[1]");
    By writedistricttextbox = By.xpath("/html/body/span/span/span[1]/input");
    By clicksearchbutton =By.cssSelector("body > div.root.responsivegrid > div > div.responsivegrid.sub-page.aem-GridColumn.aem-GridColumn--default--12 > div > div.responsivegrid.content.aem-GridColumn--offset--tablet--0.aem-GridColumn--default--none.aem-GridColumn--phone--none.aem-GridColumn--phone--12.aem-GridColumn--tablet--none.aem-GridColumn--default--9.aem-GridColumn.aem-GridColumn--tablet--9.aem-GridColumn--offset--phone--0.aem-GridColumn--offset--default--0 > div > div.responsivegrid.content__content.aem-GridColumn--phone--none.aem-GridColumn--phone--12.aem-GridColumn--default--9.aem-GridColumn.aem-GridColumn--tablet--9.aem-GridColumn--offset--phone--0 > div > div > div > div.branchatmsearch.aem-GridColumn.aem-GridColumn--default--12 > div > div > div.atm-search__controls > div > form > div > div > div:nth-child(8) > div > div > button");
    public HomePage(WebDriver driver) {
        HomePage.driver = driver;
        this.elementHelper = new ElementHelper(driver);

    }


    public void UserAtHomePage() {
        driver.get("https://www.halkbank.com.tr/");
    }

    public void AcceptCookies() {
        driver.findElement(acceptcookies).click();
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,2000)", "");
    }

    public void ClickSubeVeATMArama() {
        driver.findElement(clicksubeveatmarama).click();
        JavascriptExecutor jsx = (JavascriptExecutor) driver;
        jsx.executeScript("window.scrollBy(0,250)", "");
    }

    public void WriteCityTextboxAnkara()  {
        driver.findElement(citycombobox).click();
        driver.findElement(writecitytextbox).sendKeys("ANKARA", Keys.ENTER);
    }

    public void WriteDistrictTextboxGolbasi() {
        driver.findElement(districtcombobox).click();
        driver.findElement(writedistricttextbox).sendKeys("GÖLBAŞI", Keys.ENTER);
    }

    public void BranchIsSelectBranch()  {
       Select select = new Select(driver.findElement(By.xpath("//*[contains(@data-placeholder, 'Şube Tipi')]")));
       select.selectByVisibleText("Şube");
    }

    public void ClickSearchButton() {
        driver.findElement(clicksearchbutton).click();
    }
}







