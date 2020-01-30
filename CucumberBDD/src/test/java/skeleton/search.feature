Feature:example mapping
Scenario:search login
Given user should be in login page
When user enters valid credential and perform login
And clicks the search button and type the first four letters 
And select on the produc from the drop down
And clicks on the find details
And adds the product to cart
Then user should be in add to cart page
