Feature: Login to SauceLabs

  Scenario: Successful login
    Given I open the browser and navigate to Saucelabs login page
    When enter  <username> and <password> 
    And I click the login button
    
    Examples: 
    |username|password|
    |Tester|test|
    |Raghava|12345|
    