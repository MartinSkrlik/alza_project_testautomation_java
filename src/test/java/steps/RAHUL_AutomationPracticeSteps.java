package steps;

import org.openqa.selenium.*;

import java.util.HashMap;
import java.util.List;

import cucumber.api.java.en.When;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.And;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.Keys;
import utility.Log;
import utility.ReportExtender;
import runner.TestRunner;

import static org.junit.Assert.assertNotNull;
import static page.RAHUL_AutomationPracticePage.PracticePageItems.*;
import utility.Validation;

public class RAHUL_AutomationPracticeSteps extends TestStepActions {

	static TestRunner TestRunner = new TestRunner();
	private static HashMap<String, Object> globalParametersMap = TestRunner.getGlobalParametersMap();
	private WebDriver driver = (WebDriver) globalParametersMap.get("driver");


	@Then("Verify main page title {string}")
	public void verify_main_page_title(String title) {
		waitForElementVisible(driver, PageTitle.getLocator(), PageTitle.getDescription(), 10);
		new Validation("PAGE TITLE", getElementText(PageTitle.getElement(driver), PageTitle.getDescription()), title).stringEquals();
		ReportExtender.logScreen(driver);
	}
	@When("In Radio button Example click radio button {string}")
	public void in_Radio_button_Example_click_radio_button(String radio) {
		clickElement(Radiobutton.getElement(driver), Radiobutton.getDescription());

	}
	@Then("Verify radio button {string} is selected")
	public void verify_radio_button_is_selected(String radio) {
		new Validation("checkbox is selected", verifyIsSelected(driver, Radiobutton.getLocator(), radio)).isTrue();
	}
	@When("Type country {string} Suggestion Class Example input")
	public void type_country_Suggestion_Class_Example_input(String country) {
		setElementTextAndWait(SuggestionInput.getElement(driver), country, SuggestionInput.getDescription(), 10);
		clickElement(ConfirmSlovakiaButton.getElement(driver), ConfirmSlovakiaButton.getDescription());
		//SuggestionInput.getElement(driver).sendKeys(Keys.DOWN); // klikat presne na element)(text)
		//SuggestionInput.getElement(driver).sendKeys(Keys.RETURN);
	}
	@Then("Verify country button {string} is selected")
	public void verify_country_button_is_selected(String country) {
		String premena = SuggestionInput.getElement(driver).getText();
		waitForElementVisible(driver, SuggestionInput.getLocator(), SuggestionInput.getDescription(), 10);
		new Validation("Slovakia (Slovak Republic)", getElementText(SuggestionInput.getElement(driver), SuggestionInput.getDescription()), premena).stringEquals();
		System.out.println(premena);
	}
	@When("From Dropdown Example select dropdown {string} option")
	public void from_Dropdown_Example_select_dropdown_option(String dropdown) {
		selectElementFromListByVisibleText(dropdownclassexample.getElement(driver), dropdown, dropdownclassexample.getDescription());
		Select dropDown = new Select(dropdownclassexample.getElement(driver));
		dropDown.selectByVisibleText(dropdown);
	}
	@Then("Verify {string} is selected")
	public void verify_is_selected(String dropdown) {
		verifyIsSelected(driver, DropdownExample.getLocator(), dropdown);
		new Validation("Option2", getElementText(DropdownExample.getElement(driver), DropdownExample.getDescription()), dropdown).stringEquals();
	    ReportExtender.logScreen(driver);
	}
	@When("In Checkbox Example select checkbox {string}")
	public void in_Checkbox_Example_select_checkbox(String checkbox) {
		checkCheckbox(Checkbox.getElement(driver), "checkbox");
	}
	@Then("Verify checkbox {string} is selected")
	public boolean verify_checkbox_is_selected(String checkbox) {
		//verifyIsSelected(driver, Checkbox.getLocator(), checkbox); // dat do podmienky if
		new Validation("checkbox is selected", verifyIsSelected(driver, Checkbox.getLocator(), checkbox)).isTrue();
	    if(driver.findElement(Checkbox.getLocator()).isSelected()) {
        	Log.info("Element is Selected");
        	return true;
        }
        else {
        	Log.info("Element is not Selected");
        	return false;
        }

	}
  @When("In Switch Window Example open new browser window")
	public void In_Switch_Window_Example_open_new_browser_window() {
		clickElement(Openwindow.getElement(driver), Openwindow.getDescription());
	}
	@When("Switch to new window")
	public void Switch_to_new_window() {
		switchToBrowserTab(driver, 2);
		ReportExtender.logScreen(driver);
	}
	@And("Verify window table {string}")
	public void verify_window_table(String WINDOW_TITLE) {
		waitForElementVisible(driver, findsecondtitle.getLocator(), findsecondtitle.getDescription(), 60);
		//driver.getTitle();
		//driver.getTitle().contains(window_table);
		String actualTitle = driver.getTitle();
		new Validation("PAGE TITLE", getElementText(findsecondtitle.getElement(driver), findsecondtitle.getDescription()), WINDOW_TITLE).stringEquals();
	}
	@And("Close window")
	public void close_window() {
		driver.close();
	}
	@And("Switch back to original window")
	public void switch_back_to_original_window() {
		switchToBrowserTab(driver, 1);
	}
	@When("In Switch Tab Example open new tab")
	public void in_switch_Tab_Example_open_new_tab() {
		clickElement(OpenTab.getElement(driver), OpenTab.getDescription());
		waitForElementVisible(driver, RahulShettyImg.getLocator(), RahulShettyImg.getDescription(), 10);
		//	waitForElementVisible(); //nahdoit si element a overit ci sa stranka otvorila // pop up element pockat
		ReportExtender.logScreen(driver); // pri kazdom zobrazeni verify
	}
	@And("Switch to new Tab")
	public void switch_to_new_tab() {
		switchToBrowserTab(driver, 2);
	}
	@Then("Verify page title {string}")
	public void verify_page_title(String tab_title) {
		waitForElementVisible(driver, SwitchTubExample.getLocator(), SwitchTubExample.getDescription(), 60);
		ReportExtender.logScreen(driver);
		driver.getTitle();
		driver.getTitle().contains(tab_title);
		String actualTitle = driver.getTitle();
		new Validation("PAGE TITLE", getElementText(SwitchTubExample.getElement(driver), SwitchTubExample.getDescription()), tab_title).stringEquals();
		ReportExtender.logScreen(driver);
	}
	@And("Close new tab")
	public void close_new_tab() {
		driver.close();
		switchToBrowserTab(driver, 1);
	}
	@When("In Switch To Alert Example enter your name {string} into Alert Example input")
	public void In_switch_To_Alert_Example_enter_your_name_into_Alert_example_input(String name) {
		waitForElementVisible(driver, Alert.getLocator(), Alert.getDescription(), 20);
		setElementText(Alert.getElement(driver), name, Alert.getDescription());
	}
	@And("Click Alert")
	public void Click_Alert() {
		clickElement(AlertBtn.getElement(driver), AlertBtn.getDescription());
	}

