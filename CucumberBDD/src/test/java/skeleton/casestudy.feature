Feature:Testme app login
Scenario:open to register the user
Given The URL of the app is "http://10.232.237.143:443/TestMeApp/RegisterUser.htm"
When user enters "akshaym" as UserName
And user enters "akshay" as FirstName
And user enters "m" as LastName
And user enters "123456789" as password
And user enters "123456789" as confirmpassword
And user selects "Male" as gender
And user enters "123@gmail.com" as email
And user enters "1234567891" as mobilenumber
And user enters "12/01/1997" as dob
And user enters "bangalore" as address
And user enters "what is your birth place" as security question
And user enters "ksd" as answer
And user clicks on register page
Then registered successfully

