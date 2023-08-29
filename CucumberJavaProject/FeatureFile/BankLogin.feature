Feature: BankLogin


Scenario: Login With Valid Input

Given User navigate to banklogin page
When user enter valid username and valid password
Then user click login button
Then user goto login page