	@And("Compare actual text to expected {string}")
	public void Compare_actual_text_to_expected(String Alert) {
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		switchToAlert(driver);
		String alertText = driver.switchTo().alert().getText();
		new Validation("alert title", alertText, Alert).stringEquals();
		ReportExtender.logScreen(driver);
		acceptAlert(driver);
	}
	@When("In Switch To Alert Example enter your name {string} into Alert input")
	public void In_switch_To_Alert_Example_enter_your_name_into_Alert_input(String name) {
		waitForElementVisible(driver, Alert.getLocator(), Alert.getDescription(), 20);
		setElementText(Alert.getElement(driver), name, Alert.getDescription());
	}
	@And("Click Confirm {string}")
	public void Click_Confirm(String confirm) {
		clickElement(ConfirmBtn.getElement(driver), ConfirmBtn.getDescription());
		org.openqa.selenium.Alert alert = driver.switchTo().alert();
		switchToAlert(driver);
		String alertText = driver.switchTo().alert().getText();
		new Validation("alert title", alertText, confirm).stringEquals();
		ReportExtender.logScreen(driver);
		dismissAlert(driver);
	}
	@When("Verify input field is displayed")
	public void verify_input_field_is_displayed() {
		new Validation("checkbox is selected", verifyElementIsPresent(driver, showexample.getLocator(), showexample.getDescription())).isTrue();
	}
	@And("Click Hide")
	public void click_hide() {
		clickElement(hideelement.getElement(driver), hideelement.getDescription());
	}
	@And("Verify input field is not displayed")
	public void verify_input_field_is_not_displayed() {
		new Validation("checkbox is selected", !verifyElementIsPresent(driver, showexample.getLocator(), showexample.getDescription())).isFalse();
		ReportExtender.logScreen(driver);
		// ! neguje funkciu
	}
	@Then ("Verify Web Table Example contains rows")
	public void Verify_Web_Table_Example_contains_rows() {
		//driver.findElements(WebTableExample.getLocator()).size();
		Integer count = driver.findElements(WebTableExample.getLocator()).size();
		System.out.println(count);
		ReportExtender.logInfo(count + "");
		String s = Integer.toString(count);
		new Validation("count of rows", s, count).stringEquals();
		ReportExtender.logScreen(driver);
		// validacia porovnat integer s tym co mi vyslo // integer to string //
	}
	@When ("Verify Web Table Fixed Header is not empty")
	public void verify_web_Table_Fixed_Header_is_not_empty() {
		int num_rows;
		num_rows = (driver.findElements(WebTableFixedheader.getLocator()).size());
		ReportExtender.logInfo(num_rows + "");
		List<WebElement> BooksTable = driver.findElements(TableWebTableFixedheader.getLocator());
		int i = BooksTable.size();
		String xpath = "//div[@class='tableFixHead']//table[@id='product']/tbody/tr[";
		String end = "]";
		for (int j = 1; j <= i; j++) {
			String n = driver.findElement(By.xpath(xpath + j + end)).getText();
			if (n.isEmpty()) {System.out.println("There is empty row");ReportExtender.logInfo("there is empty row");}
			else {System.out.println("There is no empty row");ReportExtender.logInfo("there is no empty row");}
		}
	}
	@Then ("Get row from Web Table Fixed header which contains city {string}")
		public void get_row_from_Web_Table_Fixed_header_which_contains_city(String city) {
		driver.findElement(WebTableFixedheader.getLocator());
		//int count = driver.findElements(WebTableFixedheader.getLocator()).size();
		getElementText(printelement.getElement(driver), printelement.getDescription());
		//System.out.println(getElementText(printelement.getElement(driver), printelement.getDescription()));
	}
	@When ("In Mouse Hover Example hover mouse over Mouse Hover button")
	public void In_Mouse_Hover_Example_hover_mouse_over_Mouse_Hover_button() {
		mouseOverElementAndClick(driver, mouseover.getElement(driver), mouseover.getDescription());
		ReportExtender.generateLogAction(mouseover.getElement(driver), "Hover Mouse Over Element and Click", mouseover.getDescription());
    	assertNotNull(mouseover.getDescription());
		ReportExtender.logScreen(driver);
    	Actions builder = new Actions(driver);
    	builder.moveToElement(top.getElement(driver)).click(top.getElement(driver));
    	builder.perform();
		sleep(2000);
		ReportExtender.logScreen(driver);
	}
	@And ("Switch to iframe")
	public void switch_to_iframe()
	{
		driver.switchTo().frame(iframe.getElement(driver));
	}
	@Then ("Verify Actual iFrame title {string}")
	public void Verify_Actual_iFrame_title(String IFRAME_TITLE) {
		waitForElementVisible(driver, PageTitle.getLocator(), PageTitle.getDescription(), 10);
		new Validation("IFRAME_TITLE", getElementText(PageTitle.getElement(driver), PageTitle.getDescription()), IFRAME_TITLE).stringEquals();
		ReportExtender.logScreen(driver);
	}
	@Then ("close")
		public void close() {
		driver.close();
		}
	}

// switch to parent frame vracia do hlavneho frame
















