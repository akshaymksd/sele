Feature:Login
Scenario:open to login to the app
Given  user must login to "http://10.232.237.143:443/TestMeApp/loginhere.htm"
When user enters "akshaym" as Username
And user enters "123456789" as Password
Then user must login in home page
  