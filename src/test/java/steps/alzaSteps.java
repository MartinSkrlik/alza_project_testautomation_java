package steps;


//import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import cucumber.api.java.eo.Se;
//import org.openqa.selenium.By;
//import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.interactions.Actions;
//import org.openqa.selenium.support.ui.Select;
//import page.SAUCEDEMO_LoginPage;
import runner.TestRunner;
//import utility.Log;
import utility.ReportExtender;
import utility.Validation;

//import java.util.ArrayList;
import java.util.HashMap;
//import java.util.List;

import static org.junit.Assert.assertNotNull;
//import static page.RAHUL_AutomationPracticePage.PracticePageItems.*;
import static page.alzaPage.AlzaMainPage.*;
import static page.alzaPage.ReslutForPhonePage.*;
import static page.alzaPage.CartPage.*;
import static page.alzaPage.OverviewPage.*;
import static page.alzaPage.PaymentDeliveryPage.*;
import static page.alzaPage.AddressPage.*;
import static page.alzaPage.Alza2.*;
import static page.alzaPage.Alza4.*;
import page.alzaPage;
public class alzaSteps extends TestStepActions {

	static TestRunner TestRunner = new TestRunner();
	private static HashMap<String, Object> globalParametersMap = TestRunner.getGlobalParametersMap();
	private WebDriver driver = (WebDriver) globalParametersMap.get("driver");
	String title,price,details,secondtitle,secondprice,secondetails,availability,titleInFavouriteList,
	priceInFavouriteList,availabilityInFavouriteList,price1,price2,price3,price7;
	String  details1, details2,price5,price6;
	double number1, number2, number3, number4, number5, number6;
	double price4, price9;
	String price8, price10, price11;

	@Then("Search for product {string}")
	public void Search_for_product(String product) {
		waitForElementVisible(driver, IunderstandBtn.getLocator(), IunderstandBtn.getDescription(), 10);
		clickElement(IunderstandBtn.getElement(driver), IunderstandBtn.getDescription());
		waitForElementVisible(driver, SearchInput.getLocator(), SearchInput.getDescription(), 10);
		setElementText(SearchInput.getElement(driver), product, SearchInput.getDescription());
		clickElement(ClickSearchBtn.getElement(driver), ClickSearchBtn.getDescription());
		//waitForElementVisible(driver, FirstImageImg.getLocator(), FirstImageImg.getDescription(), 10);
	}
	@Then("Select tab {string}")
	public void Select_tab(String text) {
		alzaPage page = new alzaPage(driver);
		clickElement(page.getInputElement(text), "Select tab top-rated");
		waitForElementVisible(driver, ElementForVerification.getLocator(), ElementForVerification.getDescription(), 20);
	}

	@Then("Remember name and price")
	public void Remember_name_and_price() {
		getElementText(PickItemTxt.getElement(driver), PickItemTxt.getDescription());
		getElementText(PickItemPrice.getElement(driver), PickItemPrice.getDescription());
		String Price1 = driver.findElement(PickItemPrice.getLocator()).getText();
	}

	@When("Pick product {string} and buy")
	public void Pick_product_and_buy(String name) {
		alzaPage page = new alzaPage(driver);
		clickElement(page.clickBuyElement(name), ClickBuy.getDescription());
		waitForElementVisible(driver, ProceedToCheckoutBtn.getLocator(), ProceedToCheckoutBtn.getDescription(), 20);
	}

	@Then("Verify {string} is visible")
	public void Verify_is_visible(String text) {
		new Validation("Text visible", getElementText(ProductTxt.getElement(driver), ProductTxt.getDescription()), text).stringEquals();
		ReportExtender.logScreen(driver);
	}

	@Then("Verify if product {string} is visible")
	public void Verify_if_product_is_visible(String name) {
		new Validation("Text visible", getElementText(ProductTypeTxt.getElement(driver), ProductTypeTxt.getDescription()), name).stringEquals();
		ReportExtender.logScreen(driver);
	}

