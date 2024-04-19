package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RAHUL_AutomationPracticePage {

	private WebDriver driver;

    public enum PracticePageItems {

    	UsernameElement (By.xpath("//input[@id='user-name']"),
                     	"mUSERNAME Input"),
    	PasswordElement (By.xpath("//input[@id='password']"),
    					"PASSWORD Input"),
    	Radiobutton     (By.xpath("//input[@value='radio1'][1]"),
                        "radio1"),
        SuggestionInput (By.xpath("//input[@id='autocomplete']"),
                        "country"),
        LoginButton 	(By.xpath("//input[@id='login-button']"),
    					"LOGIN Button"),
    	Checkbox        (By.xpath("//*[@id='checkBoxOption3']"), //nazov xpath konkretizovt
                        "checkbox number 3 option"), // konkretizovat nazov anpr.option one chceckbox
        SelectedSlovakia (By.xpath("/html/body/ul/li/div"),
                        "slovakia (Slovak Republic)"),
        AlertBtn         (By.xpath("//*[@id='alertbtn']"),
                        "Alert"),
        Alert            (By.xpath("//input[@id='name']"), // cely zazov inputu konkretizovat
                        "name of alert - Hello Martin, share this practice page and share your knowledge"),
        SwitchTubExample (By.xpath("/html/head/title"),
                        "Rahul Shetty Academy"),
        OpenTab         (By.xpath("//*[@id='opentab']"),
                        "Open Tab"),
        ConfirmBtn      (By.xpath("//*[@id='confirmbtn']"),
                        "confirmbtn"),
        Openwindow       (By.xpath("//*[@id='openwindow']"),
                        "openWindow"),
        PageTitle 		(By.xpath("//html/head/title"),
    					"PAGE TITLE QA Click Academy Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy"), //konrektizovat nazvy, najst unikatny nazov,
    	DropdownExample (By.xpath("//select/option[@value='option2']"),
                        "option2"),
        showexample     (By.xpath("//*[@id='displayed-text']"),
                        "displayed-text"),
        ErrorMessage 	(null,
    					"ERROR Message"),
        hideelement     (By.xpath("//*[@id='hide-textbox']"),
                        "hide-textbox"),
        WebTableExample (By.xpath("//*[@id='product']/tbody/tr"),
                        "body"),
        WebTableFixedheader (By.xpath("//div[@class='tableFixHead']//table[@id='product']/tbody/tr"),
                        "position"),
        TableWebTableFixedheader (By.xpath("//div[@class='tableFixHead']//table[@id='product']/tbody"),
                "position"),
        mouseover        (By.xpath("//*[@id='mousehover']"),
                        "mouseover"),
        top              (By.xpath("//fieldset/div/div/a[1]"),
                        "top"),
        iframe          (By.xpath("//*[@id='courses-iframe']"),
                        "iframe_title"),
        printelement    (By.xpath("//div[@class='tableFixHead']//tbody//td[contains(text(),'Mumbai')]//parent::tr"),
                        "element mumbai"),
        Example         (By.xpath("//*[@id='dropdown-class-example']"),
                        "dropdown-class-example"),
        clickfulltext   (By.xpath("/html/body/ul/li/div"),
                        "click"),
        findsecondtitle (By.xpath("//*[contains (text(), 'Selenium,Jmeter')]"),
                        "control"),
        clickcountry    (By.xpath("/html/body/ul/li/div[@id='ui-id-17']"),
                        "clickcountry"),
        dropdownclassexample (By.xpath("//*[@id='dropdown-class-example']"),
                        "dropdownexample"),
        ConfirmSlovakiaButton  (By.xpath("//div[@id='ui-id-2']"),
                    "Confirm Slovakia choice"),
        RahulShettyImg    (By.xpath("//img[@src='assets/images/rs_logo.png']"),
                        "Image with Rahul Shetty text"),
        ;

    	private String description;
        private By findBy;

        private PracticePageItems (By findBy, String description) {
            this.description = description;
            this.findBy = findBy;
        }

        public String getDescription(){
            return description;
        }

        public By getLocator(){
            return findBy;
        }

        public WebElement getElement(WebDriver driver) {
        	return driver.findElement(getLocator());
        }
    }

    public RAHUL_AutomationPracticePage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getErrorMessageElement(String value) {
        return driver.findElement(getErrorMessageLocator(value));
    }

    public By getErrorMessageLocator(String value) {
    	//the following line is an example of how to create a dynamic xpath
        return By.xpath("//h3[@data-test='" + value + "']");
    }

}