Feature: Demo web shop login feature
@valid
  Scenario Outline: valid login for demo web shop
    Given The URL of the demo web shop is "http://demowebshop.tricentis.com/login"
    When user enters "<username>" as username
    And user enter "<password>" as password
    And user clicks on Login button
    Then user is a valid page
    
    Examples:
      | username          | password |
      | askmail@email.com | abc123   |
      | askmail@email.com | abc123   |
      | askmail@email.com | abc123   |

@invalid
	Scenario Outline: valid login for demo web shop
    Given The URL of the demo web shop is "http://demowebshop.tricentis.com/login"
    When user enters "<username>" as username
    And user enter "<password>" as password
    And user clicks on Login button
    Then user is a valid page