	@Then("Click on button {string}")
	public void Click_on_button(String id) {
		alzaPage page = new alzaPage(driver);
		clickElement(page.clickTextElement(id), ConfirmBtn.getDescription());
		//waitForElementVisible(driver, ContinueBtn.getLocator(), ContinueBtn.getDescription(), 10);
	}

	@Then("Verify if {string} is present")
	public void Verify_if_is_present(String first_title) {
		new Validation("TAB_TITLE", getElementText(CartTabTitle.getElement(driver), CartTabTitle.getDescription()).trim(), first_title).stringEquals();
		ReportExtender.logScreen(driver);
	}

	@Then("Verify product {string} and price is visible")
	public void Verify_product_and_is_visible(String name) {
		new Validation("Text visible", getElementText(ProductNameTxt.getElement(driver), ProductNameTxt.getDescription()), name).stringEquals();
		ReportExtender.logScreen(driver);

	}

	@Then("Verify product price {string} is visible")
	public void Verify_product_price_is_visible(String name) {
		String price = driver.findElement(PriceOfProduct.getLocator()).getText();
		new Validation("value of price", name, price).stringEquals();
		ReportExtender.logScreen(driver);
	}

	@Then("Verify {string} is present")
	public void Verify_second_tab_is_present(String second_title) {

		waitForElementVisible(driver, PaymentDeliveryTab.getLocator(), PaymentDeliveryTab.getDescription(), 10);
		new Validation("TAB_TITLE", getElementText(PaymentTabTitle.getElement(driver), PaymentTabTitle.getDescription()).trim(), second_title).stringEquals();
		ReportExtender.logScreen(driver);
	}

	@When("Verify product {string} is visible")
	public void Verify_product_name_is_visible(String name) {
		new Validation("MODEL NAME", getElementText(ModelNameTxt.getElement(driver), ModelNameTxt.getDescription()).trim(), name).stringEquals();
		ReportExtender.logScreen(driver);
	}

	@Then("Select radiobutton {string}")
	public void Click_on(String text) {
		alzaPage page = new alzaPage(driver);
		clickElement(page.clickNameElement(text), PopUpTitleTxt.getDescription());
		//waitForElementVisible(driver, PopUpTitleTxt.getLocator(), PopUpTitleTxt.getDescription(), 10);
	}

	@Then("Verify if {string} is visible on page")
	public void Verify_if_is_visible_on_page(String popup_title) {
		new Validation("Pop up title", getElementText(PopUpTitleTxt.getElement(driver), PopUpTitleTxt.getDescription()), popup_title).stringEquals();
		ReportExtender.logScreen(driver);
	}

	@Then("Verify if checkbox is selected")
	public void Verify_if_checkbox_is_selected() {
		new Validation("checkbox is selected", driver.findElement(StandardDispatchBtn.getLocator()).isSelected()).isTrue();
	}

	@Then("Again verify {string} is visible and product {string} is present")
	public void Again_verify_is_visible_and_product_is_present(String second_title, String model_name) {

		waitForElementVisible(driver, CreditCardBtn.getLocator(), CreditCardBtn.getDescription(), 10);
		new Validation("TAB_TITLE", getElementText(PaymentTabTitle.getElement(driver), PaymentTabTitle.getDescription()).trim(), second_title).stringEquals();
		new Validation("MODEL NAME", getElementText(ModelNameTxt.getElement(driver), ModelNameTxt.getDescription()).trim(), model_name).stringEquals();
		ReportExtender.logScreen(driver);
	}

	@Then("Verify checkbox is selected")
	public void Verify_checkbox_is_selected() {
		//globalParametersMap.put("")
		new Validation("checkbox is selected", driver.findElement(BratislavaMainBtn.getLocator()).isSelected()).isTrue();
	}

