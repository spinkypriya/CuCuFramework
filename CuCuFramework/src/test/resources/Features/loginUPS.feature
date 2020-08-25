Feature: Login to UPS home page

  Scenario Outline: UPS home page login
    Given Enter UPS home page URL
    And click on login
    And Click on Login hyperlink
    When user enters <username> <password>
    Then login shoud be successfull.



    Examples: 
      | username  | password | 
      | "FMD_666" |  "Testing@123" |
      | "FMD_665" |  "Testing@123" |