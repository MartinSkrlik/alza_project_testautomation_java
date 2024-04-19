@test
Feature: Automation practice

  @Practise
  Scenario Outline: Pracitse all common test pracitcally used in test automation projects
    Given Open browser "<BROWSER>"
    When Go to page "<PAGE>"
    Then Search for product "phone"
    Then Select tab "#nejlepehodnocene"
    Then Remember name and price
    When Pick product "AlzaGuard Crystal Clear TPU Case for Samsung Galaxy A12" and buy
    Then Verify "<TEXT>" is visible
    Then Verify if product "<NAME>" is visible
    Then Click on button "Proceed to Checkout"
    Then Verify if "<FIRST_TITLE>" is present
    Then Verify product "<NAME>" is visible
    Then Verify product price "7.19 €" is visible
    Then Click on button "Continue"
    Then Verify "<SECOND_TITLE>" is present
    When Verify product "<NAME>" is visible
    Then Select radiobutton "Bratislava - main shop"
    Then Verify if "<POPUP_TITLE>" is visible on page
    Then Verify if checkbox is selected
    Then Select radiobutton "Confirm your selection"
    Then Verify "<SECOND_TITLE>" is present
    Then Verify product "<NAME>" is visible
    Then Verify checkbox is selected
    Then Verify if product price "7.19 €" is visible
    Then Click on button "Credit / Debit Card"
    Then Verify it is for "free"
    Then Click on button "Continue"
    When Verify if "<THIRD_TITLE>" is visible
    Then Verify product "<NAME>" is visible
    Then Verify if product price "7.19 €" is visible on page
    Then Verify delivery point "Bratislava - main shop" is visible
    Then Verify method payment "Credit / Debit Card" is visible
    Then Verify delivery method "free" is visible

    Examples:
      | BROWSER | PAGE | TEXT                   | NAME                                                                | FIRST_TITLE                   | POPUP_TITLE               | SECOND_TITLE                         | THIRD_TITLE                      |
      | Chrome  | alza | Product Added to Cart. | Phone Cover AlzaGuard Crystal Clear TPU Case for Samsung Galaxy A12 | Shopping Cart \| Alzashop.com | Bratislava - headquarters | Shipment and Payment \| Alzashop.com | Shipping address \| Alzashop.com |

  @CheckDetails
  Scenario Outline: Pracitse all common test pracitcally used in test automation projects
    Given Open browser "Chrome"
    When Go to page "alza"
    Then Search for product "tablet"
    Then Click on GPS checkbox
    Then Save the number of GPS
    Then Click on GPS checkbox
    Then Save product details of "Screenshield for NOKIA 3310 (2017) - display"
    Then Click on product "Screenshield for NOKIA 3310 (2017) - display"
    Then Save product details
    Then Compare details

    Examples:
      | BROWSER | PAGE |
      | Chrome  | alza |

  @CheckFavouriteList
  Scenario Outline: Pracitse all common test pracitcally used in test automation projects

    Given Open browser "Chrome"
    When Go to page "alza"
    Then Search for product "tablet"
    Then Select tab "#nejlepehodnocene"
    Then Save product details of "iPad Pro 11“ 256GB M1 Space Grey 2021"
    Then Add product to favourite list "iPad Pro 11“ 256GB M1 Space Grey 2021"
    When Refresh page
    Then Verify favourite icon is visible
    When Navigate to favourite list
    Then Save product details from favourite list
    Then Compare details with favourite list

    Examples:
      | BROWSER | PAGE |
      | Chrome  | alza |

  @CheckCart
  Scenario Outline: Pracitse all common test pracitcally used in test automation projects

    Given Open browser "Chrome"
    When Go to page "alza"
    Then Search for product "tablet"
    Then Click on product "Lenovo Tab M10 FHD Plus LTE Iron Grey"
    Then Close popup
    Then Add to cart
    Then Click on product "Umax VisionBook 7A 3G"
    Then Add to cart
    Then Click on product "iPad 10.2 64GB WiFi Silver 2021"
    Then Add to cart
    Then Navigate to cart tab
    Then Get price of products
    Then Compare prices
    Then Remove "Umax VisionBook 7A 3G" from cart
    Then Get price of products
    Then Compare prices

    Examples:
      | BROWSER | PAGE |
      | Chrome  | alza |

  @AlzaSiteCheck
  Scenario Outline: Pracitse all common test pracitcally used in test automation projects
    Given Open browser "<BROWSER>"
    When Go to page "<PAGE>"
    When If popup is present then close it
    Then Input product "tablet pro uplne zacatecniky [e-kniha]" into search bar and click search
    Then Click on "Top-Rated" tab
    Then Verify if "Top-Rated" is selected






    Examples:
      | BROWSER | PAGE |
      | Chrome  | alza |
