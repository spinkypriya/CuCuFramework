@SmokeFeature
Feature: Create Shipment
@smoketest
  Scenario: Create shipment for Delivery
    Given User lands in to UPS home Page
    And Navigate to Shipping Tab
    When Clicks on Create Create Shipment
    Then Land on the Ship Page creation
