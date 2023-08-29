Feature: verify tags demo

@smoketest @regression
Scenario: verify tags demo
Given goto home page
Then  print something

@regression
Scenario: verify tags demo
Given goto1 home1 page1
Then  print1 something1

@smoketest
Scenario: verify tags demo
Given goto2 home2 page2
Then  print2 something2

