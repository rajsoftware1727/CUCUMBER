Feature: BankLogin

Scenario: Login With Valid Input

Given Am navigate to banklogin page
When Am enter valid "mngr514797" and "tujudan" password
Then Am click login button
Then Am goto login page