	@Then("Verify if product price {string} is visible")
	public void Verify_if_product_price_is_visible(String name) {
		String Price2 = driver.findElement(ProductPriceTxt.getLocator()).getText();
		new Validation("value of price", name, Price2).stringEquals();
	}

	@Then("Verify it is for {string}")
	public void Verify_it_is_for(String free) {

		waitForElementVisible(driver, IdPaymentTab.getLocator(), IdPaymentTab.getDescription(), 10);
		String text = getElementText(Freetxt.getElement(driver), Freetxt.getDescription());
		new Validation("Verify it is for free", text, free).stringEquals();
		ReportExtender.logScreen(driver);
	}

	@When("Verify if {string} is visible")
	public void Verify_if_is_visible(String third_title) {

		waitForElementVisible(driver, ShippingTitle.getLocator(), ShippingTitle.getDescription(), 10);
		new Validation("TAB_TITLE", getElementText(ShippingTitle.getElement(driver), ShippingTitle.getDescription()).trim(), third_title).stringEquals();
		ReportExtender.logScreen(driver);
	}

	@Then("Verify if product price {string} is visible on page")
	public void Verify_if_product_price_is_visible_on_page(String name) {
		String Price2 = driver.findElement(PriceTxt.getLocator()).getText();
		new Validation("value of price", name, Price2).stringEquals();
	}

	@Then("Verify delivery point {string} is visible")
	public void Verify_delivery_point_is_visible(String name) {
		String text = driver.findElement(BratislavaMainShopTxt.getLocator()).getText();
		new Validation("Check text", name, text).stringEquals();
	}

	@Then("Verify method payment {string} is visible")
	public void Verify_method_payment_is_visible(String name) {
		String text2 = driver.findElement(CreditCardText.getLocator()).getText();
		new Validation("Check text", name, text2).stringEquals();
	}

	@Then("Verify delivery method {string} is visible")
	public void Verify_delivery_method_is_visible(String name) {
		String free = Freetxt.getElement(driver).getText();
		new Validation("Verify it is for free", name, free).stringEquals();
		driver.close();
	}

	@Then("Click on product {string}")
	public void Click_on_product(String name) {
		alzaPage page = new alzaPage(driver);
		waitForElementVisible(driver, AlzatitleTxt.getLocator(), AlzatitleTxt.getDescription(), 10);
		clickElement(page.clickOnProductElement(name), "Click on product name");
		waitForElementVisible(driver, GetAddtocartBtn.getLocator(), GetAddtocartBtn.getDescription(),10);
		ReportExtender.logScreen(driver);
	}

	@Then("Save product details of {string}")
	public void Save_product_details_of(String name) {
		alzaPage page = new alzaPage(driver);

		secondtitle = getElementText(page.getNameElement(name), "title of product").trim();
		ReportExtender.logInfo(secondtitle);
		secondetails = getElementText(page.getDetailsElement(name), "details of product").strip();
		ReportExtender.logInfo(secondetails);
		secondprice = getElementText(page.getPriceElement(name), "price of product").trim();
		ReportExtender.logInfo(secondprice);
//		availability = getElementText(page.getAvailabilityElement(name), "availability on store information").trim();
//		ReportExtender.logInfo(availability);
	}

	@Then("Save product details")
	public void Save_product_details() {
		title = getElementText(NameProductTxt.getElement(driver), NameProductTxt.getDescription()).trim();
		details = getElementText(DetailsProductTxt.getElement(driver), DetailsProductTxt.getDescription().strip());
		ReportExtender.logInfo(details);
		price = getElementText(PriceProductTxt.getElement(driver), PriceProductTxt.getDescription()).trim();

	}

	@Then("Compare details")
	public void Compare_details() {

		details = details.trim();
		secondetails = secondetails.trim();
		details = details.stripTrailing();
		secondetails = secondetails.replaceAll(" ", "");

		new Validation("PRODUCT TITLE TEXT", title, secondtitle).stringEquals();
		new Validation("PRODUCT DETAILS TEXT", details, secondetails).contains();
		new Validation("PRODUCT PRICE TEXT", price, secondprice).stringEquals();
	}

