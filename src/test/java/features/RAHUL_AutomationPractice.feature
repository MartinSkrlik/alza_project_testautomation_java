@test
Feature: Automation practice

  @Practise
  Scenario Outline: Pracitse all common test pracitcally used in test automation projects
    Given Open browser "<BROWSER>"
    When Go to page "<PAGE>"
#    Then Verify main page title "<TITLE>"
#    When In Radio button Example click radio button "<RADIO>"
#    Then Verify radio button "<RADIO>" is selected
#    When Type country "<COUNTRY>" Suggestion Class Example input
#    Then Verify country button "<COUNTRY>" is selected
#    When From Dropdown Example select dropdown "<DROPDOWN>" option
#    Then Verify "<DROPDOWN>" is selected
#    When In Checkbox Example select checkbox "<CHECKBOX>"
#    Then Verify checkbox "<CHECKBOX>" is selected
#    When In Switch Window Example open new browser window
#    When Switch to new window
#    And Verify window table "<WINDOW_TITLE>"
#    And Close window
#    And Switch back to original window
#    When In Switch Tab Example open new tab
#    And Switch to new Tab
#    Then Verify page title "<TAB_TITLE>"
#    And Close new tab
    When In Switch To Alert Example enter your name "<NAME>" into Alert Example input
    And Click Alert
    And Compare actual text to expected "<ALERT>"
#    When In Switch To Alert Example enter your name "<NAME>" into Alert input
#    And Click Confirm "<CONFIRM>"
#    When Verify input field is displayed
#    And Click Hide
#    And Verify input field is not displayed
#   # Then Verify Web Table Example contains rows
#    When Verify Web Table Fixed Header is not empty
#    Then Get row from Web Table Fixed header which contains city "<CITY>"
#    When In Mouse Hover Example hover mouse over Mouse Hover button
#    And  Switch to iframe
#    Then Verify Actual iFrame title "<IFRAME_TITLE>"
#    Then close
#
#
    Examples:
      | BROWSER | PAGE  | TITLE         | RADIO  | COUNTRY                    | DROPDOWN | CHECKBOX | WINDOW_TITLE                                                                           | TAB_TITLE            | NAME   | ALERT                                                           | CITY   | IFRAME_TITLE         | CONFIRM                                         |
      | Chrome  | rahul | Practice Page | radio1 | Slovakia (Slovak Republic) | Option2  | Option3  | QA Click Academy \| Selenium,Jmeter,SoapUI,Appium,Database testing,QA Training Academy | Rahul Shetty Academy | Martin | Hello Martin, share this practice page and share your knowledge | Mumbai | Rahul Shetty Academy | Hello Martin, Are you sure you want to confirm? |
#
#
#
#
#
