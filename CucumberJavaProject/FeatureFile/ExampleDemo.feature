Feature: BankLogin

Scenario Outline: Login With INValid Input

Given I navigate to banklogin page
When I enter valid "<username>" and valid "<password>"
Then I click login button
Then I goto login page

Examples:
|username|password|
|admin1|admin1|
|admin2|admin2|