	@Then("Add product to favourite list {string}")
	public void Add_product_to_favourite_list(String name) {
		alzaPage page = new alzaPage(driver);
		waitForElementVisible(driver,CloseChatBtn.getLocator(),CloseChatBtn.getDescription(), 10);
		clickElement(CloseChatBtn.getElement(driver), CloseChatBtn.getDescription());
		clickElement(page.clickFavouriteElement(name), "Click on add to favourite list");
		waitForElementVisible(driver, GetOnFavourite.getLocator(), GetOnFavourite.getDescription(), 10);
		checkCheckbox(GetOnFavourite.getElement(driver), GetOnFavourite.getDescription());

	}
	@Then ("Verify favourite icon is visible")
	public void Verify_favourite_icon_is_visible(){
		waitForElementVisible(driver,HeartIconImg.getLocator(),HeartIconImg.getDescription(),10);
	}

	@When("Refresh page")
	public void Refresh_page(){
		driver.navigate().refresh();
	}

	@When ("Navigate to favourite list")
	public void Navigate_to_favourite_list(){
		clickElement(HeartIconImg.getElement(driver), HeartIconImg.getDescription());
		waitForElementVisible(driver, Favouritetxt.getLocator(), Favouritetxt.getDescription(), 10);
		ReportExtender.logScreen(driver);
	}

	@Then("Save product details from favourite list")
	public void Save_product_details_from_favourite_list() {
		waitForElementVisible(driver, NameOfProductTxt.getLocator(), NameOfProductTxt.getDescription(), 10);
		titleInFavouriteList = getElementText(NameOfProductTxt.getElement(driver), NameOfProductTxt.getDescription().trim());
		ReportExtender.logInfo(titleInFavouriteList);
		priceInFavouriteList = getElementText(ProductPriceTd.getElement(driver), ProductPriceTd.getDescription().trim());
		ReportExtender.logInfo(priceInFavouriteList);
		availabilityInFavouriteList = getElementText(AvailabilitystatusTxt.getElement(driver), AvailabilitystatusTxt.getDescription().trim());
		ReportExtender.logInfo(availabilityInFavouriteList);
	}

	@Then("Compare details with favourite list")
	public void Compare_details_with_favourite_list() {

		new Validation("PRODUCT TITLE TEXT", titleInFavouriteList, secondtitle).stringEquals();
		new Validation("AVAILABILITY STATUS TEXT", availabilityInFavouriteList, availability).stringEquals();
		new Validation("PRODUCT PRICE TEXT", priceInFavouriteList, secondprice).stringEquals();
	}

	@Then("Add to cart")
	public void Add_to_cart() {
		waitForElementVisible(driver, GetAddtocartBtn.getLocator(), GetAddtocartBtn.getDescription(), 10);
		clickElement(GetAddtocartBtn.getElement(driver), GetAddtocartBtn.getDescription());
		ReportExtender.logScreen(driver);
		waitForElementVisible(driver, ProductAddtoCartTxt.getLocator(), ProceedToCheckoutBtn.getDescription(), 10);
		driver.navigate().back();
		driver.navigate().back();
	}
	@Then("Close popup")
	public void Close_popup() {
		waitForElementVisible(driver,ClosePopUP.getLocator(),ClosePopUP.getDescription(), 10);
		clickElement(ClosePopUP.getElement(driver), ClosePopUP.getDescription());
		}
	@Then ("Navigate to cart tab")
	public void Navigate_to_cart_tab() {
		clickElement(ClickCartIconImg.getElement(driver), ClickBuy.getDescription());
		waitForElementVisible(driver, TitleNameCartTab.getLocator(), TitleNameCartTab.getDescription(),10);
		ReportExtender.logScreen(driver);
	}

