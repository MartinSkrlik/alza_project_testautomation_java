package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class alzaPage {

    private WebDriver driver;

    public enum AlzaMainPage {

        SearchInput(By.xpath("//input[@id='edtSearch']"),
                "Field for search input"),
        IunderstandBtn(By.xpath("//div/a[@class='btnx cookies-info__button js-cookies-info-accept']"),
                "I Understand pop up button"),
        ClickSearchBtn(By.xpath("//div[@id='btnSearch']"),
                "Button for searching items"),
        ;

        private String description;
        private By findBy;

        private AlzaMainPage(By findBy, String description) {
            this.description = description;
            this.findBy = findBy;
        }

        public String getDescription() {
            return description;
        }

        public By getLocator() {
            return findBy;
        }

        public WebElement getElement(WebDriver driver) {
            return driver.findElement(getLocator());
        }

    }

    public enum ReslutForPhonePage {

        PickItemTxt(By.xpath("//div[2]/div/div[1]/div[1]/div[2]/a"),
                "Pick name of item"),
        PickItemPrice(By.xpath("//div[@data-code='AGDPCT0058']//span[@class='price-box__price']"),
                "Pick price of item"),
        ClickBuy(By.xpath("//div[@data-code='AGDPCT0058']//a[@class='btnk1']"),
                "Click buy button"),
        ;
        private String description;
        private By findBy;

        private ReslutForPhonePage(By findBy, String description) {
            this.description = description;
            this.findBy = findBy;
        }

        public String getDescription() {
            return description;
        }

        public By getLocator() {
            return findBy;
        }

        public WebElement getElement(WebDriver driver) {
            return driver.findElement(getLocator());
        }
    }

    public enum OverviewPage {

        ProceedToCheckoutBtn(By.xpath("//*[@id='varBToBasketButton']"),
                "Click proceed to checkout button"),
        ProductTxt(By.xpath("//div/a[@class='productInfo__texts__message']"),
                "text Product added to cart for verification"),
        ProductTypeTxt(By.xpath("//div/a[@class='productInfo__texts__productName']"),
                "Text of name of product for verification"),
        ;
        private String description;
        private By findBy;

        private OverviewPage(By findBy, String description) {
            this.description = description;
            this.findBy = findBy;
        }

        public String getDescription() { return description; }

        public By getLocator() {
            return findBy;
        }

        public WebElement getElement(WebDriver driver) {
            return driver.findElement(getLocator());
        }
    }

    public enum CartPage {

        CartTabTitle(By.xpath("//*[@id='rootHtml']/head/title"),
                "Title of frist tab - cart"),
        ProductNameTxt(By.xpath("//div/a[@class='mainItem']"),
                "Name of product for verification"),
        PriceOfProduct(By.xpath("//td[6][@class='c5']"),
                "Price of product for verification"),
        ;
        private String description;
        private By findBy;

        private CartPage(By findBy, String description) {
            this.description = description;
            this.findBy = findBy;
        }

        public String getDescription() {
            return description;
        }

        public By getLocator() {
            return findBy;
        }

        public WebElement getElement(WebDriver driver) {
            return driver.findElement(getLocator());
        }
    }

    public enum PaymentDeliveryPage {

        PaymentTabTitle(By.xpath("//head/title"),
                "Title of second tab - payment"),
        PaymentDeliveryTab(By.xpath("//li/span[@class='m m2 sel']"),
                "Name of payment delivery tab for verification"),
        ModelNameTxt(By.xpath("//span[@class='itemTitle']"),
                "Model Name"),
        PopUpTitleTxt(By.xpath("//div[@class='titleContent']"),
                "Bratislava headquarters text for verification"),
        StandardDispatchBtn(By.xpath("//input[@data-deliveryid='684' and @type='radio']"),
                "Standard Dispatch button"),
        ConfirmBtn(By.xpath("//a[@class='btnx normal green dialogButton confirmDialog']"),
                "Confirm your selection Btn"),
        BratislavaMainBtn(By.xpath("//input[@class='deliveryCheckbox hiddenAlzaCheckbox']"),
                "Bratislava main shop checkbutton"),
        ProductPriceTxt(By.xpath("//tr/td/span"),
                "Price of product text"),
        CreditCardBtn(By.xpath("//div[@id='paymentContainer-216']"),
                "Credit card select"),
        IdPaymentTab(By.xpath("//tr[@id='payment']"),
                "Verify is visible payment tab"),
        Freetxt(By.xpath("//span[@class='payment-price free']"),
                "text free for verification"),
        ;
        private String description;
        private By findBy;

        private PaymentDeliveryPage(By findBy, String description) {
            this.description = description;
            this.findBy = findBy;
        }

        public String getDescription() {
            return description;
        }

        public By getLocator() {
            return findBy;
        }

        public WebElement getElement(WebDriver driver) {
            return driver.findElement(getLocator());
        }
    }

    public enum AddressPage {

        ShippingTitle(By.xpath("//*[normalize-space()='Shipping address | Alzashop.com']"),
                "Shipping adress title"),
        PriceTxt(By.xpath("//div[@class='items']//td[3]/span"),
                "price of product"),
        BratislavaMainShopTxt(By.xpath("//div/*[contains(text(),'Bratislava - main shop')]"),
                "Text Bratislava main shop"),
        CreditCardText(By.xpath("//td/*[contains(text(),'Credit / Debit Card')]"),
                "Credit/debit card text"),
        TotalPriceTxt(By.xpath("//tr[@class='withVat']//td[2]/span"),
                "Sum of total price"),
        ;
        private String description;
        private By findBy;

        private AddressPage(By findBy, String description) {
            this.description = description;
            this.findBy = findBy;
        }

        public String getDescription() {
            return description;
        }

        public By getLocator() {
            return findBy;
        }

        public WebElement getElement(WebDriver driver) {
            return driver.findElement(getLocator());
        }
    }

    public enum Alza2 {

        NameProductTxt (By.xpath("//h1[@itemprop='name']"),
                "product name of element"),
        PriceProductTxt (By.xpath("//span[@class='price-box__price']"),
                "price of element"),
        DetailsProductTxt (By.xpath("//div[@class='nameextc']/span"),
            "details of product"),
        ElementForVerification (By.xpath("//img[@id='img5660350']"),
                "Element Img for verification"),
        GetOnFavourite (By.xpath("//div[@class='js-shopping-lists-select shoppingListsSelect']//label"),
                "Click on favourite checkbox"),
        HeartIconImg (By.xpath("//span[@class='alzaico-f-heart']"),
            "Click on heart icon"),
        NameOfProductTxt (By.xpath("//a[@class='name']"),
            "Name of product from favourite list"),
        ProductPriceTd (By.xpath("//span[@class='price']"),
            "Price of product from favourite list"),
        AvailabilitystatusTxt (By.xpath("//span[@class='avail avlVal avl4 variant']"),
            "Availability status of product"),
        GetAddtocartBtn (By.xpath("//*[contains(text(),'Add to Cart')]//parent::a"),
            "Click on button add to cart"),
        CloseChatBtn (By.xpath("//*[@id='chat-open-button']"),
            "Click on close chat button"),
        Favouritetxt (By.xpath("//span[text()[normalize-space() ='Favourites']]"),
            "favourite text fof verification"),
        ProductAddtoCartTxt (By.xpath("//a[text()[normalize-space() = 'Product Added to Cart.']] "),
            "Text product added to cart for verification"),
        AlzatitleTxt (By.xpath("//a[@title='Alza']"),
            "Alza title for verfication"),
        ClickCartIconImg (By.xpath("//span[text()[normalize-space() = 'Cart']]"),
            "Popup alza message icon"),
        ClosePopUP (By.xpath("//div[@class='vendor-close fa fa-times']"),
            "Close pop up personal window with click on x"),
        TitleNameCartTab (By.xpath("//title[text()[normalize-space() ='Shopping Cart | Alzashop.com']]"),
            "Name of cart tab for verificaton"),
        ;
        private String description;
        private By findBy;

        private Alza2(By findBy, String description) {
            this.description = description;
            this.findBy = findBy;
        }

        public String getDescription() {
            return description;
        }

        public By getLocator() {
            return findBy;
        }

        public WebElement getElement(WebDriver driver) {
            return driver.findElement(getLocator());
        }
    }

    public enum Alza4 {

        FirstProductPrice (By.xpath("//a[contains(text(),'Tablet Lenovo Tab M10 FHD Plus LTE Iron Grey')]//ancestor::tr//td[@class='c5']"),
            "Price of first product in cart"),
        SecondProductPrice (By.xpath("//a[contains(text(),'Tablet Umax VisionBook 7A 3G')]//ancestor::tr//td[@class='c5']"),
            "Price of second product in cart"),
        ThirdProductPrice (By.xpath("//a[contains(text(),'iPad 10.2 64GB WiFi Silver 2021')]//ancestor::tr//td[@class='c5']"),
            "Price of third product in cart"),
        ContinueButton (By.xpath("//*[@class='btnx normal green arrowedRight order2 js-button-order-continue']"),
            "Continue button for verification"),
        OptionsInnerMenu (By.xpath("//ul[@class='item-options__inner js-item-options-inner']"),
            "Options inner menu for verification"),
        FullPrice (By.xpath("//span[@class='last price']"),
            "Full price of product"),
        ClickonGPScheckBox (By.xpath("//label[@for='chb-topped-value-27445-218652466']"),
                "click on gps checkbox"),
        GetItemNumber (By.xpath("//div[@class='cpager left']/span"),
                "number of items"),
        GetRidOfPopUp (By.xpath("//div[@id='alzaDialog']//div[@class='close']"),
                "Pop up on the main page"),
        TopRatedTab (By.xpath("//a[contains(text(),'Top-Rated')]"),
                "Select top rated tab"),
        LoadingWheel (By.xpath("//span[contains(@class,'circle') and contains(@style,'none')]"),
                "Wait until loading wheel disappeared"),
        dfgdfg (By.xpath("//*[@id='tabs']/ul/li[4]"),
            "sdfsf")
        ;
        private String description;
        private By findBy;

        private Alza4(By findBy, String description) {
            this.description = description;
            this.findBy = findBy;
        }

        public String getDescription() {
            return description;
        }

        public By getLocator() {
            return findBy;
        }

        public WebElement getElement(WebDriver driver) {
            return driver.findElement(getLocator());
        }
    }

    public alzaPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getErrorMessageElement(String value) {
        return driver.findElement(getErrorMessageLocator(value));
    }

    public By getErrorMessageLocator(String value) {
        //the following line is an example of how to create a dynamic xpath
        return By.xpath("//h3[@data-test='" + value + "']");
    }

    public WebElement getInputElement(String text) { return driver.findElement(getInputLocator(text)); }
    public By getInputLocator(String text) {
        return By.xpath("//a[@href='" + text + "']");
    }

    public WebElement clickTextElement(String name) { return driver.findElement(clickTextElementLocator(name)); }
    public By clickTextElementLocator(String name) { return By.xpath("//span[normalize-space()='" + name + "']"); }

    public WebElement clickNameElement(String name) { return driver.findElement(clickNameElementLocator(name)); }
    public By clickNameElementLocator(String name) { return By.xpath("//*[normalize-space()='" + name + "']"); }

    public WebElement clickBuyElement(String name) { return driver.findElement(clickBuyElementLocator(name)); }
    public By clickBuyElementLocator(String name) { return By.xpath("//div[@id='boxes']/div[//*[contains(text(),'" + name + "')]]//*[contains(text(),'Buy')]"); }

    public WebElement clickOnProductElement(String name) { return driver.findElement(clickOnProductElementLocator(name));}
    public By clickOnProductElementLocator (String name) { return By.xpath("//a[normalize-space()='" + name + "']");}

    public WebElement getNameElement (String name) {return driver.findElement(getNameElementLocator(name));}
    public By getNameElementLocator (String name) {return By.xpath("//div[@class='fb']//a[@data-impression-name='" + name + "']");}

    public WebElement getDetailsElement (String name) {return driver.findElement(getDetailsElementLocator(name));}
    public By getDetailsElementLocator  (String name) {return By.xpath("//div[@class='fb']//a[@data-impression-name='" + name + "']//following-sibling::div");}

    public WebElement getPriceElement (String name) {return driver.findElement(getPriceElementLocator(name));}
    public By getPriceElementLocator  (String name) {return By.xpath("//div[@id='boxes']//*[normalize-space()='" + name + "']//parent::div//parent::div//parent::div//span[@class='price-box__price']");}

    public WebElement clickFavouriteElement (String name) {return driver.findElement(clickFavouriteElementLocator(name));}
    public By clickFavouriteElementLocator  (String name) {return By.xpath("//div[@id='boxes']//*[normalize-space()='" + name + "']//parent::*//span[@title='Add to favourites']");}

    public WebElement getAvailabilityElement (String name) {return driver.findElement(getAvailabilityElementLocator(name));}
    public By getAvailabilityElementLocator  (String name) {return By.xpath("//div[@id='boxes']//*[normalize-space()='" + name + "']//parent::div//parent::div//parent::div//div[@class='avl']/span");}

    public WebElement getPriceCartElement (String name) {return driver.findElement(getNameCartElementLocator(name));}
    public By getNameCartElementLocator  (String name) {return By.xpath("//a[normalize-space()='" + name + "']//ancestor::tr//td[@class='c5']");}

    public WebElement getItemOptionsElement (String name) {return driver.findElement(getItemOptionsElementLocator(name));}
    public By getItemOptionsElementLocator  (String name) {return By.xpath("//a[contains(text(),'" + name + "')]//ancestor::tr//td[@class='c6']//span[@class='item-options__trigger js-item-options-trigger']");}

    public WebElement getRemoveButtonElement (String name) {return driver.findElement(getRemoveButtonElementLocator(name));}
    public By getRemoveButtonElementLocator  (String name) {return By.xpath("//a[contains(text(),'" + name + "')]//ancestor::tr//td[@class='c6']//*[contains(text(),'Remove')]");}

    public WebElement ClickOnTabElement (String name) {return driver.findElement(ClickOnTabElementLocator(name));}
    public By ClickOnTabElementLocator (String name) {return By.xpath("//a[contains(text(),'" + name + "')]");}



}
