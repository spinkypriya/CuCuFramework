Feature: Login to UPS home page

  Scenario Outline: UPS home page login POM
    Given Enter UPS home page URL POM
    And click on login POM
    And Click on Login hyperlink POM
    When user enters  POM <username> <password>
    Then login shoud be successfull.



    Examples: 
      | username  | password | 
      | "FMD_666" |  "Testing@123" |
      | "FMD_665" |  "Testing@123" |