	@Then ("Get price of products")
	public void Get_price_of_products() {

		price1 = getElementText(FirstProductPrice.getElement(driver), FirstProductPrice.getDescription().replaceAll("€", "").replace("&nbsp;", ""));
		price2 = getElementText(SecondProductPrice.getElement(driver), SecondProductPrice.getDescription().replaceAll("€", "").replace("&nbsp;", ""));
		price3 = getElementText(ThirdProductPrice.getElement(driver), ThirdProductPrice.getDescription().replaceAll("€", "").replace("&nbsp;", ""));
		price7 = getElementText(FullPrice.getElement(driver), FullPrice.getDescription().trim());

		number1 = Double.parseDouble(price1);number2 = Double.parseDouble(price2);number3 = Double.parseDouble(price3);
		price4 = number1 + number2 + number3;
		double factor = 1e2F;
		double price9 = Math.round(price4 * factor) / factor;
		price8 = String.format("%.2f", price9);
	}

	@Then ("Compare prices")
	public void Compare_prices(){
		new Validation("FULL PRODUCT PRICE TEXT", price8+ " €", price7+ " €").stringEquals();
	}

	@Then ("Remove {string} from cart")
	public void Remove_from_cart(String name){
		alzaPage page = new alzaPage(driver);
		clickElement(page.getItemOptionsElement(name), "Click on options item button");
		waitForElementVisible(driver,OptionsInnerMenu.getLocator(), OptionsInnerMenu.getDescription(), 10);
		clickElement(page.getRemoveButtonElement(name), "Click on remove option");
		waitForElementVisible(driver, ContinueButton.getLocator(), ContinueButton.getDescription(), 10);
	}

	@Then ("Click on GPS checkbox")
	public void Click_on_GPS_checkbox() {
	checkCheckbox(ClickonGPScheckBox.getElement(driver),"click on checkbox" );
	}

	@Then ("Save the number of GPS")
	public void Save_the_number_of_GPS() {
	String gps = getElementText(GetItemNumber.getElement(driver), GetItemNumber.getDescription());
	}

	@Then("If popup is present then close it")
	public void ifPopupIsPresentThenCloseIt() {
		if (verifyElementIsPresent(driver,GetRidOfPopUp.getLocator(),GetRidOfPopUp.getDescription()))
		{clickElement(GetRidOfPopUp.getElement(driver),GetRidOfPopUp.getDescription());}
		if (verifyElementIsPresent(driver,IunderstandBtn.getLocator(),IunderstandBtn.getDescription()))
		{clickElement(IunderstandBtn.getElement(driver),IunderstandBtn.getDescription());}
	}

	@Then("Input product {string} into search bar and click search")
	public void inputProductIntoSearchBarAndClickSearch(String product_name) {
		waitForElementVisible(driver,SearchInput.getLocator(),SearchInput.getDescription(),10);
		setElementTextAndConfirm(SearchInput.getElement(driver),product_name,SearchInput.getDescription());
	}

	@Then("Click on {string} tab")
	public void clickOnTab(String tab_name) {
		alzaPage page = new alzaPage(driver);
		waitForElementVisible(driver,TopRatedTab.getLocator(),TopRatedTab.getDescription(),10);
		clickElement(page.ClickOnTabElement(tab_name), "Select tab");
		waitForElementVisible(driver,LoadingWheel.getLocator(),LoadingWheel.getDescription(),10);
	}

	public boolean attributeContains(By locator, String expected) {
		WebElement element = driver.findElement(locator);
		String result = element.getAttribute("class");
//		return result.contains(expected);
		return result.contains(expected);
	}

	@Then("Verify if {string} is selected")
	public void verifyIfIsSelected(String arg0) {
		attributeContains(dfgdfg.getLocator(),"active");
		new Validation("TAB_TITLE",attributeContains(dfgdfg.getLocator(),"active")).isTrue();
		boolean active = attributeContains(dfgdfg.getLocator(),"active");

	}
}













